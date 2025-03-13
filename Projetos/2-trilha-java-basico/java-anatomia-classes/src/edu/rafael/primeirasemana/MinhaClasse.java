package edu.rafael.primeirasemana;
public class MinhaClasse {
	public static void main(String[] args) {
		System.out.println("Olá, mundo!");

		String nome = "Fulano";
		String sobrenome = "de Tal";
		String nomeCompleto = nomeCompleto(nome, sobrenome);
		System.out.println(nomeCompleto);
	}

	public static String nomeCompleto(String nome, String sobrenome) {
		return "Resultado do método " + nome.concat(" ").concat(sobrenome);
	}
}
