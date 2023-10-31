package Games;

public class Gioco {
	public String nome;
	public String genere;
	

	public Gioco(String nome, String genere) {
		super();
		this.nome = nome;
		this.genere = genere;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	public void gioca() {
		System.out.println("stai giocando a " + getNome());
	}
	
	
}
