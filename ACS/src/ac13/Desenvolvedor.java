package ac13;

public class Desenvolvedor extends Funcionario {

	private static double PERCENTUAL_BONUS = 0.50;

	public Desenvolvedor(String nome, int identificacao, double salarioMensal) {
		super(nome, identificacao, salarioMensal);
	}

	public double bonus() {
		return getSalarioMensal() * PERCENTUAL_BONUS;
	}

	@Override
	public double salarioFinal() {
		return getSalarioMensal() + bonus();
	}

	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.printf("Bonus (50%%): R$ %.2f%n", bonus());
	}
}
