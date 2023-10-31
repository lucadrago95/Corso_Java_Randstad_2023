package esercizioPasticceria;

import java.util.ArrayList;

public class Prodotto {

	String nome;
	float prezzo;
	String descrizione;
	ArrayList<String> ingredienti;
	int quantitaDisponibile;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public ArrayList<String> getIngredienti() {
		return ingredienti;
	}
	public void setIngredienti(ArrayList<String> ingredienti) {
		this.ingredienti = ingredienti;
	}
	public int getQuantitaDisponibile() {
		return quantitaDisponibile;
	}
	public void setQuantitaDisponibile(int quantitaDisponibile) {
		this.quantitaDisponibile = quantitaDisponibile;
	}
	
	public void vendi(int quantita) {
		this.quantitaDisponibile= this.quantitaDisponibile-quantita;
		System.out.println("Venduto elemento, ti rimangono in magazzino: "+ this.quantitaDisponibile);
	}
	
	
}
