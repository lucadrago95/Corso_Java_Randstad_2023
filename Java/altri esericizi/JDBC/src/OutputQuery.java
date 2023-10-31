import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class OutputQuery {
	
	// stampa dei record in tabella
	
	// Stampa colonne 
	public static void stampaResultSet(ResultSet res) {
		
		try {
			
			ResultSetMetaData metaData = res.getMetaData();
			int nColonne = metaData.getColumnCount();
			
			String output = " ";
			for(int i = 1; i <= nColonne; i++) {
				output += metaData.getColumnName(i) + " - ";
			}
			System.out.println(output);
			
			while(res.next()) {
				String outputRiga = " "; 
				for(int i = 1; i <= nColonne; i++) {
					outputRiga += res.getString(i) + " - ";
				}
				System.out.println(outputRiga);
			}
			
			
		}
		catch(Exception e) {
			System.out.println("Errore di stampa");
		}
		
		
	}
	
	
	// ResultSet recuperi metaData
	
	// con metaData recuperi il numero Colonne
	
	// stampa resultSet 
	
	

}
