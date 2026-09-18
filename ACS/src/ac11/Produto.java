package ac11;

public class Produto {
	
	private int codigo;
	private String nome;
	private double preco;
	private Cestas cestas;
	
	public Produto(int codigo, String nome, double preco, Cestas cestas) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.cestas = cestas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Cestas getCestas() {
		return cestas;
	}

	public void setCestas(Cestas cestas) {
		this.cestas = cestas;
	}
	
	public void exibirDados() {
		System.out.println("CÓDIGO: " + codigo + " | NOME: " + nome + " | PREÇO: " + preco);
	}
	
	
}
