package ac5;

public class Cilindro {
	public double altura;
	public double raio;
	
	
	double CalculadorArea(){
		return 2 * Math.PI*raio* (raio + altura);
	}
	
	double CalculadorVolume(){
		return Math.PI * Math.pow(raio, 2) *altura;
	}
	
}
