package ac12;

import java.util.ArrayList;

public class Desenvolvedor {
	
	private String nome;
	private String especialidade;
	private double salario;
	private ArrayList<Projeto> projetos;
	
	public Desenvolvedor(String nome, String especialidade, double salario) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
		this.salario = salario;
		this.projetos = new ArrayList<Projeto>();
	}
	
	public void adicionarProjeto(Projeto projeto) {
		projetos.add(projeto);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public ArrayList<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(ArrayList<Projeto> projetos) {
		this.projetos = projetos;
	}

	@Override
	public String toString() {
		return "Desenvolvedor [nome=" + nome + ", especialidade=" + especialidade + ", salario=" + salario + "]";
	}
	
	
	
	
	
}