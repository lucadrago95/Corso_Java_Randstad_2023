import java.sql.Connection;
// import java.sql.ResultSet;

//Creare una classe che permette la gestione delle connessioni al database.
//Utilizzando questa classe eseguire una Query e creare un metodo di utility per stampare in console un result-set.

public class Main {

//	private static String myUrl = "jdbc:mysql://localhost:3306/world";
	private static String myUrl2 = "jdbc:mysql://localhost:3306/shop_online";

	public static void main(String[] args) {
		
		
// creare una classe per la gestire la connessione al db
//all'interno di questa classe creare unn metodo per generare una connessione ed un altro medoto per eseguire la query sulla connessione

//		
//		Connection connessione = DbManager.creaConnessione(myUrl, "root", "sincrono");
//		
//		ResultSet res = DbManager.eseguiQuery("SELECT * FROM city LIMIT 10; ", connessione);
//
//		OutputQuery.stampaResultSet(res);
		
		// creare un altro metodo per stampare il resultset
		
		
		// CODICE ESERCIZIO 1
		// quando tutto il DTO e il DAO saranno completati puoi rimuovere la connessione 
		Connection connessione = DbManager.creaConnessione(myUrl2, "root", "sincrono");
		
		/***	INSERIMENTO PRODOTTI	***/
//		DbManager.inserisciProdotto();
//		DbManager.modificaProdotto();
		DbManager.eliminaProdotto();
		
		/***	INSERIMENTO CLIENTI ***/		
		DbManager.inserisciCliente(connessione);
		DbManager.modificaCliente(connessione);
		DbManager.eliminaCliente(connessione);
		
		/***	INSERIMENTO ORDINI	***/
		DbManager.inserisciOrdine(connessione);
		DbManager.modificaOrdine(connessione);
		DbManager.eliminaOrdine(connessione);
				
		
		
		// CODICE ESERCIZIO 2
		
		
//		
//		try {
//			Connection conn = DriverManager.getConnection(myUrl, "root", "sincrono");
//			
//			if(conn != null)
//				System.out.println("Connessione stabilita.");
//			else
//				System.out.println("Connessione fallita.");
//			
//			String query = "SELECT Name , Population FROM city;";
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery(query);
//			
//			ResultSetMetaData metaData = rs.getMetaData();
//			System.out.println("---STAMPA " + metaData.getTableName(1) + "---");
//			System.out.println("-" + metaData.getColumnName(1) + "- -" + metaData.getColumnName(2));
			
//			if(rs != null)
//				System.out.println("Query eseguita con risultato.");
//			else
//				System.out.println("Query eseguita senza risultato.)");
			
			
//			String query = String.format("SELECT * FROM %s WHERE population > ? ;", "country");
//			PreparedStatement pstmt = conn.prepareStatement (query);
//			
//			pstmt.setFloat(1, 5000f);
//			ResultSet rs = pstmt.executeQuery();
			
//			while(rs.next()) {
//				String riga = rs.getString("Name") + " - " + rs.getString("Population");
//				System.out.println(riga);
//			}
//		}
//		catch (Exception e) {
//			System.out.println("ERRORE!");
//			e.printStackTrace();
//		}

	}

}
