package models;

import java.util.List;

public class LibreriaOnline {
	
	List<Utente> listaUtenti;
	List<Libro> listaLibri;
	List<Recensione> listaRecensioni;
	
	public List<Utente> getListaUtenti() {
		return listaUtenti;
	}
	public void setListaUtenti(List<Utente> listaUtenti) {
		this.listaUtenti = listaUtenti;
	}
	public List<Libro> getListaLibri() {
		return listaLibri;
	}
	public void setListaLibri(List<Libro> listaLibri) {
		this.listaLibri = listaLibri;
	}
	public List<Recensione> getListaRecensioni() {
		return listaRecensioni;
	}
	public void setListaRecensioni(List<Recensione> listaRecensioni) {
		this.listaRecensioni = listaRecensioni;
	}
	
	public void aggiungiUtente(Utente utente) {
		listaUtenti.add(utente);
	}
	
	public void aggiungiLibro(Libro libro) {
		listaLibri.add(libro);
	}
	
	public void aggiungiRecensione(Recensione recensione) {
		listaRecensioni.add(recensione);
	}
	
	public void mostraLibri() {
		for(Libro libro: listaLibri) {
			System.out.println(libro.getTitolo());
		}
	}
	
	
}
