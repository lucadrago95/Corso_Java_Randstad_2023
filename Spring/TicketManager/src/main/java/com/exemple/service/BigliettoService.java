package com.exemple.service;

import java.util.List;

import com.exemple.model.Biglietto;

public interface BigliettoService {
	//aggiungere operazioni crud
	List<Biglietto> ottieniTuttiBiglietti();
	Biglietto ottieniBiglietto(int id);
	void aggiungiBiglietto(Biglietto biglietto);
	void modificaBiglietto(int id, Biglietto nuovoBiglietto);
	void rimuoviBiglietto(int id);

}
