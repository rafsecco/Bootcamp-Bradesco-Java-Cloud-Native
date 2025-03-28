import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AbautMe {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in).useLocale(Locale.getDefault());

			System.out.println("Digite seu nome");
			String nome = scanner.next();

			System.out.println("Digite seu sobrenome");
			String sobrenome = scanner.next();

			System.out.println("Digite sua idade");
			int idade = scanner.nextInt();

			System.out.println("Digite sua altura");
			double altura = scanner.nextDouble();
			scanner.close();

			// imprimindo os dados obtidos pelo usuario
			System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
			System.out.println("Tenho " + idade + " anos");
			System.out.println("Minha altura é " + altura + " cm");
		} catch (InputMismatchException ex) {
			System.err.println("Os campos idade e altura precisam ser numéricos");
		}
	}
}
