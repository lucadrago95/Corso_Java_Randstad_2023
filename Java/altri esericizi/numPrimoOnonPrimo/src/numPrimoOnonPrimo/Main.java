package numPrimoOnonPrimo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scrivete un programma Java 
//		che verifichi se un numero dato è primo o no.
		
		boolean loop = true;
		
		while(loop) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Inserisci un numero: ");
			int numero = scanner.nextInt();
			
			if (numeroPrimo(numero)) {
				System.out.println(numero + " è un numero primo.");
			} else {
				System.out.println(numero + " non è un numero primo.");
			}
		}
		
    }
	
	public static boolean numeroPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
