package ac3;

import java.util.Locale;
import java.util.Scanner;

public class Ac3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String aluno;
		float n1, n2, faltas;
		float aulas = 40;
		float total, media;
		float p_faltas;
		String nota_final;
		String aprovacao;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nome: ");
		aluno = teclado.nextLine();
		teclado.nextLine();
		
		System.out.println("Nota 1: ");
		n1 = teclado.nextFloat();
		teclado.nextLine();
		
		System.out.println("Nota 2: ");
		n2 = teclado.nextFloat();
		teclado.nextLine();
		
		System.out.println("Faltas: ");
		faltas = teclado.nextFloat();
		teclado.nextLine();
		
		p_faltas = (faltas/aulas) * 100;
		total = n1 + n2;
		media = total/2;
		
		if(media >= 9) {
			nota_final = "A";
		}else if(media >= 8 && media < 9){
			nota_final = "B";
		}else if(media >= 7 && media < 8){
			nota_final = "C";
		}else if(media >= 5 && media < 7){
			nota_final = "D";
		}else{
			nota_final = "E";
		}
		
		if(media >= 7 && faltas < 75){
			aprovacao = "Aprovado";
		}else{
			aprovacao = "Reprovado";
		}
		
		System.out.println("########### RESULTADO FINAL ###########");
		System.out.println("Nome do aluno: " + aluno);
		System.out.println("Nota da prova 1: " + n1);
		System.out.println("Nota da prova 2: " + n2);
		System.out.println("Quantidade de faltas: " + p_faltas + "%");
		System.out.println("Status: " + aprovacao);
		System.out.printf("Conceito: %s", nota_final);

	}

}
