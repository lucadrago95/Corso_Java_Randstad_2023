package models;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UtenteDAO {
    // ore 15.10
    // da creare tabelle db libreria_online
    // da creare metodi nuovo e modifica per utenteDAO

    // tabelle completate ore 15.20 mancano fk

    public void inserisci(Utente utente) {
		
		try {
			Connection conn = Connessione.creaConnessione(Connessione.libOnline, "root", "sincrono");
			// Prepara la query SQL per l'inserimento dei dati
			String query = " INSERT INTO libreria_online.utenti ( nome , email ) VALUES ( ? , ? ) ";
	        PreparedStatement pstm = conn.prepareStatement(query);
	        pstm.setString(1, utente.getNome());
	        pstm.setString(2, utente.getEmail());
	        
			int righeInserite = pstm.executeUpdate();
			if (righeInserite > 0) {
	            System.out.println( "Prodotto inserito con successo.");
	        } else {
	        	System.out.println("Errore durante l'inserimento del prodotto.");
	        }
			conn.close();
		}
		catch(Exception e) {
			System.out.println("Errore: " + e.getMessage());
		}
	}




}
