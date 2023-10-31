package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utente {
	
	private int id;
	private String nome;
	private String email;
	List<Libro> listaLibriAcquistati = new ArrayList<Libro>();
	List<Recensione> recensioni = new ArrayList<Recensione>();
	LibreriaOnline listaLibri = new LibreriaOnline();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Libro> getListaLibri() {
		return listaLibriAcquistati;
	}
	public void setListaLibri(List<Libro> listaLibri) {
		this.listaLibriAcquistati = listaLibri;
	}
	
	
	
	public void acquistaLibro(Libro libro, LibreriaOnline listaLibri) {
        // recupero lista libri della libreria 
        listaLibri.getListaLibri();
        System.out.println("che libro vuoi acquistare? ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        for(int i=0; i<listaLibri.getListaLibri().size(); i++){
        	
        	for(Libro libro1:listaLibri.getListaLibri()) {
        		if(libro1.getId() == id) {
        			listaLibriAcquistati.add(libro);
        		} else {
        			System.out.println("non esiste");
        		}
    		}
            
        }

        System.out.println("libro acquistato");
    }
	

	
	public void lasciaRecensione(Libro libro, Utente utente) {
		List<Recensione> recensioni = new ArrayList<Recensione>();
		Recensione recensione = new Recensione();
		recensione.setLibro(libro);
		recensione.setUtente(utente);
		System.out.println("Inserisci commento");
		Scanner scannerLine= new Scanner(System.in);
		String commento =scannerLine.nextLine();
		recensione.setCommento(commento);
		System.out.println("inserisci valutazione");
		int valutazione =scannerLine.nextInt();
		recensione.setValutazione(valutazione);
		libro.setValutazione(valutazione);
		recensioni.add(recensione);
		
		for(Recensione recensione1:recensioni) {
			System.out.println(recensione1.getCommento());
		}

	}
	
	public void raccomanda() {
		
	}
	

}
