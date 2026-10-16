package ac14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

		int opcao;
		
		do {
			
			System.out.println();
			System.out.println("=== TRANSPORTADORA ===");
			System.out.println("1 - CADASTRAR MOTOCICLETA.");
			System.out.println("2 - CADASTRAR CAMINHAO.");
			System.out.println("3 - REGISTRAR ENTREGA.");
			System.out.println("4 - ALTERAR STATUS DE UMA ENTREGA.");
			System.out.println("5 - LISTAR VEICULOS E ENTREGAS.");
			System.out.println("0 - SAIR.");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
			
			case 1:
				
				System.out.print("Placa: ");
				String placaMoto = sc.nextLine();

				boolean placaMotoExiste = false;
				for (Veiculo v : veiculos) {
					if (v.getPlaca().equals(placaMoto)) {
						placaMotoExiste = true;
					}
				}

				if (placaMotoExiste) {
					System.out.println("Placa ja cadastrada!");
				} else {
					System.out.print("Valor de mercado: ");
					double valorMoto = sc.nextDouble();
					sc.nextLine();
					System.out.print("Cilindradas: ");
					int cilindradas = sc.nextInt();
					sc.nextLine();

					veiculos.add(new Motocicleta(placaMoto, valorMoto, cilindradas));
					System.out.println("Motocicleta cadastrada!");
				}
				break;
				
			case 2:
				
				System.out.print("Placa: ");
				String placaCaminhao = sc.nextLine();

				boolean placaCaminhaoExiste = false;
				for (Veiculo v : veiculos) {
					if (v.getPlaca().equals(placaCaminhao)) {
						placaCaminhaoExiste = true;
					}
				}

				if (placaCaminhaoExiste) {
					System.out.println("Placa ja cadastrada!");
				} else {
					System.out.print("Valor de mercado: ");
					double valorCaminhao = sc.nextDouble();
					sc.nextLine();
					System.out.print("Tipo de carroceria (Bau / Aberta / Frigorifica): ");
					String tipoCarroceria = sc.nextLine();

					if (tipoCarroceria.equals("Bau") || tipoCarroceria.equals("Aberta")
							|| tipoCarroceria.equals("Frigorifica")) {

						veiculos.add(new Caminhao(placaCaminhao, valorCaminhao, tipoCarroceria));
						System.out.println("Caminhao cadastrado!");

					} else {
						System.out.println("Tipo de carroceria invalido!");
					}
				}
				break;
				
			case 3:
				
				if (veiculos.size() == 0) {
					System.out.println("Nenhum veiculo cadastrado!");
				} else {
					for (int i = 0; i < veiculos.size(); i++) {
						System.out.println((i + 1) + " - " + veiculos.get(i).getPlaca());
					}

					System.out.print("Escolha o veiculo: ");
					int indice = sc.nextInt();
					sc.nextLine();

					Veiculo veiculoEscolhido = veiculos.get(indice - 1);

					System.out.print("Codigo da entrega: ");
					int codigo = sc.nextInt();
					sc.nextLine();
					System.out.print("Destino: ");
					String destino = sc.nextLine();
					System.out.print("Peso (kg): ");
					double pesoKg = sc.nextDouble();
					sc.nextLine();

					if (veiculoEscolhido.podeTransportar(pesoKg)) {

						Entrega entrega = new Entrega(codigo, destino, pesoKg);
						entrega.setVeiculo(veiculoEscolhido);
						veiculoEscolhido.adicionarEntrega(entrega);
						System.out.println("Entrega registrada!");

					} else {
						System.out.printf("Peso invalido! O veiculo %s suporta de 0 ate %.1f kg.%n",
								veiculoEscolhido.getPlaca(), veiculoEscolhido.getCapacidadeKg());
					}
				}
				break;
				
			case 4:
				
				System.out.print("Codigo da entrega: ");
				int codigoBusca = sc.nextInt();
				sc.nextLine();

				boolean achou = false;
				for (Veiculo v : veiculos) {
					for (Entrega e : v.getEntregas()) {
						if (e.getCodigo() == codigoBusca) {
							e.setStatus(true);
							achou = true;
						}
					}
				}

				if (achou) {
					System.out.println("Entrega marcada como ENTREGUE!");
				} else {
					System.out.println("Entrega nao encontrada!");
				}
				break;
				
			case 5:
				if (veiculos.size() == 0) {
					System.out.println("Nenhum veiculo cadastrado!");
				} else {
					for (Veiculo v : veiculos) {
						v.exibirDados();

						if (v.getEntregas().size() == 0) {
							System.out.println("  (sem entregas)");
						} else {
							for (Entrega e : v.getEntregas()) {
								System.out.print("  ");
								e.exibirDados();
							}
						}
						System.out.println();
					}
				}
				break;
				
			case 0:
				System.out.println("SAINDO...");
				break;
				
			default:
				System.out.println("Essa opção é não existe.");
				break;
				
			}
			
			
		}while(opcao != 0);
	}

}
