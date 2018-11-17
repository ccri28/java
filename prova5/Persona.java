package it.java.prova5;

public class Persona {
	
	private String cognome;
	private String nome;
	private int eta;
	private String sesso;
	
	public Persona(String cognome, String nome, int eta, String sesso) {
		super();
		this.cognome = cognome;
		this.nome = nome;
		this.eta = eta;
		this.sesso = sesso;
	}
	
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "La persona si chiama " + cognome + " " + nome + ", ha " + eta + 
				" anni è " + sesso;
	}
	
	
		
}
