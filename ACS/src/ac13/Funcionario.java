package ac13;

public class Funcionario {

	private String nome;
	private int identificacao;
	private double salarioMensal;

	public Funcionario(String nome, int identificacao, double salarioMensal) {
		this.nome = nome;
		this.identificacao = identificacao;
		this.salarioMensal = salarioMensal;
	}

	public String getNome() {
		return nome;
	}

	public int getIdentificacao() {
		return identificacao;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public double salarioFinal() {
		return salarioMensal;
	}

	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Identificacao: " + identificacao);
		System.out.printf("Salario mensal: R$ %.2f%n", salarioMensal);
		System.out.printf("Salario final: R$ %.2f%n", salarioFinal());
	}
}
