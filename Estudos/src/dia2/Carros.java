package dia2;

public class Carros {
	
	private String placa;
	private double capacidadeTanque;
	private double tanqueAgora;
	private String modelo;
	
	
	public Carros(String placa, double capacidadeTanque, String modelo) {
		this.placa = placa;
		this.capacidadeTanque = capacidadeTanque;
		this.tanqueAgora = 0;
		this.modelo = modelo;
	}
	
	public double espacoLivre() {
	    return capacidadeTanque - tanqueAgora;
	}
	
	public void receber(double litrosPedidos){
		tanqueAgora += litrosPedidos;
	}


	public String getPlaca() {
		return placa;
	}
	
	public String getModelo() {
		return modelo;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}


	public void setCapacidadeTanque(float capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}


	public double getTanqueAgora() {
		return tanqueAgora;
	}


	public void setTanqueAgora(float tanqueAgora) {
		this.tanqueAgora = tanqueAgora;
	}
	
	
	
	
	
}
