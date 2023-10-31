
public class Prodotto {
	int id; // aggiunto per fare la modifica e eliminazione 
	String marca;
	String modello;
	String descrizione;
	double prezzo;
	
	// PROBLEMA! CI SONO PIÙ COSTRUTTORI PERCHÈ NEI METODI DEL DbManager quando creavo la nuova istanza di
	// un oggetto prodotto mi veniva errore con il costruttore che non esisteva del solo tipo id oppure
	// del secondo costruttore dove li passo anche id
	// i primi due costruttori non esistevano appena finita la classe 
	// uguale p[er get e set di id e del toString 
	
	public Prodotto(int id) {
		this.id = id;
	}
	
	public Prodotto(int id, String marca, String modello, String descrizione, double prezzo) {
		this.id = id; 
		this.marca = marca;
		this.modello = modello;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}
	public Prodotto(String marca, String modello, String descrizione, double prezzo) {
		this.marca = marca;
		this.modello = modello;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	
	@Override
	public String toString() {
		return "Prodotto [id=" + id + ", marca=" + marca + ", modello=" + modello + ", descrizione=" + descrizione + ", prezzo=" + prezzo + "]";
	}
	
	
}
