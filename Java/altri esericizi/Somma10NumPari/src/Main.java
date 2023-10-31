
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	Scrivete un programma Java che calcoli la somma dei primi 10 numeri pari e stampi il risultato. */
		
		int risultato = 0;
		int count = 0;

        for(int i = 0; i < 10; i+= 2) {
        	risultato += i;
        	count++;
        	System.out.println(risultato);
        }
        int risultatoFinale = risultato+risultato;
        
	}

}
