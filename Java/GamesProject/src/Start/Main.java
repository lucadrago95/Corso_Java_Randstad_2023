package Start;

import Login.Login;

/**
 * 
 * @author lucadraghetti
 *suddividere in pacchetti e classi in modo da organizzare il più possibile il codice 
 *e non avere un solo pacchetto con dentro tutto. 
 *  
 * 
 */


public class Main {

	public static void main(String[] args) {
		
		
		Login prova = new Login();
		
//		prova.login();
		prova.registrazione();
//		System.out.println(prova.getUsers().toString());
		
		// richiama parco giochi che parte ed a sua volta fa il richiamo a login
		
	}

}
