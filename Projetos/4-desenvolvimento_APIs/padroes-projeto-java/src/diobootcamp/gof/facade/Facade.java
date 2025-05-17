package diobootcamp.gof.facade;

import diobootcamp.crm.CrmService;
import diobootcamp.cep.CepApi;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);

		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
