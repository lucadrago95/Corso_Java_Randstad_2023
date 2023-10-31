package esercizioPasticceria;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) throws ParseException {
		// MAIN DI PROVA - TEST -
		//Task 1: creazione modelli Prodotto e Cliente e test // --> FUNZIONA --> 30 min (larghi)
		//Task 2: dipendente e menager con test;
		Prodotto prodotto = new Prodotto();
		Cliente cliente = new Cliente();
		Manager manager = new Manager();
		ArrayList<String> ingredienti = new ArrayList<String>();
		ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();
		List<Dipendente> dipendenti = new ArrayList<>();
		
		ingredienti.add("sale");
		
		//CREO CLIENTE
		cliente.setNome("ezio");
		cliente.setCognome("cantoni");
		cliente.setIndirizzo("via roma 2");
		cliente.setBudget(1000);
		
		//CREO PRODOTTO
		prodotto.setNome("torta");
		prodotto.setDescrizione("novita");
		prodotto.setIngredienti(ingredienti);
		prodotto.setPrezzo(100);
		prodotto.setQuantitaDisponibile(100);
		prodotti.add(prodotto);
		
		//AGGIUNGO AL CLIENTE IL PRODOTTO
		cliente.setCarrello(prodotti);
		
		//TEST METODI
		//METODO AGGIUNTA AL CARELLO PRODOTTO
		cliente.aggiungiAlCarrello(prodotto);
		
		//EFFETTUO ORDINE, CHECK SE SCALA IL BUDGET
		cliente.effettuaOrdine(prodotti);
		prodotto.vendi(10);
		
		//TEST DEL MANAGER --> ASSUMI --> funziona
		Dipendente dipendente =manager.creaDipendente();
		manager.assumi(dipendente);
		
		
		
	}

}
