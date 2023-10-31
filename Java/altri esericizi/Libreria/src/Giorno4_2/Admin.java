package Giorno4_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
	
	public void caricaLista() {
		// aggiungi un modo per caricare la lista appena il main viene caricato
	}

	public void aggiungiLibro(ArrayList<Libro> listaLibri) {
		
		boolean continua = true;
		
		while(continua) {
			// aggiungi un id
			int id = InputUtility.inputUtenteInt("inserisci id");
			// aggiungi una descrizione
			String titolo = InputUtility.inputUtenteString("inserisci titolo");
			// aggiungi una descrizione
			String descrizione = InputUtility.inputUtenteString("inserisci descrizione");
			// aggiungi autore
			String autore = InputUtility.inputUtenteString("inserisci autore");
			// aggiungi prezzo
			double prezzo = InputUtility.inputUtenteDouble("inserisci prezzo");
			// crea libro
			Libro libro = new Libro(id, titolo, descrizione, autore, prezzo);	
			
			// aggiungi libro al libri(Array)
			listaLibri.add(libro);
			
			String risposta = InputUtility.inputUtenteString("vuoi inserire un altro libro? (y/n): "); 
			if(risposta.equals("y")) {
				continua = true;
			}else {
				continua = false;
			}
		}
		
	}
	
	public void modificaLibro(ArrayList<Libro> listaLibri) {
//		Scanner inserisci = new Scanner(System.in);
		boolean continua = true;
		
		while(continua) {
			
			int id = InputUtility.inputUtenteInt("modifica id");
			String titolo = InputUtility.inputUtenteString("modifica titolo");
			String descrizione = InputUtility.inputUtenteString("modifica descrizione");
			String autore = InputUtility.inputUtenteString("modifica autore");
			double prezzo = InputUtility.inputUtenteDouble("modifica prezzo");
			
			Libro libro = new Libro(id, titolo, descrizione, autore, prezzo);	
			
			listaLibri.set(id, libro);
			
			String risposta = InputUtility.inputUtenteString("vuoi modificare un altro libro? (y/n): "); 
			if(risposta.equals("y")) {
				continua = true;
			}else {
				continua = false;
			}
		}
		
	}
	
	public void eliminaLibro(ArrayList<Libro> listaLibri) {
//		Scanner inserisci = new Scanner(System.in);
		
		boolean continua = true;
		
		while(continua) {
			// cercare prima l'id dentro l'array dopo averlo trovato confrontare se corrisponde con il numero id
			// che stiamo passando noi e una volta che corrisponde posso rimuoverlo il libro
			
			int id = InputUtility.inputUtenteInt("elimina id");
//		String titolo = InputUtility.inputUtenteString("modifica titolo");
//		String descrizione = InputUtility.inputUtenteString("modifica descrizione");
//		String autore = InputUtility.inputUtenteString("modifica autore");
//		double prezzo = InputUtility.inputUtenteDouble("modifica prezzo");
//		
//		Libro libro = new Libro(id, titolo, descrizione, autore, prezzo);	
			
			listaLibri.remove(id);
			
			String risposta = InputUtility.inputUtenteString("vuoi eliminare un altro libro? (y/n): "); 
			if(risposta.equals("y")) {
				continua = true;
			}else {
				continua = false;
			}
			
		}
		
	}
}
