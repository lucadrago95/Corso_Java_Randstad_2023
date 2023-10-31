package models;

public class Recensione {
	
	private Utente utente;
	private Libro libro;
	private int valutazione; //da 0 a 5
	private String commento;
	
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public int getValutazione() {
		return valutazione;
	}
	public void setValutazione(int valutazione) {
		this.valutazione = valutazione;
	}
	public String getCommento() {
		return commento;
	}
	public void setCommento(String commento) {
		this.commento = commento;
	}
	
	
	public void aggiungiUtente() {
		
	}
	
	public void aggiungiLibro() {
		
	}
	
	public void aggiungiRecensione() {
		
	}
	
	public void mostraLibri() {
		
	}
}
