package dio_bootcamp.board;

import dio_bootcamp.board.persistence.migration.MigrationStrategy;
import dio_bootcamp.board.ui.MainMenu;

import java.sql.SQLException;

import static dio_bootcamp.board.persistence.config.ConnectionConfig.getConnection;

public class Main {

	public static void main(String[] args) {
		try (var connection = getConnection()) {
			var migrationStrategy = new MigrationStrategy(connection);
			migrationStrategy.executeMigration();
			new MainMenu().execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
