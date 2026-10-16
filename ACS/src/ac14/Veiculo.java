
package ac14;

import java.util.ArrayList;

public class Veiculo implements Seguravel {

	private String placa;
	private double capacidadeKg;
	private double valorMercado;
	private ArrayList<Entrega> entregas;

	public Veiculo(String placa, double capacidadeKg, double valorMercado) {
		this.placa = placa;
		this.capacidadeKg = capacidadeKg;
		this.valorMercado = valorMercado;
		this.entregas = new ArrayList<Entrega>();
	}

	public String getPlaca() { return placa; }
	public void setPlaca(String placa) { this.placa = placa; }

	public double getCapacidadeKg() { return capacidadeKg; }
	public void setCapacidadeKg(double capacidadeKg) { this.capacidadeKg = capacidadeKg; }

	public double getValorMercado() { return valorMercado; }
	public void setValorMercado(double valorMercado) { this.valorMercado = valorMercado; }

	public ArrayList<Entrega> getEntregas() { return entregas; }

	public void adicionarEntrega(Entrega entrega) {
		entregas.add(entrega);
	}

	public boolean podeTransportar(double peso) {
		boolean pode = false;
		if (peso > 0 && peso <= capacidadeKg) {
			pode = true;
		} else {
			pode = false;
		}
		return pode;
	}

	public double calcularSeguro() {
		return valorMercado * 0.04;
	}

	public void exibirDados() {
		System.out.printf("Placa: %s | Capacidade: %.1f kg | Valor: R$ %.2f | Seguro: R$ %.2f%n",
				placa, capacidadeKg, valorMercado, calcularSeguro());
	}
}
