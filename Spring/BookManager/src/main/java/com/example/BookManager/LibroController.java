package com.example.BookManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libri")
public class LibroController {
	@Autowired
	private LibroService libroService;
	
	@GetMapping
	public List<Libro> Lista(){
		return libroService.getLibri();
	}
	
	@GetMapping("/leggi/{id}")
	public void leggi(@PathVariable Long id) {
		libroService.getLibro();
	}
	
	@PostMapping("/aggiungi/{id}")
	public void aggiungi(@PathVariable Long id, @RequestBody Libro libro) {
		libroService.addLibro(libro);
	}
	
	@PutMapping("/aggiorna/{id}")
	public void aggiorna(@PathVariable Long id, @RequestBody Libro libro) {
		libroService.updateLibro(libro);
	}
	@DeleteMapping("/elimina/{id}")
	public void elimina(@PathVariable Long id) {
		libroService.deleteLibro();
	}
}
