import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;





public class DbManager {
	
	public static String myUrl2 = "jdbc:mysql://localhost:3306/shop_online";
	
	// creare un metodo per la creazione della connessione
	
	public static Connection creaConnessione(String url, String user, String password) {
		
		// try e catch
		// var connessione con url per db: parametri(url , user , pass) 
		// feed risultato connesione ciclo IF
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			
			if(conn != null) {
				System.out.println("connessione avvenuta");
			}else {
				System.out.println("connessione fallita");
			}
			
		}
		catch(Exception e) {
			System.out.println("Errore!");
		}
		
		return conn;
	}

	// creare metodo per la query
	
	public static ResultSet eseguiQuery(String query, Connection conn) {
		
		//conn
		// query
		//statement 
		try {
			Statement stm = conn.createStatement();
			ResultSet res = stm.executeQuery(query);
			System.out.println("query eseguita con successo");
			return res;	
		}
		catch(Exception e) {
			System.out.println("Errore esecuzione della query!");
			return null;
		}
		
	}


//	ES 1
//	In base al database Negozio, creare un client che permette l’inserimento di nuovi prodotti, 
//	di nuovi clienti, di nuovi ordini e la gestione di questi(ovvero update ed eliminazione righe).

	public static void inserisciProdotto() {
			String marca = InputScanner.inputUtenteString("inserisci marca");
			String modello = InputScanner.inputUtenteString("inserisci modello");
			String descrizione = InputScanner.inputUtenteString("inserisci descrizione");
			double prezzo = InputScanner.inputUtenteDouble("inserisci prezzo");
			// verificare se il tipo di dato inserito è corretto
			if(marca.isEmpty() || modello.isEmpty() || descrizione.isEmpty() || prezzo < 0 ) {
				System.out.println("Dati non validi, assicurati che i campi siano corretti quando li compili");
				inserisciProdotto();
				return;
			}
			Prodotto prod = new Prodotto( marca, modello, descrizione, prezzo);
			DTO_Prodotto dtoProd = new DTO_Prodotto();
			
			dtoProd.inserisci(prod);
	}
	
	public static void modificaProdotto() {
		
			int id = InputScanner.inputUtenteInt("inserisci id prodotto da aggiornare");
			String marca = InputScanner.inputUtenteString("inserisci marca");
			String modello = InputScanner.inputUtenteString("inserisci modello");
			String descrizione = InputScanner.inputUtenteString("inserisci descrizione");
			double prezzo = InputScanner.inputUtenteDouble("inserisci prezzo");
			// verificare se il tipo di dato inserito è corretto
			if(marca.isEmpty() || modello.isEmpty() || descrizione.isEmpty() || prezzo < 0 ) {
				System.out.println("Dati non validi, assicurati che i campi siano corretti quando li compili");
				modificaProdotto();
				return;
			}
			// Prepara la query SQL per l'inserimento dei dati
			Prodotto prod = new Prodotto(id, marca, modello, descrizione, prezzo);
			DTO_Prodotto dtoProd = new DTO_Prodotto();
				
			dtoProd.modifica(prod);
			
	}
	
	public static void eliminaProdotto() {
		try {
			int id = InputScanner.inputUtenteInt("inserisci id prodotto da eliminare");			
			
			Prodotto prod = new Prodotto(id);
			DTO_Prodotto dtoProd = new DTO_Prodotto();
				
			dtoProd.elimina(prod);
			
		}
		catch(Exception e) {
			System.out.println("Errore: " + e.getMessage());
		}
			
	}
	
	public static void inserisciCliente(Connection conn) {
		try {
			String email_cliente = InputScanner.inputUtenteString("inserisci email cliente");
			String username = InputScanner.inputUtenteString("inserisci username");
			String nome = InputScanner.inputUtenteString("inserisci nome");
			String cognome = InputScanner.inputUtenteString("inserisci cognome");
			String indirizzo = InputScanner.inputUtenteString("inserisci indirizzo");
			// verificare se il tipo di dato inserito è corretto
			if(email_cliente.isEmpty() || username.isEmpty() || nome.isEmpty() || cognome.isEmpty() || indirizzo.isEmpty()) {
				System.out.println("Dati non validi, assicurati che i campi siano corretti quando li compili");
				inserisciCliente(conn);
				return;
			}
			// Prepara la query SQL per l'inserimento dei dati
			String query = " INSERT INTO shop_online.clienti ( email_cliente , username , nome , cognome , indirizzo ) VALUES ( ? , ? , ? , ? , ? ) ";
	        PreparedStatement pstm = conn.prepareStatement(query);
	        pstm.setString(1, email_cliente);
	        pstm.setString(2, username);
	        pstm.setString(3, nome);
	        pstm.setString(4, cognome);
	        pstm.setString(5, indirizzo);
	        
			int righeInserite = pstm.executeUpdate();
			if (righeInserite > 0) {
	            System.out.println( "Cliente inserito con successo.");
	        } else {
	        	System.out.println("Errore durante l'inserimento del cliente.");
	        }
		}
		catch(Exception e) {
			System.out.println("Errore: " + e.getMessage());
		}
			
	}
	
	public static void modificaCliente(Connection conn) {
		try {
			String email_cliente = InputScanner.inputUtenteString("inserisci email cliente da aggiornare");
			String nuova_email_cliente = InputScanner.inputUtenteString("inserisci nuova email cliente ");
			String username = InputScanner.inputUtenteString("inserisci username");
			String nome = InputScanner.inputUtenteString("inserisci nome");
			String cognome = InputScanner.inputUtenteString("inserisci cognome");
			String indirizzo = InputScanner.inputUtenteString("inserisci indirizzo");
			// verificare se il tipo di dato inserito è corretto
			if(email_cliente.isEmpty() || nuova_email_cliente.isEmpty() || username.isEmpty() || nome.isEmpty() || cognome.isEmpty() || indirizzo.isEmpty()) {
				System.out.println("Dati non validi, assicurati che i campi siano corretti quando li compili");
				modificaCliente(conn);
				return;
			}
			// Prepara la query SQL per l'inserimento dei dati
			String query = " UPDATE shop_online.clienti SET email_cliente = ? , username = ? , nome = ? , cognome = ? , indirizzo = ? WHERE clienti.email_cliente = ? ";
	        PreparedStatement pstm = conn.prepareStatement(query);
	        pstm.setString(1, nuova_email_cliente);
	        pstm.setString(2, username);
	        pstm.setString(3, nome);
	        pstm.setString(4, cognome);
	        pstm.setString(5, indirizzo);
	        pstm.setString(6, email_cliente);
	        
			int righeInserite = pstm.executeUpdate();
			if (righeInserite > 0) {
	            System.out.println( "Cliente modificato con successo.");
	        } else {
	        	System.out.println("Errore durante la modifica del cliente.");
	        }
		}
		catch(Exception e) {
			System.out.println("Errore: " + e.getMessage());
		}
			
	}
	
	public static void eliminaCliente(Connection conn) {
		try {
			String email_cliente = InputScanner.inputUtenteString("inserisci l'email del cliente da eliminare");			
			// Prepara la query SQL per l'inserimento dei dati
			String query = " DELETE FROM shop_online.clienti WHERE clienti.email_cliente = ? ";
	        PreparedStatement pstm = conn.prepareStatement(query);
	        pstm.setString(1, email_cliente);
	        
			int righeInserite = pstm.executeUpdate();
			if (righeInserite > 0) {
	            System.out.println( "Cliente eliminato con successo.");
	        } else {
	        	System.out.println("Errore durante l'eliminazione del cliente.");
	        }
		}
		catch(Exception e) {
			System.out.println("Errore: " + e.getMessage());
		}
			
	}
	
	public static void inserisciOrdine(Connection conn) {
		try {
			String email_cliente = InputScanner.inputUtenteString("inserisci l'email del cliente per il nuovo ordine");
			Date data_ordine = InputScanner.inputUtenteDate("inserisci data dell'ordine in formato: ANNO-MESE-GIORNO");
			double costo_totale = InputScanner.inputUtenteDouble("inserisci il costo totale dell'ordine");
			// verificare se il tipo di dato inserito è corretto
			if( email_cliente.isEmpty() || costo_totale < 0 ) {
				System.out.println("Dati non validi, assicurati che i campi siano corretti quando li compili");
				inserisciOrdine(conn);
				return;
			}
			// Prepara la query SQL per l'inserimento dei dati
			String query = " INSERT INTO shop_online.ordini ( email_cliente , data_ordine , costo_totale ) VALUES ( ? , ? , ? ) ";
	        PreparedStatement pstm = conn.prepareStatement(query);
	        pstm.setString(1, email_cliente);
	        pstm.setDate(2, new java.sql.Date(data_ordine.getTime())); //converte da date java a date sql
	        pstm.setDouble(3, costo_totale);
	        
			int righeInserite = pstm.executeUpdate();
			if (righeInserite > 0) {
	            System.out.println( "Ordine inserito con successo.");
	        } else {
	        	System.out.println("Errore durante l'inserimento dell'ordine.");
	        }
		}
		catch(Exception e) {
			System.out.println("Errore: " + e.getMessage());
		}
			
	}
	
	public static void modificaOrdine(Connection conn) {
		try {
			int id_ordine = InputScanner.inputUtenteInt("inserisci id ordine da aggiornare");
			String email_cliente = InputScanner.inputUtenteString("inserisci l'email del cliente");
			Date data_ordine = InputScanner.inputUtenteDate("inserisci data dell'ordine in formato: ANNO-MESE-GIORNO");
			double costo_totale = InputScanner.inputUtenteDouble("inserisci il costo totale dell'ordine");
			// verificare se il tipo di dato inserito è corretto
			if( email_cliente.isEmpty() || costo_totale < 0 ) {
				System.out.println("Dati non validi, assicurati che i campi siano corretti quando li compili");
				modificaOrdine(conn);
				return;
			}
			// Prepara la query SQL per l'inserimento dei dati
			String query = " UPDATE shop_online.ordini SET email_cliente = ? , data_ordine = ? , costo_totale = ? WHERE ordini.id_ordine = ? ";
	        PreparedStatement pstm = conn.prepareStatement(query);
	        pstm.setString(1, email_cliente);
	        pstm.setDate(2, new java.sql.Date(data_ordine.getTime())); //converte da date java a date sql
	        pstm.setDouble(3, costo_totale);
	        pstm.setInt(4, id_ordine);
	        
			int righeInserite = pstm.executeUpdate();
			if (righeInserite > 0) {
	            System.out.println( "Ordine modificato con successo.");
	        } else {
	        	System.out.println("Errore durante la modifica dell'ordine.");
	        }
		}
		catch(Exception e) {
			System.out.println("Errore: " + e.getMessage());
		}
			
	}
	
	public static void eliminaOrdine(Connection conn) {
		try {
			int id_ordine = InputScanner.inputUtenteInt("inserisci id ordine da eliminare");			
			// Prepara la query SQL per l'inserimento dei dati
			String query = " DELETE FROM shop_online.ordini WHERE ordini.id_ordine = ? ";
	        PreparedStatement pstm = conn.prepareStatement(query);
	        pstm.setInt(1, id_ordine);
	        
			int righeInserite = pstm.executeUpdate();
			if (righeInserite > 0) {
	            System.out.println( "Ordine eliminato con successo.");
	        } else {
	        	System.out.println("Errore durante l'eliminazione dell'ordine.");
	        }
		}
		catch(Exception e) {
			System.out.println("Errore: " + e.getMessage());
		}
			
	}
	
	
//	ES 2
//	Permettere ad un eventuale utente la visualizzazione del catalogo e l’acquisto di 
//	diversi prodotti per un ordine, quindi un carrello e una cronologia ordini.

  
}
