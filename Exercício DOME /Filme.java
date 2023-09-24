package dome

public class Filme extends Item {
	private String diretor;
	
	public Filme (String titulo, int ano, double tempReproducao, boolean gotIt, String comentario, String diretor) {
		super(titulo, ano, tempReproducao, gotIt, comentario);
		this.diretor =  diretor;
	}
	
	
	
	public void imprime() {
		super.imprime();
		System.out.println("Diretor: " + this.diretor);
		System.out.println("Ano: " + this.ano);
	}
}
