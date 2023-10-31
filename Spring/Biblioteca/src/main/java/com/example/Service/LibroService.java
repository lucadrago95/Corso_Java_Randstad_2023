package com.example.Service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Libro;
import com.example.Repository.LibroRepository;

@Service
public class LibroService {
	
	@Autowired
	private LibroRepository libroRepository;
	
	public Libro saveLibro(Libro libro) {
		return libroRepository.add(libro);
	}
	
	public Optional<Libro> findByIdLibro(Long id){
		return libroRepository.findById(id);
	}
	
	public void deleteLibro(Libro libro) {
		libroRepository.delete(libro);
	}
	
	// updateLibro
	public Libro updateLibro(Long id, Libro libro) {
		return libroRepository.update(id, libro);
		
	}
	
	// getLibri
	public Collection<Libro> getLibri(){
		return libroRepository.list();
	}
	
	public boolean decreaseQuantitàDisponibile(Libro libro) {
        if (libro.getQuantitaDisponibile() > 0) {
            libro.setQuantitaDisponibile(libro.getQuantitaDisponibile() - 1);
            libroRepository.add(libro);
            return true;
        }
        return false;
    } 
	
	public void increaseQuantitàDisponibile(Libro libro) {
        libro.setQuantitaDisponibile(libro.getQuantitaDisponibile() + 1);
        libroRepository.add(libro);
    }
}
