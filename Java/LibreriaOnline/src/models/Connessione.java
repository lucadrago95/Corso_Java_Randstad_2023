package models;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connessione {

    public static String libOnline = "jdbc:mysql://localhost:3306/libreria_online";

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
}
