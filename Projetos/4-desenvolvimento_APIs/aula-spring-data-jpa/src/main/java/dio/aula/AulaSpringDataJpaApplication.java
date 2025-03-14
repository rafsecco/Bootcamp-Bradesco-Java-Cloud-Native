package dio.aula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaSpringDataJpaApplication {

	public static void main(String[] args) {
		System.out.println("***** Rodando App ************************************************************");
		SpringApplication.run(AulaSpringDataJpaApplication.class, args);
		System.out.println("Hello World!");
		System.out.println("*****************************************************************");
	}

}
