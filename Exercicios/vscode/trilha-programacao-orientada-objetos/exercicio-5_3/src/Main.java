import java.util.Scanner;

public class Main {
	private final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int option = -1;

		do {
			System.out.println();  // Adiciona uma linha em branco
			System.out.println("Escolha a forma geométrica para calcular a área:");
			System.out.println("1 - Quadrado");
			System.out.println("2 - Retângulo");
			System.out.println("3 - Círculo");
			System.out.println("4 - Sair");
			option = scanner.nextInt();
			scanner.nextLine(); // Consumir a quebra de linha após nextInt()
			System.out.println();  // Adiciona uma linha em branco

			switch (option) {
				case 1 -> System.out.println("O resultado do cálculo da área foi: "+ createSquare().getArea());
				case 2 -> System.out.println("O resultado do cálculo da área foi: "+ createRectangle().getArea());
				case 3 -> System.out.println("O resultado do cálculo da área foi: "+ createCircle().getArea());
				case 4 -> System.exit(0);
				default -> System.out.println("Opção inválida");
			}
		} while (option != 4);
		scanner.close();
	}

	private static GeometricForm createSquare() {
		System.out.println("Informe o tamanho dos lados:");
		var side = scanner.nextDouble();
		return new Square(side);
	}

	private static GeometricForm createRectangle() {
		System.out.println("Informe a base:");
		var base = scanner.nextDouble();
		System.out.println("Informe a altura:");
		var height = scanner.nextDouble();
		return new Rectangle(height, base);
	}

	private static GeometricForm createCircle() {
		System.out.println("Informe o raio:");
		var radius = scanner.nextDouble();
		return new Circle(radius);
	}
}
