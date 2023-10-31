package oop;

public class Display extends Smartphone {
	private String marca;
	private String modello;
	private String risoluzione;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getRisoluzione() {
		return risoluzione;
	}
	public void setRisoluzione(String risoluzione) {
		this.risoluzione = risoluzione;
	}
	
	static void dimensioniSchermo() {
		System.out.println("risoluzione da: ");
		
	}

}
