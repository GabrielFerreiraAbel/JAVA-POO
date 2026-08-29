package dia3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Filiais origem = new Filiais("Abel's", "1234", 400, 1000, 8000.00);
		Filiais destino = new Filiais("Gabriel's", "5678", 950, 1000, 5000.00);
		Scanner teclado = new Scanner(System.in);

		String senhaDigitada;
		int opcao = -1;
		int tentativas = 0;
		int caixas = 0;
		String situacao = "NULL";
		double custoTotal = 0;
		String transporte = "NULL";
		double taxa = 0;
		boolean autenticado = false;

		while (tentativas < 3 && !autenticado) {
			System.out.println("Digite sua senha para entrar no sistema: ");
			senhaDigitada = teclado.nextLine();

			if (origem.autenticar(senhaDigitada)) {
				autenticado = true;
			} else {
				tentativas++;
				if (tentativas < 3) {
					System.out.println("Senha incorreta. Tentativas restantes: " + (3 - tentativas));
				}
			}
		}

		if (!autenticado) {
			System.out.println("ACESSO BLOQUEADO: 3 tentativas incorretas.");
			teclado.close();
			return;
		}

		System.out.println("Acesso liberado. Bem-vindo(a), " + origem.getNome() + "!");

		do {

			int estoqueInicialOrigem = origem.getEstoqueCaixas();
			int estoqueInicialDestino = destino.getEstoqueCaixas();

			System.out.println("");
			System.out.println("#### MENU ###");
			System.out.println("1 - VAN");
			System.out.println("2 - CAMINHAO");
			System.out.println("3 - CARRETA");
			System.out.println("0 - SAIR");
			opcao = teclado.nextInt();

			if (opcao == 0) { break; }

			int limite = 0;

			// O switch agora so ESCOLHE os valores. A validacao vem depois, uma vez so.
			switch (opcao) {
			case 1:
				transporte = "VAN";      taxa = 0;      limite = 50;         break;
			case 2:
				transporte = "CAMINHAO"; taxa = 80;     limite = 300;        break;
			case 3:
				transporte = "CARRETA";  taxa = 250;    limite = 999999999;  break;
			default:
				System.out.println("Opcao invalida.");
				continue;
			}

			System.out.println("Digite quantas caixas ira transferir para o destino: ");
			caixas = teclado.nextInt();

			if (caixas <= 0) {
				situacao = "NEGADA (quantidade invalida)";
			} else if (caixas > limite) {
				situacao = "NEGADA (acima do limite da " + transporte + ": " + limite + ")";
			} else if (caixas > origem.getEstoqueCaixas()) {
				situacao = "NEGADA (estoque insuficiente na origem)";
			} else if (caixas > destino.espacoLivre()) {
				situacao = "NEGADA (galpao de destino sem espaco: cabem " + destino.espacoLivre() + ")";
			} else {
				situacao = "REALIZADA";
				origem.enviar(caixas);
				destino.receber(caixas);
				origem.pagarFrete(taxa);
				custoTotal += taxa;
			}

			System.out.println("");
			System.out.println("##### TRANSFERENCIA DE ESTOQUE #####");
			System.out.println("Estoque inicial da origem: " + estoqueInicialOrigem + " caixas");
			System.out.println("Estoque inicial do destino: " + estoqueInicialDestino + " caixas");
			System.out.println("Tipo de transporte: " + transporte);
			System.out.printf("Taxa de frete: R$ %.2f%n", taxa);
			System.out.println("Quantidade transferida: " + caixas + " caixas");
			System.out.println("Resultado: " + situacao);
			System.out.println("Estoque final da origem: " + origem.getEstoqueCaixas() + " caixas");
			System.out.println("Estoque final do destino: " + destino.getEstoqueCaixas() + " caixas");
			System.out.printf("Custo total de frete do dia: R$ %.2f%n", custoTotal);

		} while (opcao != 0);

		System.out.println("");
		System.out.println("Sistema encerrado.");
		teclado.close();
	}
}