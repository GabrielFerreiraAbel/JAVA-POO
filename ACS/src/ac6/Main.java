package ac6;

import java.util.Locale;    
import java.util.Scanner;     

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
		 
		ContaCorrente origem = new ContaCorrente(1001, "Gabriel Abel", "1234", 5000.00);
		ContaCorrente destino = new ContaCorrente(2002, "Maria Silva", "9876", 1200.00);
 
		System.out.println("========================================");
		System.out.printf("Conta de origem : %d - %s%n", origem.getNumero(), origem.getNomeCliente());
		System.out.printf("Conta de destino: %d - %s%n", destino.getNumero(), destino.getNomeCliente());
		System.out.println();
 
		int tentativas = 0;
		boolean autenticado = false;
 
		while (tentativas < Banco.MAX_TENTATIVAS && !autenticado) {
			System.out.print("Digite a senha da conta de origem: ");
			String senhaDigitada = teclado.nextLine();
 
			if (origem.autenticar(senhaDigitada)) {
				autenticado = true;
			} else {
				tentativas++;
				int restantes = Banco.MAX_TENTATIVAS - tentativas;
				if (restantes > 0) {
					System.out.println("Senha incorreta. Tentativas restantes: " + restantes);
				}
			}
		}
 
		if (!autenticado) {
			System.out.println();
			System.out.println("ACESSO BLOQUEADO                      ");
			System.out.println("3 tentativas incorretas de senha.     ");
			teclado.close();
			return;  
		}
 
		System.out.println();
		System.out.println("Acesso liberado. Bem-vindo, " + origem.getNomeCliente() + "!");
 
		
		String continuar;
 
		do {
			
			double saldoInicialOrigem = origem.getSaldo();
			double saldoInicialDestino = destino.getSaldo();
 
			int opcao = 0;
			while (opcao < 1 || opcao > 3) {
				System.out.println();
				System.out.println("1 - PIX  (sem taxa,        limite R$    500,00)");
				System.out.println("2 - DOC  (taxa R$  5,00,   limite R$  4.999,99)");
				System.out.println("3 - TED  (taxa R$ 10,50,   sem limite)");
				System.out.print("Opcao: ");
				opcao = teclado.nextInt();
				teclado.nextLine();   
				
				if (opcao < 1 || opcao > 3) {
					System.out.println("Opcao invalida. Escolha 1, 2 ou 3.");
				}
			}
 
			String tipo;
			double taxa;
			double limite;
 
			if (opcao == 1) {
				tipo = "PIX";
				taxa = Banco.TAXA_PIX;
				limite = Banco.LIMITE_PIX;
			} else if (opcao == 2) {
				tipo = "DOC";
				taxa = Banco.TAXA_DOC;
				limite = Banco.LIMITE_DOC;
			} else {
				tipo = "TED";
				taxa = Banco.TAXA_TED;
				limite = Banco.LIMITE_TED;
			}
 
			System.out.print("Valor da transferencia (R$): ");
			double valor = teclado.nextDouble();
			teclado.nextLine();   
 
			boolean realizada = false;
			String motivo = "";
 
			if (valor <= 0) {
				motivo = "valor invalido (precisa ser maior que zero)";
			} else if (valor > limite) {
				motivo = String.format("valor acima do limite do %s (R$ %.2f)", tipo, limite);
			} else {
				
				realizada = origem.transferirPara(destino, valor, taxa);
				if (!realizada) {
					motivo = String.format("saldo insuficiente (necessario R$ %.2f com a taxa)", valor + taxa);
				}
			}
 
			System.out.println();
			System.out.println("########## COMPROVANTE ##########");
			System.out.printf("Saldo inicial da origem  : R$ %.2f%n", saldoInicialOrigem);
			System.out.printf("Saldo inicial do destino : R$ %.2f%n", saldoInicialDestino);
			System.out.printf("Tipo de transferencia    : %s%n", tipo);
			System.out.printf("Valor da taxa            : R$ %.2f%n", taxa);
			System.out.printf("Valor da transferencia   : R$ %.2f%n", valor);
			if (realizada) {
				System.out.println("Resultado                : REALIZADA");
			} else {
				System.out.println("Resultado                : NEGADA (" + motivo + ")");
			}
			System.out.printf("Saldo final da origem    : R$ %.2f%n", origem.getSaldo());
			System.out.printf("Saldo final do destino   : R$ %.2f%n", destino.getSaldo());
			System.out.println("#################################");
 
			System.out.println();
			System.out.print("Deseja realizar outra transferencia? (S/N): ");
			continuar = teclado.nextLine();
 
		} while (continuar.equalsIgnoreCase("S")); 
 
		System.out.println();
		System.out.println("Sessao encerrada. Ate logo, " + origem.getNomeCliente() + "!");
		teclado.close();
		
		

	}

}
