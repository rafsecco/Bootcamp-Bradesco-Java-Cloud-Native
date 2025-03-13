import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {

		// region Conta Rafael Secco
		Cliente cliente = new Cliente();
		cliente.setNome("Rafael Secco");

		Conta cc = new ContaCorrente(cliente);
		Conta cp = new ContaPoupanca(cliente);

		cc.depositar(250);
		cc.transferir(100, cp);

		cc.imprimirExtrato();
		cp.imprimirExtrato();
		// endregion

		// region Conta João Silva
		Cliente cliente2 = new Cliente();
		cliente2.setNome("João Silva");

		Conta cc2 = new ContaCorrente(cliente2);
		Conta cp2 = new ContaPoupanca(cliente2);

		cc2.depositar(550);
		cc2.transferir(300, cp2);

		cc2.imprimirExtrato();
		cp2.imprimirExtrato();
		// endregion

		// region Conta Maria Joaquina
		Cliente cliente3 = new Cliente();
		cliente3.setNome("Maria Joaquina");

		Conta cc3 = new ContaCorrente(cliente3);
		Conta cp3 = new ContaPoupanca(cliente3);

		cc3.depositar(250);
		cc3.transferir(100, cp3);

		cc3.imprimirExtrato();
		cp3.imprimirExtrato();
		// endregion

		// region Transferência Rafael Secco -> Maria Joaquina
		System.out.println("Transferência Rafael Secco -> Maria Joaquina");
		cc.transferir(50, cc3);
		cc.imprimirExtrato();
		cc3.imprimirExtrato();
		// endregion

		Banco banco = new Banco();
		banco.setNome("Itaú");
		banco.setContas(List.of(cc, cp, cc2, cp2, cc3, cp3));

		System.out.println("Clientes do banco " + banco.getNome());
		banco.listarClientes();
	}

}
