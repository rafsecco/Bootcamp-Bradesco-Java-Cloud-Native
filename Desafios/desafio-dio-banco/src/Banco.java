import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void listarClientes() {
		var listaNomesUnicos = contas.stream().map(conta -> conta.getCliente().getNome()).distinct();
		listaNomesUnicos.forEach(System.out::println);
	}

}
