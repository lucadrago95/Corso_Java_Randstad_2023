package com.example.Model;

import java.util.Objects;

public class Libro {
	private Long id;
	private String titolo;
	private String autore;
	private String genere;
	private int annoPubblicazione;
	private int quantitaDisponibile;

	public Libro() {

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

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public int getQuantitaDisponibile() {
		return quantitaDisponibile;
	}

	public void setQuantitaDisponibile(int quantitaDisponibile) {
		this.quantitaDisponibile = quantitaDisponibile;
	}

	@Override
	public int hashCode() {
		return Objects.hash(annoPubblicazione, autore, genere, id, quantitaDisponibile, titolo);
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
				&& Objects.equals(genere, other.genere) && Objects.equals(id, other.id)
				&& quantitaDisponibile == other.quantitaDisponibile && Objects.equals(titolo, other.titolo);
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", autore=" + autore + ", genere=" + genere
				+ ", annoPubblicazione=" + annoPubblicazione + ", quantitaDisponibile=" + quantitaDisponibile + "]";
	}
	
	
	
}
