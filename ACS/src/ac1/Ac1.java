package ac1;

import java.util.Locale;
import java.util.Scanner;

public class Ac1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		String n1, n2, n3;
		float s1, s2, s3;
		float st;
		double media;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Inserir nome 1: ");
		n1 = teclado.nextLine();
		teclado.nextLine();
		
		System.out.println("Inserir salário 1: ");
		s1 = teclado.nextFloat();
		teclado.nextLine();
		
		System.out.println("Inserir nome 2: ");
		n2 = teclado.nextLine();
		teclado.nextLine();
		
		System.out.println("Inserir salário 2: ");
		s2 = teclado.nextFloat();
		teclado.nextLine();
		
		System.out.println("Inserir nome 3: ");
		n3 = teclado.nextLine();
		teclado.nextLine();
		
		System.out.println("Inserir salário 3: ");
		s3 = teclado.nextFloat();
		teclado.nextLine();
		
		st = s1 + s2 + s3;
		media = (double) (s1 + s2 + s3)/ 3;
		
		System.out.println("Info F1: ");
		System.out.println("Salário: " + s1);
		System.out.println("Nome: " + n1);
		System.out.println("");
		System.out.println("Info F2");
		System.out.println("Salário: " + s2);
		System.out.println("Nome: " + n2);
		System.out.println("");
		System.out.println("Info F3: ");
		System.out.println("Salário: " + s3);
		System.out.println("Nome: " + n3);
		System.out.println("");
		System.out.println("Média Salarial: " + media);
		
		teclado.close();
	}

}
