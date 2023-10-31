package Login;

import java.util.ArrayList;
import Input.InputScanner;

public class Login {
	// due metodi:
	// 1. login
	// 2. registrazionee
	
	// FARE LA LISTA PER CONTENERE TUTTI GLI UTENTI 
	
	public String user;
	public String pass;
	
	ArrayList<String> users = new ArrayList<String>();

	public void login() {
//		System.out.println("benvenuto nella login");
//		user = InputScanner.inputUtenteString("inserisci username");
//		pass = InputScanner.inputUtenteString("inserisci password");
//		
//		users.contains(user);
//		users.contains(pass);
//		String utente = user, pass;
//		
//		System.out.println(users);
		
	}
	public void registrazione() {
		boolean loop = true;
		while(loop) { // il loop è implementato momentaneamente per vedere se tutti gli utenti venivano aggiunti alla lista correttamente
			System.out.println("benvenuto nella registrazione");
			String user = InputScanner.inputUtenteString("inserisci un username");
			String pass = InputScanner.inputUtenteString("inserisci una password");
			String utente = user;
			String utentePass = pass;
			
			if(users.contains(utente))  {
				System.out.println("l'utente non è disponibile");
//				return registrazione();
			} else {
				users.add(utente);
				users.add(utentePass);
				System.out.println("l'utente è stato creato con successo");
			}
			System.out.println(users);
			loop = true;
		}
		
	}
	
	

	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public ArrayList<String> getUsers() {
		return users;
	}
	public void setUsers(ArrayList<String> users) {
		this.users = users;
	}

}
