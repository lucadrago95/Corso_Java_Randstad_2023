package Giorno4_2;

import java.util.Scanner;

public class InputUtility {
	public static String inputUtenteString(String messaggio) {
		try {
			System.out.println(messaggio);
			Scanner scanner = new Scanner(System.in);
			return scanner.nextLine();
		} catch (Exception e){
			System.out.println("valore non valido");
			return inputUtenteString(messaggio);
		}
	}
	
	public static int inputUtenteInt(String messaggio) {
		try {
			System.out.println(messaggio);
			Scanner scanner = new Scanner(System.in);
			return scanner.nextInt();
		} catch (Exception e){
			System.out.println("valore non valido");
			return inputUtenteInt(messaggio);
		}
	}
	
	public static double inputUtenteDouble(String messaggio) {
		try {
			System.out.println(messaggio);
			Scanner scanner = new Scanner(System.in);
			return scanner.nextDouble();
		} catch (Exception e){
			System.out.println("valore non valido");
			return inputUtenteDouble(messaggio);
		}		
	}

}
