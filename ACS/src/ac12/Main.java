package ac12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<Desenvolvedor>();
		ArrayList<Projeto> projetos = new ArrayList<Projeto>();
		
		int opcao;
		String continuar;
		
		String nome;
		String especialidade;
		double salario;
		
		String nomeProjeto;
		int meses;
		double orcamento;
		
		int indiceProjeto;
		int indiceDesenvolvedor;
		
		do {
			System.out.println("1 - CADASTRAR DESENVOLVEDORES.");
			System.out.println("2 - CADASTRAR PROJETO.");
			System.out.println("3 - ASSOCIAR DESENVOLVEDORES A PROJETOS.");
			System.out.println("4 - EXIBIR");
			System.out.println("0 - SAIR.");
			
			System.out.println("Digite a opção: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
			
			case 1:
				
				do {
					
					System.out.println("NOME: ");
					nome = sc.nextLine();
					
					System.out.println("ESPECIALIDADE: ");
					especialidade = sc.nextLine();
					
					System.out.println("SALÁRIO: ");
					salario = sc.nextDouble();
					sc.nextLine();
					
					Desenvolvedor desenvolvedor = new Desenvolvedor(nome, especialidade, salario);
					desenvolvedores.add(desenvolvedor);
					
					System.out.println("Deseja cadastrar mais um desenvolvedor? ");
					continuar = sc.nextLine();
					
				}while(continuar.equals("S") || continuar.equals("s"));
				
				break;
				
			case 2:
				
				do {
					
					System.out.println("NOME DO PROJETO: ");
					nomeProjeto = sc.nextLine();
					
					System.out.println("PRAZO: ");
					meses = sc.nextInt();
					
					System.out.println("ORÇAMENTO: ");
					orcamento = sc.nextDouble();
					sc.nextLine();
					
					Projeto projeto = new Projeto(nomeProjeto, meses, orcamento);
					projetos.add(projeto);
					
					System.out.println("Deseja cadastrar mais um projeto? ");
					continuar = sc.nextLine();
					
				}while(continuar.equals("S") || continuar.equals("s"));
				
				break;
				
			
			case 3:
				
				do {
					
					System.out.println("Projetos");
					
					for(int i = 0; i < projetos.size(); i++) {
						
						Projeto projetoDaVez = projetos.get(i);
						System.out.println("ÍNDICE: " + (i + 1));
						System.out.println(projetoDaVez.toString());
					}
					
					System.out.println("");
					
					System.out.println("Digite o índice do projeto escolhido.");
					indiceProjeto = sc.nextInt();
					sc.nextLine();
					
					Projeto projeto = projetos.get(indiceProjeto - 1);
					
					System.out.println("Desenvolvedores");
					
					for(int i = 0; i < desenvolvedores.size(); i++) {
						
						Desenvolvedor desenvolvedorDaVez = desenvolvedores.get(i);
						System.out.println("ÍNDICE: " + (i + 1));
						System.out.println(desenvolvedorDaVez.toString());
						
					}
					System.out.println("");
					
					System.out.println("Digite o índice do desenvolvedor.");
					indiceDesenvolvedor = sc.nextInt();
					sc.nextLine();
					
					Desenvolvedor desenvolvedor = desenvolvedores.get(indiceDesenvolvedor - 1);
					projeto.adicionarDesenvolvedor(desenvolvedor);
					desenvolvedor.adicionarProjeto(projeto); 
					
					System.out.println("Deseja continuar? ");
					continuar = sc.nextLine();
					
				}while(continuar.equals("S") || continuar.equals("s"));
				
				break;
				
			case 4:
				
				System.out.println("Projetos e seus desenvolvedores.");
				for(Projeto p: projetos) {
					System.out.println(p.toString());
					
					System.out.println("Desenvolvedores.");
					for(Desenvolvedor d: p.getDesenvolvedores()) {
						System.out.println(d.toString());
					}
				}
				
				System.out.println("");
				System.out.println("Desenvolvedores e seus projetos.");
				for(Desenvolvedor d: desenvolvedores) {
					System.out.println(d.toString());
					System.out.println("Projetos");
					for(Projeto p: d.getProjetos()) {
						System.out.println(p.toString());
					}
				}
				
				break;
				
			case 0:
				System.out.println("Saindo...");
				break;
				
			default:
				System.out.println("Opção não existente.");
				break;
			}
			
		}while(opcao != 0);
	}

}