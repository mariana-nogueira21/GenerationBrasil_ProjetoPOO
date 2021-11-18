package ProjetoPOO;

public class Visitante extends Pessoa {

	private Boolean convite;
	private int horario;
	private String apto;
	
	
	//Construtores
	
	public Visitante() {
		
	}
	public Visitante(String nome, int horario, Boolean convite) {
		setNome(nome);
		setHorario(horario);
		setConvite(convite);	
	}
	
	
	
	public void entrar () {
		if (this.convite == true && this.horario < 22 && this.horario < 6) {
			System.out.println("Pode entrar senhor");
		}else {
			System.out.println("Você não está autorizado para entrar!");
		}	
		
	}

	
	//GETTERS E SETTERS
	
	public Boolean getConvite() {
		return convite;
	}

	public void setConvite(Boolean convite) {
		this.convite = convite;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public String getApto() {
		return apto;
	}

	public void setApto(String apto) {
		this.apto = apto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
