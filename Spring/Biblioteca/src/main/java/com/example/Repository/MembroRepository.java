package com.example.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.Model.Membro;
import com.example.Model.Prenotazione;

@Repository
public class MembroRepository {

	// map che gestisce la mia repo
	
	private Map<Long, Membro> database = new HashMap<>();
	private Long currentId = 1L;
	
	public Membro add(Membro membro) {
		membro.setId(currentId++);
		database.put(membro.getId(), membro);
		return membro;
	}
	
	public Optional<Membro> findById(Long id){
		return Optional.ofNullable(database.get(id));
	}
	
	public void delete(Membro membro) {
		database.remove(membro.getId());
	}
	
	//modifica
	public Membro update(Long id, Membro membro) {
		if (database.containsKey(id)) {
	        membro.setId(id);
	        database.put(id, membro);
	        return membro;
	    } else {
	        throw new IllegalArgumentException("Membro con ID " + id + " non trovato");
	    }
	}
	
	//prendi tt libri
	public List<Membro> list() {
		return database.values().stream()
			.collect(Collectors.toList());
	}


}
