package Giorno4_2;

public class Libro {
	
	private int id;
	private String titolo;
	private String autore;
	private String descrizione;
	private double prezzo;

	public Libro(int id, String titolo, String autore, String descrizione, double prezzo) {
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public String getInfo() {
		String info = String.format("\nId: %d\nTitolo: %s\nDescrizione: %s\nAutore: %s\nPrezzo: %f",
				getId(),
				getTitolo(),
				getDescrizione(),
				getAutore(),
				getPrezzo());
		return info;
	}

}
