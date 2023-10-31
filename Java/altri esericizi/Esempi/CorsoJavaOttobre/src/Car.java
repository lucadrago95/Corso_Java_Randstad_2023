
public class Car implements Veicolo{

	private String marca;
	private String modello;
	private int annoModello;
	private String colore;
	
	public Car() {
		this.marca = "none";
		this.modello = "none";
		this.colore = "none";
	}
	
	public Car(String marca, String modello, int annoModello, String colore) {
		this.marca = marca;
		this.modello = modello;
		this.annoModello = annoModello;
		this.colore = colore;
	}
	
	//Getter - Setter
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
	public int getAnnoModello() {
		return annoModello;
	}
	public void setAnnoModello(int annoModello) {
		this.annoModello = annoModello;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	//Stampa info
	public void stampaInfo() {
		String info = String.format("\nMarca: %s\nModello: %s\nAnnoModello: %d\nColore: %s",
									getMarca(),
									getModello(),
									getAnnoModello(),
									getColore());
		
		
		System.out.println(info);
	}

	public void accensione() {
		System.out.println(String.format("\n%s %s è accesa", getMarca(), getModello()));
	}
}
