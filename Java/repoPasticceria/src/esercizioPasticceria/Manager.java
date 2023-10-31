package esercizioPasticceria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Manager extends Dipendente {
	
	List<Dipendente> dipendenti = new ArrayList<>();
	Scanner scannerLine = new Scanner(System.in);
	Scanner scannerInt = new Scanner(System.in);
	
	public void assumi(Dipendente dipendente) throws ParseException {
		
		dipendenti.add(dipendente);
		System.out.println("Dipendente assunto");
		for(Dipendente dipendenteAssunto: dipendenti) {
			System.out.println(dipendenteAssunto.getNome());
		}
		
    }
    public void licenzia(Dipendente dipendente) {
    	dipendenti.remove(dipendente);
    }
    
    public Dipendente creaDipendente() throws ParseException {
    	System.out.println("Inserisci nome");
		String nome=scannerLine.nextLine();
		System.out.println("Inserisci cognome");
		String cognome=scannerLine.nextLine();
		System.out.println("Inserisci eta");
		int eta=scannerInt.nextInt();
		System.out.println("Inserisci data assunzione");
		String data=scannerLine.next();
		SimpleDateFormat format=new SimpleDateFormat("dd-mm-yyyy");
		Date regDate=format.parse(data);
		System.out.println("Inserisci ruolo");
		String ruolo=scannerLine.nextLine();
		
		Dipendente dipendente = new Dipendente();
		dipendente.setNome(nome);
		dipendente.setCognome(cognome);
		dipendente.setAge(eta);
		dipendente.setDataAssunzione(regDate);
		dipendente.setRuolo(ruolo);
		return dipendente;
    }
}
