package ac14;

public class Caminhao extends Veiculo {

	private static double CAPACIDADE_CAMINHAO = 8000;

	private String tipoCarroceria;

	public Caminhao(String placa, double valorMercado, String tipoCarroceria) {
		super(placa, CAPACIDADE_CAMINHAO, valorMercado);
		this.tipoCarroceria = tipoCarroceria;
	}

	public String getTipoCarroceria() { return tipoCarroceria; }
	public void setTipoCarroceria(String tipoCarroceria) { this.tipoCarroceria = tipoCarroceria; }

	public void exibirDados() {
		super.exibirDados();
		System.out.println("  Caminhao | Carroceria: " + tipoCarroceria);
	}
}