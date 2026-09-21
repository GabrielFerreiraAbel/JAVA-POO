package ac11;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Cestas> cestas = new ArrayList<Cestas>();
		
		int opcao;
		String continuar;
		
		int codigoCesta;
		double valorFinal;
		
		int codigoProduto;
		String nomeProduto;
		double preco;
		int indiceCestaEscolhida;
		
		boolean validar;
		
		
		
		do {
			
			System.out.println("1 - Cadastrar cestas de compras da loja.");
			System.out.println("2 - Adicionar produtos a uma cesta existente.");
			System.out.println("3 - Fechar cesta e apresentar os produtos adicionados.");
			System.out.println("0 - SAIR.");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
			
			case 1:
				do {
					
					validar = true;
					
					System.out.println("Digite o id da cesta: ");
					codigoCesta = sc.nextInt();
					sc.nextLine();
					
					for(Cestas c: cestas) {
						
						if(c.getCodigo() == codigoCesta) {
							validar = false;
							
							System.out.println("Essa cesta já existe.");
							break;
						}
					}
					
					valorFinal = 0;
					
					if(validar) {
						
						Cestas cesta = new Cestas(codigoCesta, valorFinal);
						cestas.add(cesta);
						
					}
					
					
					System.out.println("Deseja adicionar mais alguma cesta? ");
					continuar = sc.nextLine();
					
					
				}while(continuar.equals("s") || continuar.equals("S"));
				break;
			
			case 2:
				do {
					
					validar = true;
					
					if(cestas.size() == 0) {
						System.out.println("Crie primeiro uma cesta para adicionar o produto: ");
					}
					else {
						System.out.println("Digite o código do produto: ");
						codigoProduto = sc.nextInt();
						sc.nextLine();
						
						for(int i = 0; i < cestas.size(); i++) {
							
							Cestas cestaDaVez = cestas.get(i);
							
							for(Produto p: cestaDaVez.getProdutos()) {
								
								if(p.getCodigo() == codigoProduto) {
									
									validar = false;
									break;
								}
							}
							
						}
						
						if(validar == false) {
							
							System.out.println("Esse produto já existe.");
							break;
						}
						
						System.out.println("Nome do produto: ");
						nomeProduto = sc.nextLine();
						
						System.out.println("Preço do produto: ");
						preco = sc.nextDouble();
						
						System.out.println("==== CESTAS ===");
						for(int i = 0; i < cestas.size(); i++) {
							
							Cestas cestaDaVez = cestas.get(i);
							System.out.println("Índice: " + (i + 1));
							cestaDaVez.exibirDados();
						}
						
						System.out.println("Digite o índice da cesta que deseja adicionar o produto: ");
						indiceCestaEscolhida = sc.nextInt();
						sc.nextLine();
						
						if(indiceCestaEscolhida < 1 || indiceCestaEscolhida > cestas.size()) {
							System.out.println("Posição inválida.");
							
						}else {
							
							Cestas cestaDaVez = cestas.get(indiceCestaEscolhida - 1);
							Produto produto = new Produto(codigoProduto, nomeProduto, preco, cestaDaVez);
							
							cestaDaVez.adicionarProduto(produto);
							cestaDaVez.valorFinal(produto);
			
						}
					}
				
					
					System.out.println("Deseja adicionar mais alguma cesta? ");
					continuar = sc.nextLine();
					
					
				}while(continuar.equals("s") || continuar.equals("S"));
				
				break;
				
			case 3:
				
				if(cestas.size() == 0) {
					
					System.out.println("Antes cadastre uma cesta.");
					break;
				};
				
				for(int i = 0; i < cestas.size(); i++) {
					
					System.out.println("==== CESTA ====");
					Cestas cestaAgora = cestas.get(i);
					cestaAgora.exibirDados();
					
					System.out.println("=== PRODUTOS ===");
					for(Produto p: cestaAgora.getProdutos()) {
						p.exibirDados();
					}
					
					System.out.println("Valor final da cesta: " + cestaAgora.getValorFinal());
					
					System.out.println("");
				}
				break;
				
			case 0:
				System.out.println("Saindo.");
				break;
				
			default:
				System.out.println("Opção inválida.");
				break;
			}
			
			
				
			
				
			
		}while(opcao != 0);

	}

}
