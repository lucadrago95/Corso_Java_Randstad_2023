public class Main {

	public static void main(String[] args) {
		Car myCar = new Car();

		Car fiat500 = new Car("Fiat", "500", 1960, "Rosssa");
		SuperCar saetta = new SuperCar("Saetta McQueen", "Pixar", 2005, "Rosso", 300);

		fiat500.setColore("Rosso e giallo modena");

		System.out.println("Stampa Info");

		myCar.stampaInfo();
		fiat500.stampaInfo();
		saetta.stampaInfo();

		Car prova = saetta;
		prova.stampaInfo();
		
		EseguiBrumBrum(prova);
		EseguiBrumBrum(myCar);
		
		Veicolo veicolo = saetta;
		
		veicolo.accensione();
	}
	
	private static void EseguiBrumBrum(Car myCar) {
		if(myCar instanceof SuperCar)
			((SuperCar) myCar).brumBrum();
		else
			System.out.println("Non è un oggetto di SuperCar!");
	}
}