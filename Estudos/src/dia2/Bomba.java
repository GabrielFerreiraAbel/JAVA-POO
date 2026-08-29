package dia2;

public class Bomba {
	
	private double precoPorLitro;
	private double estoqueCombustivel;
	private double faturamentoDia;
	
	
	public Bomba(double precoPorLitro, double estoqueCombustivel) {
		this.precoPorLitro = precoPorLitro;
		this.estoqueCombustivel = estoqueCombustivel;
		this.faturamentoDia = 0;
	}
	
	public double abastecer(Carros carro, double litrosPedidos) {
	    double litros = Math.min(litrosPedidos, Math.min(estoqueCombustivel, carro.espacoLivre()));
	    estoqueCombustivel -= litros;
	    carro.receber(litros);
	    faturamentoDia += litros * precoPorLitro;
	    return litros;
	}
	


	public double getPrecoPorLitro() {
		return precoPorLitro;
	}


	public void setPrecoPorLitro(float precoPorLitro) {
		this.precoPorLitro = precoPorLitro;
	}


	public double getEstoqueCombustivel() {
		return estoqueCombustivel;
	}


	public void setEstoqueCombustivel(float estoqueCombustivel) {
		this.estoqueCombustivel = estoqueCombustivel;
	}


	public double getFaturamentoDia() {
		return faturamentoDia;
	}


	public void setFaturamentoDia(float faturamentoDia) {
		this.faturamentoDia = faturamentoDia;
	}
	
	
	
	
}
