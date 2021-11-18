package POO_Projeto;

public class Visitante extends Pessoa {

	private Boolean convite;
	private int horario;
	private String apto;
	
	public void entrar () {
		if (this.convite == true && this.horario<22 && this.horario < 6) {
			System.out.println("Pode entrar senhor");
		}else {
			System.out.println("Você não está autorizado para entrar!");
		}
	}
}
