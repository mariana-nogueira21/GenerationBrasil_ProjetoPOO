package ProjetoPOO;

public class Veiculo extends Morador {
	
	private int tem;
	private int vagas;
	
	public Veiculo () {
		
	}
	
	public Veiculo (int temOuNao) {
		temOuNao = this.tem;
	}
	
	public void automovel () {	
		if (this.tem == 1) {
		
			System.out.println("Qual? 1- Carro 2- Moto 3- Bicicleta");
			
			switch (vagas) {
			case 1:
				System.out.println("Vagas livres: Subterrâneo - 2A, 2B, 4C, 6D");
			break;
			
			case 2:
				System.out.println("Vagas livres: Subterrâneo - 3A, 8C, 9F, 5E, 10G");
			break;
			
			case 3:
				System.out.println("Vagas livres: Terreas - 1B, 2A, 6D, 11F, 8G");
			break;
			
			}
		}
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	public int getTem() {
		return tem;
	}

	public void setTem(int tem) {
		this.tem = tem;
	}

}
