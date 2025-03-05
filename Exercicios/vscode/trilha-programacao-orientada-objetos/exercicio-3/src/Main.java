import java.util.Scanner;

public class Main {

	private final static Scanner scanner = new Scanner(System.in);
	private static PetMachine petMachine = new PetMachine();

	public static void main(String[] args) {
		var option = -1;

		do {
			System.out.println();  // Adiciona uma linha em branco
			System.out.println("#### Escolha uma das opções ####");
			System.out.println("1 - Dar banho no pet");
			System.out.println("2 - Abastecer a máquina com água");
			System.out.println("3 - Abastecer a máquina com shampoo");
			System.out.println("4 - Verificar água da máquina");
			System.out.println("5 - Verificar shampoo da máquina");
			System.out.println("6 - Verificar se tem pet no banho");
			System.out.println("7 - Colocar pet na máquina");
			System.out.println("8 - Retirar pet da máquina");
			System.out.println("9 - Limpar a máquina");
			System.out.println("0 - sair");
			System.out.println("#################################");
			option = scanner.nextInt();
			scanner.nextLine(); // Consumir a quebra de linha após nextInt()
			System.out.println();  // Adiciona uma linha em branco

			switch (option) {
				case 1 -> petMachine.takeAShower();
				case 2 -> addWater();
				case 3 -> addShampoo();
				case 4 -> verifyWater();
				case 5 -> verifyShampoo();
				case 6 -> checkIfHasPetInMachine();
				case 7 -> setPetInPetMachine();
				case 8 -> petMachine.removePet();
				case 9 -> petMachine.wash();
				case 0 -> System.exit(0);
				default -> System.out.println("Opção inválida");
			}

		} while (option != 0);

		scanner.close();
	}

	public static void addWater() {
		System.out.println("Tentando colocar água na máquina");
		petMachine.addWater();
	}

	public static void addShampoo() {
		System.out.println("Tentando colocar shampoo na máquina");
		petMachine.addShampoo();
	}

	public static void verifyWater() {
		var amount = petMachine.getWater();
		System.out.println("A máquina está no momento com " + amount + " litro(s) de água.");
	}

	public static void verifyShampoo() {
		var amount = petMachine.getShampoo();
		System.out.println("A máquina está no momento com " + amount + " litro(s) de shampoo.");
	}

	public static void checkIfHasPetInMachine() {
		var hasPet = petMachine.hasPet();
		System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
	}

	public static void setPetInPetMachine() {
		var name = "";
		while (name == null || name.isEmpty()) {
			System.out.println("Informe o nome do pet");
			name = scanner.nextLine();
		}
		var pet = new Pet(name);
		petMachine.setPet(pet);
	}
}
