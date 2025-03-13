package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	//atrinuto
	private List<Tarefa> tarefaList;

	//construtor
	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for (Tarefa tarefa : tarefaList) {
			if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(tarefa);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}

	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}

	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}

	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
		listaTarefa.adicionarTarefa("Estudar Java");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 3");
		listaTarefa.adicionarTarefa("Tarefa 2");
		System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.removerTarefa("Tarefa 2");
		System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

		listaTarefa.obterDescricoesTarefas();
	}
}
