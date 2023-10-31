import java.sql.Connection;
import java.sql.PreparedStatement;

//commento per fare il push 
public class DAO_Prodotto {
	
	public void inserisci(Prodotto prodotto) {
		
		try {
			Connection conn = DbManager.creaConnessione(DbManager.myUrl2, "root", "sincrono");
			// Prepara la query SQL per l'inserimento dei dati
			String query = " INSERT INTO shop_online.prodotti ( marca , modello , descrizione , prezzo ) VALUES ( ? , ? , ? , ? ) ";
	        PreparedStatement pstm = conn.prepareStatement(query);
	        pstm.setString(1, prodotto.getMarca());
	        pstm.setString(2, prodotto.getModello());
	        pstm.setString(3, prodotto.getDescrizione());
	        pstm.setDouble(4, prodotto.getPrezzo());
	        
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
	
	public void modifica(Prodotto prodotto) {
		try {
			Connection conn = DbManager.creaConnessione(DbManager.myUrl2, "root", "sincrono");
			// Prepara la query SQL per l'inserimento dei dati
			String query = "UPDATE shop_online.prodotti SET marca = ? , modello = ? , descrizione = ? , prezzo = ? WHERE prodotti.id_prodotto = ? ";
	        PreparedStatement pstm = conn.prepareStatement(query);
	        pstm.setString(1, prodotto.getMarca());
	        pstm.setString(2, prodotto.getModello());
	        pstm.setString(3, prodotto.getDescrizione());
	        pstm.setDouble(4, prodotto.getPrezzo());
	        pstm.setInt(5, prodotto.getId());
	        
			int righeInserite = pstm.executeUpdate();
			if (righeInserite > 0) {
	            System.out.println( "Prodotto modificato con successo.");
	        } else {
	        	System.out.println("Errore durante la modifica del prodotto.");
	        }
			conn.close();
		}
		catch(Exception e) {
			System.out.println("Errore: " + e.getMessage());
		}
	}
	
	public void elimina(Prodotto prodotto) {
		try {
			Connection conn = DbManager.creaConnessione(DbManager.myUrl2, "root", "sincrono");
			// Prepara la query SQL per l'inserimento dei dati
			String query = " DELETE FROM shop_online.prodotti WHERE prodotti.id_prodotto = ? ";
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setInt(1, prodotto.getId());
			int righeInserite = pstm.executeUpdate();
			if (righeInserite > 0) {
				System.out.println( "Prodotto eliminato con successo.");
			} else {
				System.out.println("Errore durante l'eliminazione del prodotto.");				
			}
			conn.close();
		}
		catch(Exception e) {
			System.out.println("Errore: " + e.getMessage());
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
