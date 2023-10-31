package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import InputScanner.InputScanner;
import models.Prenotazione;
import models.Tavolo;

/**
 * classe che implementa i metodi dichiarati nell'interfaccia 
 */

public class PrenotazioneServiceImpl implements PrenotazioneService {
	// oggetti da utilizzare
	Tavolo tavolo = new Tavolo();
	Prenotazione prenotazione = new Prenotazione();
	Random rand = new Random();
	// liste per salvare i tavoli e prenotazioni ed esse rappresentano quelle occupati 
	// così nel metodo prenota posso controllare la disponibilita e nel metodo annullaPrenotazione posso eliminare un elemento dalla lista
	// e in getTavoliDisponibili posso recuperare la lista di tavoli escludendo già quelli inseriti nella mia lista
	List tavoliOccupati = new ArrayList();
	List prenotazioniNonDisponibili = new ArrayList();
	
	int min = 1;
	int max = 10;
	
	private void prenotaTavolo() {
		
		//per assegnare un numero del tavolo casuale da 1 a 10
		int idTavolo = rand.nextInt(max - min + 1) + min;
		//per assegnare un numero dei posti al tavolo casuale da 1 a 10
		int randNumPosti = rand.nextInt(max - min + 1) + min;
		
		//set del tavolo 
		tavolo.setId(idTavolo);
		tavolo.setNumeroPosti(randNumPosti);
		tavolo.setStato(rand.nextBoolean());
		
		// chiedere numero persone
		// input numeroPersone; salvare in una variabile locale chiamata nPersonePrenotazione
		int idPrenotazione = InputScanner.inputUtenteInt("inserisci id prenotazione ");
		String dataPrenotazione = InputScanner.inputUtenteString("data della prenotazione? ");
		String orarioPrenotazione = InputScanner.inputUtenteString("orario della prenotazione? ");
		int numeroPersonePrenotazione = InputScanner.inputUtenteInt("quante persone siete? MAX 10 persone x tavolo! ");
		int numeroTavoloPrenotazione = InputScanner.inputUtenteInt("inserisci numero tavolo ");
		
		prenotazione.setId(idPrenotazione);
		prenotazione.setData(dataPrenotazione);
		prenotazione.setOrario(orarioPrenotazione);
		prenotazione.setNumeroPersone(numeroPersonePrenotazione);
		prenotazione.setNumeroDelTavolo(idTavolo);
		
//		if() {
			//tavolo disponibile sempre che corrisponde a al numero del tavolo uscito nel idTavolo
			
//		}else {
			// tavolo non disponibile 
//		}
			
////////// //////// //////// ////////   BOZZA LOGICA PER CONTROLLI	//////// //////// ////////
//		if(numeroPersonePrenotazione == )
//		// verificare numero tavolo per n persone
//		// verificare disponibilità di quel tavolo in preciso
//		if(numeroPersone = numeroPosti || stato == true  ){
//			// tavolo disponibile e poi 
//			// stampare data e orario disponibilità del tavolo 
//		}else {
//			// stampa tavolo non disponibile scegli un altro tavolo
//		}
//////////////// //////// //////// //////// //////// //////// //////// //////// //////// //////// 
	}

	//cancellare le prenotazioni dalla lista prenotazioniNonDisponibili
	private void annullaPrenotazione() {
		
	}
	
	// uso una lista per controllare i tavoli occupati così escludendo quelli saprò i tavoli che ho disponibili  (tavoliOccupati)
	private void getTavoliDisponibili() {

	}
}
