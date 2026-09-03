package ac7;

public class Funcionario {
	private String nome;
	private double salario;
	private int diasTrabalhados;
	private double horasTrabalhadas;
	private double valorDaHora;
	
	
	public Funcionario(String nome, int diasTrabalhados, double horasTrabalhadas, double valorDaHora) {
		super();
		this.nome = nome;
		this.diasTrabalhados = diasTrabalhados;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorDaHora = valorDaHora;
	}
	
	public double salario() {
		return this.salario = diasTrabalhados * horasTrabalhadas * valorDaHora;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public int getDiasTrabalhados() {
		return diasTrabalhados;
	}


	public void setDiasTrabalhados(int diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}


	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}


	public double getValorDaHora() {
		return valorDaHora;
	}


	public void setValorDaHora(double valorDaHora) {
		this.valorDaHora = valorDaHora;
	}
	
	
	
}
