package ac5;

import java.util.Scanner;

import ac5.Cilindro;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Cilindro cilindro = new Cilindro();
		
		System.out.println("Altura: ");
		cilindro.altura = teclado.nextDouble();
		teclado.nextLine();
		
		System.out.println("Raio: ");
		cilindro.raio = teclado.nextDouble();
		teclado.nextLine();
		
		System.out.println("###################");
		System.out.println("Aluno: "+ cilindro.altura);
		System.out.println("Raio: "+ cilindro.raio);
		System.out.printf("Area do cilindro: %.2f\n", cilindro.CalculadorArea());
		System.out.printf("Volume do cilindro: %.2f\n", cilindro.CalculadorVolume());
		System.out.println("###################");

	}

}
