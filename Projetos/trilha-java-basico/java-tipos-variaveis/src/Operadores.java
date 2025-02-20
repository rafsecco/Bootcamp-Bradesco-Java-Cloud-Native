public class Operadores {
	public static void main(String[] args) {
		String nomeCompleto = "LINGUAGEM" + "JAVA";
		System.out.println(nomeCompleto);

		String concatenacao = "?";

		concatenacao = 1+1+1+"1";
		System.out.println(concatenacao);

		concatenacao = 1+"1"+1+1;
		System.out.println(concatenacao);

		concatenacao = 1+"1"+1+"1";
		System.out.println(concatenacao);

		concatenacao = "1"+1+1+1;
		System.out.println(concatenacao);

		concatenacao = "1"+(1+1+1);
		System.out.println(concatenacao);

		int numero = 5;
		System.out.println(- numero);
		System.out.println(numero);
		numero = - numero;
		System.out.println(numero);
		numero = numero * -1;
		System.out.println(numero);

		System.out.println(numero --);
		System.out.println(++numero);
		System.out.println(numero);

		boolean variavel = true;
		System.out.println(!variavel);
		variavel = !variavel;
		System.out.println(variavel);

		int a, b;
		a = 5;
		b = 6;
		String resultado = "";
		// if(a==b)
		// 	resultado = "verdadeiro";
		// else
		// 	resultado = "false";
		resultado = (a==b) ? "verdadeiro" : "falso";
		System.out.println(resultado);

		String nomeUm = "Rafael";
		// String numeDois = "Rafael";
		String nomeDois = new String("Rafael");
		System.out.println(nomeUm == nomeDois);
		System.out.println(nomeUm.equals(nomeDois));
		int numero1 = 1;
		int numero2 = 2;
		boolean simNao = numero1 == numero2;
		System.out.println("numeroUm é igual a numeroDois? " + simNao);
		simNao = numero1 != numero2;
		System.out.println("numeroUm é diferente a numeroDois? " + simNao);
		simNao = numero1 > numero2;
		System.out.println("numeroUm é maior a numeroDois? " + simNao);

		boolean condicao1 = true;
		boolean condicao2 = true;

		if (condicao1 && condicao2) {
			System.out.println("As duas condições são verdadeiras");
		}

		if (condicao1 || condicao2) {
			System.out.println("Uma das condições é verdadeiras");
		}

		if (condicao1 && (7 > 4)) {
			System.out.println("As duas condições são verdadeiras");
		}


	}
}
