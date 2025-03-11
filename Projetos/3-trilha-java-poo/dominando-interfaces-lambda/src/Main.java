import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import keyword.*;

public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("##### Interfaces #############################################");
		interfaces();
		System.out.println("##### Interfaces Funcionais #############################################");
		interfacesFuncionais();
		System.out.println("##### Entendento Keywords #############################################");
		entendentoKeywords();
	}

	// region Interfaces
	public static void interfaces() {
		MusicPlayer musicPlayer = new Computador();
		runMusic(musicPlayer);
		runVideo((VideoPlayer) musicPlayer);
	}

	public static void runVideo(VideoPlayer videoPlayer) {
		videoPlayer.playVideo();
	}

	public static void runMusic(MusicPlayer musicPlayer) {
		musicPlayer.playMusic();
	}
	// endregion

	// region Interfaces Funcionais
	public static void interfacesFuncionais() {
		List<User> users = List.of(
			new User("Maria", 21),
			new User("João", 32),
			new User("Eduardo", 40),
			new User("Ana", 19)
		);

		var consumer = new Consumer<User>() {
			@Override
			public void accept(final User user) {
				System.out.println(user);
			}
			// @Override
			// public Consumer<User> andThen(final Consumer<? super User> after) {
			// 	return Consumer.super.andThen(after);
			// }
		};
		users.forEach(consumer);
		System.out.println();

		// ou
		users.forEach((User user) -> { System.out.println(user); });
		System.out.println();

		// ou
		users.forEach(System.out::println);
		System.out.println();

		printStringValue(User::name, users);
		System.out.println();
		printStringValue(user -> String.valueOf(user.age()), users);
		System.out.println();
		printStringValue(Record::toString, users);
	}

	private static void printStringValue(Function<User, String> callback, List<User> users) {
		users.forEach(u -> System.out.println(callback.apply(u)));
	}
	// endregion

	// region Entendendo algumas keywords usadas
	public static void entendentoKeywords() {
		var client = new Client();
		client.setName("João");
		client.setStaticName("staticName");

		System.out.println(client.getName());
		System.out.println(client.getStaticName());

		System.out.println("==================");
		var client2 = new Client();
		// client2.setName("João 2");
		// client2.setStaticName("staticName 2");

		System.out.println(client2.getName());
		System.out.println(client2.getStaticName());
	}
	// endregion

}