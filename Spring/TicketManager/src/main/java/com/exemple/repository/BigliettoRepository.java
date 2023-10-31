package com.exemple.repository;

import java.util.ArrayList;
import java.util.List;

import com.exemple.model.Biglietto;

public class BigliettoRepository {
//	Utilizza una struttura dati (es. Map) per conservare i biglietti.
//	Fornisce metodi CRUD per operare sulla struttura dati.
	
	    private List<Biglietto> biglietti;

	    public BigliettoRepository() {
	        biglietti = new ArrayList<>();
	    }
	    public List<Biglietto> ottieniTuttiBiglietti() {
	    	return biglietti;
	    }
	    public Biglietto ottieniBiglietto(int id) {
	    	if (id >= 0 && id < biglietti.size()) {
	    		return biglietti.get(id);
	    	}
	    	return null;
	    }
	    public void aggiungiBiglietto(Biglietto biglietto) {
	        biglietti.add(biglietto);
	    }
	    public void modificaBiglietto(int id, Biglietto nuovoBiglietto) {
	        if (id >= 0 && id < biglietti.size()) {
	            biglietti.set(id, nuovoBiglietto);
	        }
	    }
	    public void rimuoviBiglietto(int indice) {
	        if (indice >= 0 && indice < biglietti.size()) {
	            biglietti.remove(indice);
	        }
	    }
}
