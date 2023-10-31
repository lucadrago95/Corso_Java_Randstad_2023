package esercizioPasticceria;

import java.util.ArrayList;

public class Cliente {
	public String nome;
    public String cognome;
    public String indirizzo;
    ArrayList<Prodotto> carrello = new ArrayList<Prodotto>();
    float budget;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public ArrayList<Prodotto> getCarrello() {
        return carrello;
    }

    public void setCarrello(ArrayList<Prodotto> carrello) {
        this.carrello = carrello;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }


    public void aggiungiAlCarrello(Prodotto p) {
    	carrello.add(p);
    	System.out.println("aggiungo al carrello "+ p.getNome());
    }

    public void effettuaOrdine(ArrayList<Prodotto> carrello) {
    	for(int i=0; i<carrello.size(); i++) {
    		this.budget = this.budget - carrello.get(i).getPrezzo();
    	}
    	System.out.println("Ordine effettuato, mi rimangono: " + this.budget);
    	
    }
}
