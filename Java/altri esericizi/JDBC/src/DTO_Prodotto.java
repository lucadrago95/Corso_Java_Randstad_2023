

public class DTO_Prodotto {

	DAO_Prodotto dao = new DAO_Prodotto();
	
	public void inserisci(Prodotto prodotto) {
	
		dao.inserisci(prodotto);
	}
	
	public void modifica(Prodotto prodotto) {
		dao.modifica(prodotto);
	}
	
	public void elimina(Prodotto prodotto) {
		dao.elimina(prodotto);
	}

}
