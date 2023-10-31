import java.util.ArrayList;
import java.util.Scanner;

public class Giorno3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				boolean loop = true;
				
				Scanner S = new Scanner(System.in);
				Scanner S2 = new Scanner(System.in);
				
				double num1  = 0.0;
				double num2 = 0.0;
				
//				double[] primi10 = new double[10]; //inizializzo l'array con il valore max a 10 elementi
//				int indice = 0; // assegno valore 0 al mio indice dell'array per avere un riferimento duranete le operazioni
				
				ArrayList<Double> elementiMioArray = new ArrayList<Double>();
//				int indice = 0;
				
				System.out.println("gli elementi del tuo array sono questi: " + elementiMioArray);
				
				System.out.print("Scegliere due numeri randomici? [s/n]: ");
				String sceltaRandom = S2.nextLine();
				if (sceltaRandom.equals("s")) {
					System.out.print("Inserire range iniziale del numero: [0 e 100] ");
					int start = S.nextInt();
					
					System.out.print("Inserire range finale del numero: [0 e 100] ");
					int end = S.nextInt();
					
					int range = end - start;
					
					num1 = (Math.random() * range) + start;
					System.out.println("numero uno: " + num1);
					num2 = (Math.random() * range) + start;
					System.out.println("numero due: " + num2);
				} else if (sceltaRandom.equals("n")) {
				
					System.out.print("Inserire primo numero: ");
					num1 = S.nextDouble();
					
					System.out.print("Inserire secondo numero: ");
					num2 = S.nextDouble();
				} else {
					System.out.println("Input sbagliato");
				}
				
				if (num1 < num2) {
					double temp = num1;
					num1 = num2;
					num2 = temp;
				}
						
				while(loop) {
					
					System.out.println("Scegli tra le seguenti opzioni: \n"
							+ "1 -> somma\n"
							+ "2 -> sottrazione\n"
							+ "3 -> somma delle radici quadrate\n"
							+ "4 -> sottrazione delle radici quadrate\n"
							+ "5 -> stampa il contenuto dell'arrayList\n"
							);
					
					int input = S.nextInt();
					double output = 0;
					
					
					switch(input) {
					case 1: output = num1 + num2; break;
					case 2: output = num1 - num2; break;
					case 3: output = Math.sqrt(num1) + Math.sqrt(num2); break;
					case 4: output = Math.sqrt(num1) - Math.sqrt(num2); break;
					case 5: System.out.println("gli elementi sono: " + elementiMioArray);
					default: System.out.println("Input non accettato."); break;
					}
					
//					primi10[indice] = output; // assegno l'indice al valore del mio output
//					indice++; // incremento l'indice in modo che il prossimo risultato non sovrascrive il primo
					
					elementiMioArray.add(output);
//					indice++;
					
					
					System.out.println("Risultato: " + output);
					System.out.println((output >= 0 ? "positivo" : "negativo"));
					System.out.println("Valore assoluto: " + (Math.abs(output)));

					double resto = (output % 1);
					System.out.println((resto == 0 ? "Intero" : "con virgola"));
					System.out.println("Valore dopo la virgola: " + resto);
					
//					for(int i = 0; i<1; i++) {
//						System.out.println("è l'operazione n. " + indice + "( hai un max di 10 operazioni prima che si spacca tutto! )");
//					}
								
					System.out.print("Continure? [s/n]: ");
					String esci = S2.nextLine();
					if (esci.equals("s")) {
						loop = true;
					} else if (esci.equals("n")) {
						System.out.println("Uscito");
						loop = false;
						S.close();
						S2.close();
					}
					
				}

//			for(int i=0; i<primi10.length; i++) { //per la lunghezza dei miei 10 elementi dell'array stampo ogni valore 
//				System.out.println("il risultato è: " + (i+1) + ": " + primi10[i]);
//			}
			
			System.out.println(elementiMioArray);
		

	}

}
