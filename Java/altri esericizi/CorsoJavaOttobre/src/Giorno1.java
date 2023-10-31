import java.util.Scanner; // imporato la libreria per lo scanner

public class Giorno1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print("Ciao mondo! \n"); // il carattere \n serve per mandare a capo 
//		System.out.println("altra riga");
//		
//		System.out.println(2);
//		
//		String saluta = "ciao";
//		System.out.println(saluta);
//		
//		System.out.println(2 * 3);
//		
//		int x = 2;
//		int y = 5;
//		System.out.println(x + y);
//		
//		String mondo = "Mondo";
//		System.out.println(saluta + mondo);
//		
//		System.out.println(saluta + " alle " + 5 + "persone che arrivano dal " + mondo);
		
		
//		// casting a restringimento
//		double myDouble = 9.78d;
//		System.out.println(myDouble);
//		int myInt = (int) myDouble; 
//		System.out.println(myInt);
//		
//		// casting a promozione
//		double myDouble2 = myInt;
//		System.out.println(myInt);

//		
//		Scanner myObj = new Scanner(System.in);
//		System.out.println("inserisci un numero double");
//		
//		double num1 = myObj.nextDouble();
//		int numInt = (int) num1;
//		
//		System.out.println("il numero convertito è : " + numInt );
//		
		
		
		// ESERCIZIO FINALE DEL GIORNO 02/10/2023
		Scanner scanner = new Scanner(System.in);

		try{
			
			boolean continua = true;
			
			while(continua) {
				
				System.out.println("inserisci un numero");
				double numero1 = scanner.nextDouble();
				
				System.out.println("premi uno dei seguenti tasti:");
				System.out.println("1 ) per moltiplicare il numero per se stesso");
				System.out.println("2 ) per addizionare con un altro numero");
				System.out.println("3 ) per uscire");
				
				int scelta = scanner.nextInt();
				
				switch(scelta) {
				case 1: 
					System.out.println(numero1 * numero1);
					break;
				case 2:
					System.out.println("scegli un altro numero: ");
					double numero2 = scanner.nextDouble();
					System.out.println("la somma dei numeri che hai scelto è: " + (numero1 + numero2));
					break;
				case 3:
					continua = false;
					System.out.println("alla prossima");
					break;
				default:
	              System.out.println("scelta non valida. Scegli 1, 2 o 3.");
	              break;
				}
			}
		} catch(Exception e) {
			System.out.println("hai sbagliato tasto, errore: " + e.getMessage());
		}
		scanner.close();
	}
}
