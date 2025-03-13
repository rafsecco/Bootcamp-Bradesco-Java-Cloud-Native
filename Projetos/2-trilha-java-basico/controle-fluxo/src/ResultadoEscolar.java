public class ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 7;

		if (nota >= 7)
			System.out.println("Aprovado");
		else if (nota >= 5 && nota <7)
			System.out.println("Prova de recuperação");
		else
			System.out.println("Reprovado");

		String resultado = nota >= 7 ? "Aprovado":"Reprovado";
		System.out.println(resultado);

		String resultado2 = nota >= 7
			? "Aprovado"
			: nota >= 5 && nota < 7
				? "Prova de recuperação"
				: "Reprovado";
		System.out.println(resultado2);
	}
}
