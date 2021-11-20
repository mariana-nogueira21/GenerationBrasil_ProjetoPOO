package ProjetoPOO;

import java.util.ArrayList;

public class Lista {

	ArrayList<Morador> listaDePessoas;
	ArrayList<Visitante> listaDeVisitantes;
	ArrayList<Funcionario> listaDeFuncionarios;

	public Lista() {
		this.listaDePessoas = new ArrayList<>();
		this.listaDeVisitantes = new ArrayList<>();
		this.listaDeFuncionarios = new ArrayList<>();
	}

	// MÉTODO PARA ADICIONAR MORADORES A LISTA
	public void insereMorador(Morador novoMorador) {
		listaDePessoas.add(novoMorador);
	}

	public void listarMoradores() {
		System.out.println("\nLista de Moradores");

		for (Morador moradorNaLista : listaDePessoas) {
			// ACESSAR MÉTODO LISTAR
			moradorNaLista.listar();
		}
	}

	// MÉTODOS VISITANTES
	public void insereVisitantes(Visitante novoVisitante) {
		listaDeVisitantes.add(novoVisitante);
	}

	public void listarVisitantes() {
		System.out.println("\nLista de Visitantes");

		for (Visitante novoVisitante : listaDeVisitantes) {
			// ACESSAR MÉTODO LISTAR
			novoVisitante.listar();
		}

	}

	// MÉSTODOS FUNCIONÁRIOS
	public void insereFuncionario(Funcionario novoFuncionario) {
		listaDeFuncionarios.add(novoFuncionario);
	}

	public void listarFuncionario() {
		System.out.println("\nLista de Funcionários");

		for (Funcionario novoFuncionario : listaDeFuncionarios) {
			// ACESSAR MÉTODO LISTAR
			novoFuncionario.listar();
		}

	}
}
