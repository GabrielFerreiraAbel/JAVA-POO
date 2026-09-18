package ac11;

import java.util.ArrayList;

public class Cestas {
	
	private int codigo;
	private double valorFinal;
	private ArrayList<Produto> produtos;
	
	public Cestas(int codigo, double valorFinal) {
		super();
		this.codigo = codigo;
		this.valorFinal = valorFinal;
		this.produtos = new ArrayList<Produto>();
	}

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public double valorFinal(Produto produtos) {
		valorFinal += produtos.getPreco();
		
		return valorFinal;
	}
	
	public void exibirDados() {
		System.out.println("CÓDIGO: " + codigo + " | VALOR FINAL: " + valorFinal);
	}
	
	
	
}
