package dia1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Elevador elevador = new Elevador(10,8);
		
		int opcao;
		
		do {
			System.out.println("Andar: " + elevador.getAndarAtual());
			System.out.println("Pessoas: " + elevador.getPessoasDentro());
			System.out.println("1 - Subir");
			System.out.println("2 - Descer");
			System.out.println("3 - Entrar");
			System.out.println("4 - Sair");
			System.out.println("0 - Encerrar");
			opcao = teclado.nextInt();
			
			switch(opcao){
			case 1:
				if(elevador.subir()) {
					System.out.println("Subiu.");
				}else {
					System.out.println("Estamos no andar mais alto, não da para subir mais.");
				}
				
				break;
				
			case 2:
				if(elevador.descer()) {
					System.out.println("Desceu.");
				}else {
					System.out.println("Estamos no andar mais baixo, não tem como descer mais.");
				}
				
				break;
				
			case 3:
				if(elevador.entrar()){
					System.out.println("Entrou.");
				}else {
					System.out.println("Elevador cheio!");
				}
				
				break;
				
			case 4:
				if(elevador.sair()) {
					System.out.println("Saiu.");
				}else {
					System.out.println("Não ha ninguém para sair do elevador!");
				}
				
				break;
			
			}
			
		}while(opcao != 0);
		
		
		
		
	}

}
