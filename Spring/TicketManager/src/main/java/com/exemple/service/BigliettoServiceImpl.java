package com.exemple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.model.Biglietto;
import com.exemple.repository.BigliettoRepository;

@Service //è un component
public class BigliettoServiceImpl implements BigliettoService{
	@Autowired
	BigliettoRepository br;
	
	public List<Biglietto> ottieniTuttiBiglietti() {
		return br.ottieniTuttiBiglietti();
	}
	
	public Biglietto ottieniBiglietto(int id) {
		return br.ottieniBiglietto(id);
	}
	
	public void aggiungiBiglietto(Biglietto biglietto) {
		br.aggiungiBiglietto(biglietto);
	}

	public void modificaBiglietto(int id, Biglietto nuovoBiglietto) {
		br.modificaBiglietto(id, nuovoBiglietto);
	}
	
	public void rimuoviBiglietto(int id) {
		br.rimuoviBiglietto(id);
	}	
}
