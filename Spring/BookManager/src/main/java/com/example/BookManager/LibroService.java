package com.example.BookManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.stereotype.Service;



@Service
public class LibroService {

	public List<Libro> libri = new ArrayList<>();

	public List<Libro> getLibri() {
		//prendere tutta la lista e stamparla
		return libri;
	}
	
	public void getLibro() {
		//prendere un singolo libro e stamparlo
		Scanner sc = new Scanner(System.in);
		int myLibro = sc.nextInt();
		System.out.println("Lista dei libri: \n");
		libri.get(myLibro);
	}
	
	public void addLibro(Libro libro) {
		//fare i vari set dei vari attributi
		//poi aggiungere alla lista
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci id");
		Long lib = sc.nextLong();
		System.out.println("inserisci titolo");
		String tit = sc.nextLine();
		System.out.println("inserisci autore");
		String aut = sc.nextLine();
		System.out.println("inserisci anno pubblicazione");
		int annoPub = sc.nextInt();
		
		libro.setId(lib);
		libro.setTitolo(tit);
		libro.setAutore(aut);
		libro.setAnnoPublicazione(annoPub);
		
		libri.add(libro);
		System.out.println("libro aggiunto");
	}
	
	public void updateLibro(Libro libro) {
		//prendere id libro
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci id da aggiornare");
		Long lib = sc.nextLong();
		//recupero id dalla lista
	    int index = -1;
	    for (int i = 0; i < libri.size(); i++) {
	        if (libri.get(i).getId() == lib) {
	            index = i;
	            break;
	        }
	    }
	    System.out.println("modifica titolo");
	    String tit = sc.nextLine();
	    System.out.println("modifica autore");
	    String aut = sc.nextLine();
	    System.out.println("modifica anno pubblicazione");
	    int annoPub = sc.nextInt();
	    libro = libri.get(index);
	    libro.setTitolo(tit);
	    libro.setAutore(aut);
	    libro.setAnnoPublicazione(annoPub);
	    System.out.println("Libro aggiornato.");
		
	}
	
	public void deleteLibro() {
		//prendere un libro tramite id 
		// rimuovere dalla lista livri
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci id del libro da rimuovere");
		Long lib = sc.nextLong();
		libri.remove(lib);
		System.out.println("libro rimosso");
	}
	

}
