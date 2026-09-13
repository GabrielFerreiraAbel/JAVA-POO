package ac9;

public class Bilhete {
	
	private int numeroIngresso;
	private String descricaoShow;
	private Comprador comprador;
	
	public Bilhete(int numeroIngresso, String descricaoShow) {
		super();
		this.numeroIngresso = numeroIngresso;
		this.descricaoShow = descricaoShow;
	}

	public int getNumeroIngresso() {
		return numeroIngresso;
	}

	public void setNumeroIngresso(int numeroIngresso) {
		this.numeroIngresso = numeroIngresso;
	}

	public String getDescricaoShow() {
		return descricaoShow;
	}

	public void setDescricaoShow(String descricaoShow) {
		this.descricaoShow = descricaoShow;
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}
	
	public void exibirDados() {
		System.out.println("Nº BILHETE: " + numeroIngresso + " | EVENTO: " + descricaoShow);
	}
	
	
	
}
