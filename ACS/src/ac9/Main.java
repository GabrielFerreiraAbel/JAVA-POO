package ac9;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		ArrayList <Comprador> compradores = new ArrayList<Comprador>();
		String resposta = "";
		String nome, cpf, descricaoShow;
		int numeroBilhete;
		
		
		do {
			
			System.out.println("Digite seu nome: ");
			nome = sc.nextLine();
			
			System.out.println("Digite seu cpf: ");
			cpf = sc.nextLine();
			
			System.out.println("Número do Ingresso: ");
			numeroBilhete = sc.nextInt();
			
			System.out.println("Qual o evento: ");
			descricaoShow = sc.nextLine();
			sc.nextLine();
			
			System.out.println("Deseja registrar outra venda? ");
			resposta = sc.nextLine();
			
			Bilhete bilhete = new Bilhete(numeroBilhete, descricaoShow);
			Comprador comprador = new Comprador(nome, cpf);
			
			comprador.setBilhete(bilhete);
			compradores.add(comprador);
			
		}while(resposta.equals("S") || resposta.equals("s"));
		
		for(Comprador c: compradores) {
			c.exibirDados();
			c.getBilhete().exibirDados();
		}
		
	}

}
