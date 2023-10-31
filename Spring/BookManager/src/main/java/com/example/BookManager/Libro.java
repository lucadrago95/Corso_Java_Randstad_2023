package com.example.BookManager;

import java.util.Objects;

public class Libro {
	private Long id;
	private String titolo;
	private String autore;
	private int annoPubblicazione;
	
	public Libro() {
		
	}
	
	public Libro(Long id, String titolo, String autore, int annoPubblicazione) {
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
		this.annoPubblicazione = annoPubblicazione;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getAnnoPublicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPublicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	@Override
	public int hashCode() {
		return Objects.hash(annoPubblicazione, autore, id, titolo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return annoPubblicazione == other.annoPubblicazione && Objects.equals(autore, other.autore)
				&& Objects.equals(id, other.id) && Objects.equals(titolo, other.titolo);
	}

}
