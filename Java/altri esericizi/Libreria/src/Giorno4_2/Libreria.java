package Giorno4_2;

import java.util.ArrayList;

public class Libreria {

	public static void main(String[] args) {
		
//		QUI VERRANNO AGGIOUNTI I METODI PRESE DALLE CLASSI CHE MI PERMETTERANNO DI :
//			
//			1. VEDERE LA LISTA DI LIBRI 
//				1.1 VEDERE AUTORE / DETTAGLIO / PREZZO DEL SINGOLO LIBRO
//	
//			2. AVERE UN ADMIN CHE GESTISCE I LIBRI --> AGGIUNGE / MODIFICA / ELIMINA UN LIBRO
//			
//			3. AVERE UN UTENTE CHE --> COMPRA / MOSTRA I LIBRI
		
		// creazione della lista
		ArrayList<Libro> libri = new ArrayList<Libro>();		
		// creazione dell'admin 
		Admin pippo = new Admin();
		//aggiungi libro
		pippo.aggiungiLibro(libri);
		// stampa lista
		caricaLibri(libri);
		pippo.modificaLibro(libri);
		
		
//		String listaLibri = new Libro(1, "prova del primo libro", "Giuseppe");

	}
	
	public static void caricaLibri(ArrayList<Libro> listaLibri) {
		for(Libro libroTemp : listaLibri) {
			System.out.println(libroTemp.getInfo());
		}
		
	}

}
