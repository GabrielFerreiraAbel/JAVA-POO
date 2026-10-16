package ac14;

public class Motocicleta extends Veiculo {

	private static double CAPACIDADE_MOTO = 25;

	private int cilindradas;

	public Motocicleta(String placa, double valorMercado, int cilindradas) {
		super(placa, CAPACIDADE_MOTO, valorMercado);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() { return cilindradas; }
	public void setCilindradas(int cilindradas) { this.cilindradas = cilindradas; }

	public void exibirDados() {
		super.exibirDados();
		System.out.println("  Motocicleta | Cilindradas: " + cilindradas);
	}
}