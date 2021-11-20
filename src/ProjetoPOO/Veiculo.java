package ProjetoPOO;

public class Veiculo extends Morador {

	private int tem;
	private int vagas;
	private int sOun;

	// CONSTRUCTORS
	public Veiculo() {

	}

	public Veiculo(int temOuNao) {
		setTem(temOuNao);

	}

	public Veiculo(int sOUn, int aleatorio) {
		setsOun(sOUn);
	}

	// MÉTODOS
	public void automovel() {

		switch (this.sOun) {
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

	public void status() {

		if (this.sOun == 1) {

			System.out.println("Veículo: Carro");
		} else if (this.sOun == 2) {
			System.out.println("Veículo: Moto");
		} else if (this.sOun == 3) {
			System.out.println("Veículo: Bicicleta");
		} else {
			System.out.println("Não possui veículo.");
		}

	}

	// GETTERS E SETTERS
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

	public int getsOun() {
		return sOun;
	}

	public void setsOun(int sOun) {
		this.sOun = sOun;
	}

}