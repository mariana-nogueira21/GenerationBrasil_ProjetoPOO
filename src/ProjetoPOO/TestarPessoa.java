package ProjetoPOO;

import java.util.Scanner;

public class TestarPessoa {

	public static void main(String[] args) {

		// CRIANDO VARIÁVEIS
		// MORADOR
		int opcao;
		String nome;
		int cadastro;
		// VEICULO
		int temOuNao;
		int sOUn;
		// VISITANTE
		int convite;
		int horario;
		// FUNCIONARIO
		int cracha;
		int cargo;

		// CRIANDO OBJETO COM O PRIMEIRO CONSTRUCTOR
		Morador m1 = new Morador();
		Veiculo veic = new Veiculo();
		Visitante v1 = new Visitante();
		Funcionario f1 = new Funcionario();

		Lista novaLista = new Lista();

		Scanner escreva = new Scanner(System.in);

		// CRIANDO O PROGRAMA
		do {
			System.out.println("\n-------------------------------");
			System.out.println("MENU");
			System.out.println("Escolha uma das opções");
			System.out.println("1 - Morador");
			System.out.println("2 - Visitante");
			System.out.println("3 - Funcionário");
			System.out.println("4 - Lista de Moradores");
			System.out.println("5 - Lista de Visitantes");
			System.out.println("6 - Lista de Funcionários");
			System.out.println("0 - SAIR");

			opcao = escreva.nextInt();
			escreva.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Nome: ");
				nome = escreva.nextLine();
				System.out.print("Cadastro? 1 - SIM / 2 - NÃO ");
				cadastro = escreva.nextInt();
				System.out.println("Tem veículo? 1-Sim/2-Não");
				temOuNao = escreva.nextInt();

				// PUXANDO CONSTRUCTOR E PARÂMETROS
				veic = new Veiculo(temOuNao);

				if (temOuNao == 1) {
					System.out.println("Qual? 1- Carro 2- Moto 3- Bicicleta");
					sOUn = escreva.nextInt();
					veic = new Veiculo(sOUn, 0);

					// PUXANDO MÉTODO
					veic.automovel();
				}

				// PUXANDO CONSTRUCTOR E PARÂMETROS
				m1 = new Morador(nome, cadastro);
				
				// PUXANDO MÉTODO
				m1.entrar();
				m1.status();
				veic.status();
				novaLista.insereMorador(m1);
				
				break;

			case 2:
				System.out.print("Nome: ");
				nome = escreva.nextLine();
				System.out.print("Horario da visita? ");
				horario = escreva.nextInt();
				System.out.print("Posui autorização do morador? 1 - SIM / 2 - NÃO");
				convite = escreva.nextInt();

				// PUXANDO CONSTRUCTOR E PARÂMETROS
				v1 = new Visitante(nome, horario, convite);
				
				// PUXANDO MÉTODO
				v1.entrar();
				v1.status();
				novaLista.insereVisitantes(v1);
				
				break;

			case 3:
				System.out.print("Nome: ");
				nome = escreva.nextLine();
				System.out.println("Qual sua função? 1-Porteiro / 2-Segurança / 3-Manutenção");
				cargo = escreva.nextInt();
				
				// PUXANDO CONSTRUCTOR E PARÂMETROS
				f1 = new Funcionario(cargo);
				f1.Cargo();

				System.out.print("Crachá? 1 - SIM / 2 - NÃO ");
				cracha = escreva.nextInt();
				// PUXANDO CONSTRUCTOR E PARÂMETROS
				f1 = new Funcionario(nome, cracha);
				f1.entrar();
				f1.status();
				novaLista.insereFuncionario(f1);

				break;

			case 4:
				novaLista.listarMoradores();
				break;
				
			case 5:
				novaLista.listarVisitantes();
				break;

			case 6:
				novaLista.listarFuncionario();
				break;
				
			case 0:
				System.out.println("Até mais senhor...");
				break;

			default:
				System.out.println("Opção inválida..");
			}

		} while (opcao != 0);
		
		escreva.close();

	}
	
}
