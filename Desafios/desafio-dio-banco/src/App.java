public class App {
	public static void main(String[] args) throws Exception {

		Cliente cliente = new Cliente();
		cliente.setNome("Fulano de Tal");

		Conta cc = new ContaCorrente(cliente);
		Conta cp = new ContaPoupanca(cliente);

		cc.depositar(250);
		cc.transferir(100, cp);

		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

	///incluir o Lombok ao projeto para reduzir sua verbosidade de código
}
