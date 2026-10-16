package ac14;

public class Entrega {

	private int codigo;
	private String destino;
	private double pesoKg;
	private boolean status;
	private Veiculo veiculo;

	public Entrega(int codigo, String destino, double pesoKg) {
		this.codigo = codigo;
		this.destino = destino;
		this.pesoKg = pesoKg;
		this.status = false;
	}

	public int getCodigo() { return codigo; }
	public String getDestino() { return destino; }
	public double getPesoKg() { return pesoKg; }

	public boolean getStatus() { return status; }
	public void setStatus(boolean status) { this.status = status; }

	public Veiculo getVeiculo() { return veiculo; }
	public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }

	public void exibirDados() {
		String textoStatus = "";
		if (status) {
			textoStatus = "ENTREGUE";
		} else {
			textoStatus = "PENDENTE";
		}
		System.out.printf("Codigo: %d | Destino: %s | Peso: %.1f kg | Status: %s | Veiculo: %s%n",
				codigo, destino, pesoKg, textoStatus, veiculo.getPlaca());
	}
}