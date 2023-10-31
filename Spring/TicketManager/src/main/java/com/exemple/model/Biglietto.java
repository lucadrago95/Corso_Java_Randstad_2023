package com.exemple.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Biglietto {
	private int id;
	private String nomeEvento;
	private LocalDate dataEvento;
	private String nomeCompratore;
	private BigDecimal prezzo;
	
	public Biglietto() {

	}

	public Biglietto(int id, String nomeEvento, LocalDate dataEvento, String nomeCompratore, BigDecimal prezzo) {		
		this.id = id;
		this.nomeEvento = nomeEvento;
		this.dataEvento = dataEvento;
		this.nomeCompratore = nomeCompratore;
		this.prezzo = prezzo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public LocalDate getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getNomeCompratore() {
		return nomeCompratore;
	}

	public void setNomeCompratore(String nomeCompratore) {
		this.nomeCompratore = nomeCompratore;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Biglietto [id=" + id + ", nomeEvento=" + nomeEvento + ", dataEvento=" + dataEvento + ", nomeCompratore="
				+ nomeCompratore + ", prezzo=" + prezzo + "]";
	}

}
