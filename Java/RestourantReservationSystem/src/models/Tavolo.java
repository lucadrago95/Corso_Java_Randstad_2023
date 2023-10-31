package models;

/**
 * classe tavolo con attributi PRIVATE ed essi accessibili solo tramite i getter e setter
 */

public class Tavolo {
	private int id;
	private int numeroPosti;
	private boolean stato;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumeroPosti() {
		return numeroPosti;
	}
	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}
	public boolean isStato() {
		return stato;
	}
	public void setStato(boolean stato) {
		this.stato = stato;
	}
	@Override
	public String toString() {
		return "Tavolo [id=" + id + ", numeroPosti=" + numeroPosti + ", stato=" + stato + "]";
	}
	
	
}
