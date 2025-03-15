package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {

	@Autowired
	private UserRepository repository;

	// @Override
	// public void run(String... args) throws Exception {
	// System.out.println("***** Criando Usuario
	// ************************************************************");
	// User user = new User();
	// user.setName("Rafael");
	// user.setUsername("rafael");
	// user.setPassword("123");
	// System.out.println("***** Salvando Usuario
	// ************************************************************");
	// repository.save(user);
	// System.out.println("***** Exibindo Usuarios
	// ************************************************************");
	// for (User u : repository.findAll()) {
	// System.out.println(u);
	// }
	// }

	@Override
	public void run(String... args) throws Exception {
		System.out.println("**********************************************************************");
		//List<User> users = repository.filtrarPorNome("Rafael");
		List<User> users = repository.findByNameContaining("Rafael");
		for (User u : users) {
			System.out.println(u);
		}
		System.out.println("**********************************************************************");
	}

	private void insertUser() {
		User user = new User();
		user.setName("Rafael Secco");
		user.setUsername("rafael");
		user.setPassword("rafael123");
		repository.save(user);

		for (User u : repository.findAll()) {
			System.out.println(u);
		}
	}
}
