package ac12;

import java.util.ArrayList;

public class Projeto {
	
	private String nome;
	private int meses;
	private double orcamento;
	private ArrayList<Desenvolvedor> desenvolvedores;
	
	public Projeto(String nome, int meses, double orcamento) {
		super();
		this.nome = nome;
		this.meses = meses;
		this.orcamento = orcamento;
		this.desenvolvedores = new ArrayList<Desenvolvedor>();
	}
	
	public void adicionarDesenvolvedor(Desenvolvedor desenvolvedor) {
		desenvolvedores.add(desenvolvedor);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}

	public double getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(double orcamento) {
		this.orcamento = orcamento;
	}

	public ArrayList<Desenvolvedor> getDesenvolvedores() {
		return desenvolvedores;
	}

	public void setDesenvolvedores(ArrayList<Desenvolvedor> desenvolvedores) {
		this.desenvolvedores = desenvolvedores;
	}

	@Override
	public String toString() {
		return "Projeto [nome=" + nome + ", meses=" + meses + ", orcamento=" + orcamento + "]";
	}
	
	
	
	
}