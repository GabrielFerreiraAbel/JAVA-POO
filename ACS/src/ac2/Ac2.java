package ac2;

import java.util.Locale;
import java.util.Scanner;

public class Ac2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double a, b, c;
		double delta;
		double r_delta;
		double x1, x2;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("a: ");
		a = teclado.nextFloat();
		teclado.nextLine();
		
		System.out.println("b: ");
		b = teclado.nextFloat();
		teclado.nextLine();
		
		System.out.println("c: ");
		c = teclado.nextFloat();
		teclado.nextLine();
		
		delta = ((b * b) - (4 * a * c));
		r_delta = (double) Math.sqrt(delta);
		
		if(delta < 0){
			System.out.println("Delta não pode ser menor que zero");
			System.exit(0);
		}
		
		x1 = ((-b + Math.sqrt(delta))/ (2 * a));
		x2 = ((-b - Math.sqrt(delta))/ (2 * a));
		
		System.out.println("Delta: " + delta);
		System.out.println("Resultado x1: " + x1);
		System.out.println("Resultado x2: " + x2);
		
		teclado.close();
	}

}
