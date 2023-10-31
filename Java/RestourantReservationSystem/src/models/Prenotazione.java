package models;

/**
 * classe prenotazione dove richiamo gli get e set della classe tavolo
 */

public class Prenotazione extends Tavolo {
	private int id;
	private String data;
	private String orario;
	private int numeroPersone;
	private int numeroDelTavolo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getOrario() {
		return orario;
	}
	public void setOrario(String orario) {
		this.orario = orario;
	}
	public int getNumeroPersone() {
		return numeroPersone;
	}
	public void setNumeroPersone(int numeroPersone) {
		this.numeroPersone = numeroPersone;
	}
	public int getNumeroDelTavolo() {
		return numeroDelTavolo;
	}
	public void setNumeroDelTavolo(int numeroDelTavolo) {
		this.numeroDelTavolo = numeroDelTavolo;
	}
	@Override
	public String toString() {
		return "Prenotazione [id=" + id + ", data=" + data + ", orario=" + orario + ", numeroPersone=" + numeroPersone
				+ ", numeroDelTavolo=" + numeroDelTavolo + "]";
	}
	
}
