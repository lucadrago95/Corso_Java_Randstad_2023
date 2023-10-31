import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Giorno2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*				
		Scanner scanner = new Scanner(System.in);
		Scanner scannerString = new Scanner(System.in);
		boolean ripeti = true;
		try {	
			while(ripeti) {
			
				System.out.println("inserisci un numero");
				double numero = scanner.nextDouble();
				String string = scannerString.nextLine();
				//operatore ternario			
				System.out.println(numero % 2 == 0 ? "il numero inserito è pari" : "il numero inserito è dispari");
				
				int numeroInt = (int) numero;
				
				if(numero == numeroInt) {
					System.out.println("il numero è intero");
				}else {
					System.out.println(numero + " NON è un numero intero");
				}
	//			double numeroDouble = 0.0; // il ciclo non funziona correttamente
	//			if (numero == numeroDouble){
	//				System.out.println("il numero è intero");
	//			}else{
	//				System.out.println("il numero NON è intero");
	//			}		
				
	//			if(numero < 0) {
	//				System.out.println("il numero è negativo");
	//			}else {
	//				System.out.println("il numero è positivo");
	//			}
				//operatore ternario
				System.out.println(numero < 0 ? "il numero è negativo" : "il numero è positivo");
				
			}
		}catch(Exception e) {
			System.out.println("fine");
			
		}
		
*/
		//////////////////////////////////////////////////////////////////////////
		
		
		Scanner scanner = new Scanner(System.in);
		boolean continua = true;
		double random1 = 0.0;
		double random2 = 0.0;
		double n1utente = 0.0;
		double n2utente = 0.0;
		
//		double[] primi10 = new double[10]; //inizializzo l'array con il valore max a 10 elementi
//		int indice = 0; // assegno valore 0 al mio indice dell'array per avere un riferimento duranete le operazioni
		
		ArrayList<Double> elementiMioArray = new ArrayList<Double>();
		
		System.out.println("vuoi scegliere un range tra due numeri? Y/N ");
		
		String scelta = scanner.nextLine();
		
		if(scelta.equals("Y")) {
			
			System.out.println("inserisci il primo numero: ");
			double n1 = scanner.nextDouble();
			System.out.println("inserisci il secondo numero: ");
			double n2 = scanner.nextDouble();
			double range = n2 - n1 + 1;

			if(n1 > n2) {
				System.out.println("il secondo numero deve essere maggiore del secondo");
			} else {
				for(int i =0; i<2; i++) {
					if(i == 0) {
						random1 = (int) (Math.random() * range); // primo numero casuale
						System.out.println(random1);
					} else {
						random2 = (int) (Math.random() * range); // primo numero casuale
						System.out.println(random2);
					}
					
				}
			}
			
		} else if(scelta.equals("N")) {
			System.out.println("hai scelto no, passiamo direttamente alle operazioni");
			System.out.print("Inserire primo numero: ");
			n1utente = scanner.nextDouble();
			
			System.out.print("Inserire secondo numero: ");
			n2utente = scanner.nextDouble();
			
			
		} else {
			System.out.println("scelta non valita");
		}
		
		while(continua) {
			
			System.out.println("scegli un'operazione: ");
			System.out.println("1. somma");
			System.out.println("2. sottrazione");
			System.out.println("3. somma delle radici quadrate ");		
			System.out.println("4. sottrazione tra la radice più grande e quella più piccola");
			System.out.println("5. stampa i risultati che hai ottenuto fino ad ora");
			System.out.println("6. voglio uscire!!");
			
			int scelta1 = scanner.nextInt();
			
			double risultato = 0;
			
			switch(scelta1) {
			
				case 1 :
					risultato = (scelta.equals("N") ? n1utente + n2utente : random1 + random2);
					System.out.println("la somma è: " + risultato);
					break;
				case 2 :
					risultato = (scelta.equals("N") ? n1utente - n2utente : random1 - random2);
					System.out.println("la sottrazione è: " + risultato);
					break;
				case 3 :
					risultato = (scelta.equals("N") ? Math.sqrt(n1utente) + Math.sqrt(n2utente) : Math.sqrt(random1) + Math.sqrt(random2));
					System.out.println("la somma delle radici quadrate è: " + risultato); 
					break;
				case 4 :
					risultato = (scelta.equals("N") ? Math.sqrt(n1utente) - Math.sqrt(n2utente) : Math.sqrt(random1) - Math.sqrt(random2));
					System.out.println("la somma è: " + risultato );
					break;
				case 5 :
					System.out.println("gli elementi sono: " + elementiMioArray);
					break;
				case 6 :
					continua = false;
					System.out.println("a mai più!!" );
					break;
				default: System.out.println("Input non accettato."); 
					break;
			}
			
			elementiMioArray.add(risultato);
			
//			primi10[indice] = risultato; // assegno l'indice al valore del mio output
//			indice++; // incremento l'indice in modo che il prossimo risultato non sovrascrive il primo
			
			System.out.println((risultato >= 0 ? "positivo" : "negativo"));
			System.out.println("Valore assoluto: " + (Math.abs(risultato)));

			double resto = (risultato % 1);
			System.out.println((resto == 0 ? "Intero" : "con virgola"));
			System.out.println("Valore dopo la virgola: " + resto);
			
//			for(int i = 0; i<1; i++) {
//				System.out.println("è l'operazione n. " + indice + "( hai un max di 10 operazioni prima che si spacca tutto! )");
//			}
			System.out.println(elementiMioArray);
		}
		
	
		
		
		// finire i casi con le operazioni e dopo sotto finire di seguire i 3 punti dell'esercizio 
		 
		        
		        
	}

}
