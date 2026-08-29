package dia2;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);		
		
		Bomba b1 = new Bomba(6.50, 150.00);
		Carros c1 = new Carros("ABC - 1234", 40.00, "Land Rover");
		Carros c2 = new Carros("XYZ - 9876", 150.00, "Hilux");
		
		Carros selecionado = null;
		
		int opcao;
		double litrosPedidos;
		double valorAPagar;
		double litrosRealmenteAbastecidos;
		
		do {
			System.out.println("===== POSTO ABEL =====");
			System.out.println("1 - Abastecer carro " + c1.getModelo());
			System.out.println("2 - Abastecer " + c2.getModelo());
			System.out.println("0 - Sair");
			opcao = teclado.nextInt();
			
			if(opcao == 1){
				
				selecionado = c1;	
			}else if(opcao == 2) {
				
				selecionado = c2;
			}else if(opcao == 0) {
				System.out.println("Saindo...");
				break;
			}
			
			System.out.println("");
			System.out.println("Litros disponíveis " + b1.getEstoqueCombustivel());
			System.out.println("Digite quantos litros deseja: ");
			litrosPedidos = teclado.nextDouble();
			
			litrosRealmenteAbastecidos = b1.abastecer(selecionado, litrosPedidos);
			
			
			if(litrosRealmenteAbastecidos > 0){
				valorAPagar = litrosRealmenteAbastecidos * b1.getPrecoPorLitro();
				System.out.printf("\nPague RS%.2f\n", valorAPagar);
				
				System.out.println();
				System.out.println("Quantidade de litros disponível " + b1.getEstoqueCombustivel());
				System.out.println("Quantidade de litros no tanque "+ selecionado.getTanqueAgora());
				
				System.out.println("");
				System.out.println("##### ABASTECIMENTO #####");
				System.out.println("Placa do veículo: " +selecionado.getPlaca());
				System.out.println("Litros solicitados: " +litrosPedidos);
				System.out.println("Litros abastecidos: " + litrosRealmenteAbastecidos);
				System.out.println("Valor a pagar: " + valorAPagar);
				System.out.println("Tanque do veiculo: " + selecionado.getTanqueAgora());
				System.out.println("Estoque da bomba: " +b1.getEstoqueCombustivel());
				System.out.println("Faturamento do dia: " +b1.getFaturamentoDia());
				
			}else {
				System.out.println("Seu tanque no momento não comporta a quantidade de combustível solicitada.");
			}
			
			
		}while(opcao != 0);
		
	}

}
