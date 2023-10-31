package com.example.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.Model.Libro;

@Repository
public class LibroRepository {
	// map che gestisce la mia repo
	
	private Map<Long, Libro> database = new HashMap<>();
	private Long currentId = 1L;
	
	public Libro add(Libro libro) {
		libro.setId(currentId++);
		database.put(libro.getId(), libro);
		return libro;
	}
	
	public Optional<Libro> findById(Long id){
		return Optional.ofNullable(database.get(id));
	}
	
	public void delete(Libro libro) {
		database.remove(libro.getId());
	}
	
	//modifica
	public Libro update(Long id, Libro libro) {
		if (database.containsKey(id)) {
	        libro.setId(id);
	        database.put(id, libro);
	        return libro;
	    } else {
	        throw new IllegalArgumentException("Libro con ID " + id + " non trovato");
	    }
	}
	
	//prendi tt libri
	public List<Libro> list() {
		return database.values().stream()
			.collect(Collectors.toList());
	}

}
