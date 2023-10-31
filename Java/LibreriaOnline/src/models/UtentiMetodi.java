package models;

import java.util.ArrayList;
import java.util.List;

public class UtentiMetodi extends Libro{
	
	LibreriaOnline libreria = new LibreriaOnline();
	Recensione recensione = new Recensione();
	
	
	
	public List<Libro> stessoGenere(String genere, String autore, LibreriaOnline libreria) {
		List<Libro> libriUguali = new ArrayList<Libro>();
		
		for(int i=0; i<libreria.getListaLibri().size(); i++){
        	
        	for(Libro libro1:libreria.getListaLibri()) {
        		if(libro1.getGenere()== genere && libro1.getValutazione()> 4 && libro1.getAutore() == autore) {
        			libriUguali.add(libro1);

        		} else {
        			System.out.println("c'è un problema");
        		}
    		}
            
        }
		return libriUguali;
		
	}
	
	public void valutazioneAlta() {
		//solo libri con voto dal 5 in su
		
		
	}
	

	
	
}
