package list.OperacoesBasicas;

public class Tarefa {
	//atributo
	private String descricao;

	//construtor
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}

	//getters e setters
	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return descricao;
	}

}