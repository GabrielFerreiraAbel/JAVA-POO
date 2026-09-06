package ac8;

import java.util.Locale;

public class Funcionario {

	private static final Locale BR = Locale.forLanguageTag("pt-BR");

	private String nome;
	private int diasTrabalhados;
	private double horasTrabalhadas;
	private double valorDaHora;

	public Funcionario(String nome, int diasTrabalhados, double horasTrabalhadas, double valorDaHora) {
		this.nome = nome;
		this.diasTrabalhados = diasTrabalhados;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorDaHora = valorDaHora;
	}

	public double calcularSalario() {
		return diasTrabalhados * horasTrabalhadas * valorDaHora;
	}

	public String linhaRelatorio() {
		return String.format(BR,
			"%s | %d dias de trabalho | %.0fh de trabalho por dia | R$ %,.2f por hora | Salário do mês: R$ %,.2f",
			nome, diasTrabalhados, horasTrabalhadas, valorDaHora, calcularSalario());
	}

	public String getNome() { return nome; }
	public int getDiasTrabalhados() { return diasTrabalhados; }
	public double getHorasTrabalhadas() { return horasTrabalhadas; }
	public double getValorDaHora() { return valorDaHora; }
	public void setNome(String nome) { this.nome = nome; }
}