package models;

import java.util.ArrayList;
import java.util.List;


public class Start {
	public static void main(String[] args) {
		
		//CLASSE TEST
		List<Recensione> recensioni = new ArrayList<Recensione>();
		List<Libro> libri = new ArrayList<Libro>();
		LibreriaOnline libreria = new LibreriaOnline();
		Utente utente = new Utente();
		Libro libro= new Libro();
		UtentiMetodi metodi = new UtentiMetodi();
		
		utente.setId(1);
		utente.setEmail("stroma");
		utente.setNome("pippo");
		
		libro.setId(1);
		libro.setAutore("pippo");
		libro.setGenere("AVVENTURA");
		libro.setPrezzo(10);
		libro.setTitolo("harry");
		libri.add(libro);
		libreria.setListaLibri(libri);
		for(Libro libro1: libreria.getListaLibri()) {
			System.out.println(libro1.getId());
		}
		
		
		utente.acquistaLibro(libro, libreria);
		
		utente.lasciaRecensione(libro, utente);
		
		
		
		libreria.setListaLibri(libri);
		libreria.setListaRecensioni(recensioni);
		metodi.stessoGenere("avventura", "pippo", libreria);
	}
	
	
}
