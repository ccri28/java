package it.java.prova5;

public class Cittadino extends Persona {
	
	private String codiceFiscale;

	public Cittadino(String cognome, String nome, int eta, String sesso, String codiceFiscale) {
		super(cognome, nome, eta, sesso);
		this.codiceFiscale = codiceFiscale;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	@Override
	public String toString() {
		String aggiunta = " e ha il seguente codice fiscale " + codiceFiscale;
		return super.toString() + aggiunta;
	}
	
	
	
}
