package com.example.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.Model.Libro;
import com.example.Model.Prenotazione;

@Repository
public class PrenotazioneRepository {
	private Map<Long, Prenotazione> database = new HashMap<>();
	private Long currentId = 1L;
	
	public Prenotazione add(Prenotazione prenotazione) {
		prenotazione.setId(currentId++);
		database.put(prenotazione.getId(), prenotazione);
		return prenotazione;
	}
	
	public Optional<Prenotazione> findById(Long id){
		return Optional.ofNullable(database.get(id));
	}
	public void delete(Prenotazione prenotazione) {
		database.remove(prenotazione.getId());
	}
	
	public Prenotazione update(Long id, Prenotazione prenotazione) {
		if(database.containsKey(id)) {
			prenotazione.setId(id);
			database.put(id, prenotazione);
			return prenotazione;
		} else {
			throw new IllegalArgumentException("Prenotazione con ID " + id + " non trovata");
		}
	}
	
	public List<Prenotazione> list() {
		return database.values().stream()
			.collect(Collectors.toList());
	}

	
}
