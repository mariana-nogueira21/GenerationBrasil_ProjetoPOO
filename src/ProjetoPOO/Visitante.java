package ProjetoPOO;

public class Visitante extends Pessoa {

	private int convite;
	private int horario;
	private String apto;
	
	
	//Construtores
	
	public Visitante() {
		
	}
	public Visitante(String nome, int horario, int convite) {
		setNome(nome);
		setHorario(horario);
		setConvite(convite);	
	}
	
	
	
	public void entrar () {
		if (this.convite == 1 && this.horario < 22 && this.horario > 6) {
			System.out.println("Pode entrar senhor(a)");
		}else {
			System.out.println("Você não está autorizado para entrar!");
		}	
		
	}
	
	public void status () {
		System.out.println("----------------------");
		System.out.println("É Visitante");
		System.out.println("Nome: "+ this.nome);
		if(this.convite ==1)
		System.out.println("Convite: Sim");
		else 
			System.out.println("Convite: Não");
		if(this.horario > 6 && this.horario < 22) {
			System.out.println(this.horario + "h - horário permitido para visitas");
		} else {
			System.out.println(this.horario + "h - horário não permitido para visitas");
		}
		
	}

	
	//GETTERS E SETTERS
	
	public int getConvite() {
		return convite;
	}

	public void setConvite(int convite) {
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
