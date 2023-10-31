package InputScanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InputScanner {

	public static String inputUtenteString(String messaggio) {
		try {
			System.out.println(messaggio);
			Scanner scanner = new Scanner(System.in);
			return scanner.nextLine();
		} catch (Exception e) {
			System.out.println("valore non valido");
			return inputUtenteString(messaggio);
		}
	}

	public static int inputUtenteInt(String messaggio) {
		try {
			System.out.println(messaggio);
			Scanner scanner = new Scanner(System.in);
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println("valore non valido");
			return inputUtenteInt(messaggio);
		}
	}

	public static double inputUtenteDouble(String messaggio) {
		try {
			System.out.println(messaggio);
			Scanner scanner = new Scanner(System.in);
			return scanner.nextDouble();
		} catch (Exception e) {
			System.out.println("valore non valido");
			return inputUtenteDouble(messaggio);
		}
	}
	
	
//	DA MODIFICARE IN MODO CHE PRENDA INPUT DI TIPO DATE() PER INSERIRE UNA DATA IN FORMATO YYYY-MM-DD
//	public static String inputUtenteDate(String messaggio) {
//		try {
//			System.out.println(messaggio);
//			Scanner scanner = new Scanner(System.in);
//			return scanner.nextLine();
//		} catch (Exception e) {
//			System.out.println("valore non valido");
//			return inputUtenteString(messaggio);
//		}
//	}
	
	public static Date inputUtenteDate(String messaggio) {
	    try {
	        System.out.println(messaggio);
	        Scanner scanner = new Scanner(System.in);
	        String input = scanner.nextLine();
	        
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Definisci il formato desiderato per la data
	        Date date = dateFormat.parse(input);
	        
	        return date;
	    } catch (Exception e) {
	        System.out.println("Valore non valido");
	        return inputUtenteDate(messaggio);
	    }
	}

}
