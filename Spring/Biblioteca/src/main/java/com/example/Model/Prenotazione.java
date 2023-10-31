package com.example.Model;

import java.time.LocalDate;
import java.util.Objects;

public class Prenotazione {
	private Long id;
	private LocalDate dataInizio;
	private LocalDate dataFine;
	private Libro libro;

	public Prenotazione() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public LocalDate getDataFine() {
		return dataFine;
	}

	public void setDataFine(LocalDate dataFine) {
		this.dataFine = dataFine;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataFine, dataInizio, id, libro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prenotazione other = (Prenotazione) obj;
		return Objects.equals(dataFine, other.dataFine) && Objects.equals(dataInizio, other.dataInizio)
				&& Objects.equals(id, other.id) && Objects.equals(libro, other.libro);
	}

	@Override
	public String toString() {
		return "Prenotazione [id=" + id + ", dataInizio=" + dataInizio + ", dataFine=" + dataFine + ", libro=" + libro
				+ "]";
	}
	
}
