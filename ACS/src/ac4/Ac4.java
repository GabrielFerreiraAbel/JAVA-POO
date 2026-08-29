package ac4;

import java.util.Scanner;

public class Ac4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float so = 30000, sd = 2300;
		float transacao;
		String senha = "J@vaPOO";
		String u_senha;
		int opcao;
		int t = 0;
		String status_t;
		
		do{
			System.out.println("Digite a senha para entrar no sistema: ");
			u_senha = sc.next();
			sc.nextLine();
			
			if(u_senha.equals(senha)){
				System.out.println("TIPO DE TRANSFERÊNCIA");
				System.out.println("PIX - 1");
				System.out.println("DOC - 2");
				System.out.println("TED - 3");
				System.out.println("Opção: ");
				opcao = sc.nextInt();
				sc.nextLine();
				
				switch(opcao){
				case 1:
					System.out.println("Digite o valor da transação(PIX): ");
					transacao = sc.nextFloat();
					sc.nextLine();
					
					if(transacao <= so){
						if(transacao > 500){
							status_t = "Reprovado";
							System.out.println("A transação tem um limite máximo de 500 por transação");
							break;
						}
						else {
							status_t = "Aprovado";
							so -= transacao;
							sd += transacao;
							System.out.println("Transação: " + transacao + " Saldo destino: " + sd + " Saldo origem: " + so);
						}
						
					}else {
						status_t = "Reprovado";
						System.out.println("Saldo indisponível");
						break;
					}
					
					System.out.println(" ");
					System.out.println("Saldo inicial de origem: 3000");
					System.out.println("Saldo inicial de destino: 2300");
					System.out.println("Tipo de transferência: PIX");
					System.out.println("Valor da taxa: 0");
					System.out.println("Valor da transferência: R$" + transacao);
					System.out.println("Resultado da operação: "+ status_t);
					System.out.println("Saldo final da operação(saldo de origem): "+ so);
					System.out.println("Saldo final da operação(saldo de destino): "+ sd);
					
					
					break;
					
				case 2:
					so -= 5;
					System.out.println("Digite o valor da transação(DOC): ");
					transacao = sc.nextFloat();
					sc.nextLine();
					if(transacao <= so) 
					{
						if(transacao > 4999.99){
							status_t = "Reprovado";
							System.out.println("Limite atingido");
						}
						else{
							status_t = "Aprovado";
							so -= transacao;
							sd += transacao;
							System.out.println("Transação: " + transacao + " Saldo destino: " + sd + " Saldo origem: " + so);
						}
					}else{
						status_t = "Reprovado";
						System.out.println("Saldo indisponível");
						break;
					}
					
					System.out.println(" ");
					System.out.println("Saldo inicial de origem: 3000");
					System.out.println("Saldo inicial de destino: 2300");
					System.out.println("Tipo de transferência: DOC");
					System.out.println("Valor da taxa: R$ 5,00");
					System.out.println("Valor da transferência: R$" + transacao);
					System.out.println("Resultado da operação: "+ status_t);
					System.out.println("Saldo final da operação(saldo de origem): "+ so);
					System.out.println("Saldo final da operação(saldo de destino): "+ sd);
					
					break;
					
				case 3:
					so -= 10.50;
					System.out.println("Digite o valor da transação(TED): ");
					transacao = sc.nextFloat();
					sc.nextLine();
					
					if(transacao <= so) 
					{
						if(transacao > 4999.99){
							status_t = "Reprovado";
							System.out.println("Limite atingido");
						}
						else{
							status_t = "Aprovado";
							so -= transacao;
							sd += transacao;
							System.out.println("Transação" + transacao + " Saldo destino" + sd + " Saldo origem" + so);
						}
					}else{
						status_t = "Reprovado";
						System.out.println("Saldo indisponível");
						break;
					}
					
					System.out.println(" ");
					System.out.println("Saldo inicial de origem: 3000");
					System.out.println("Saldo inicial de destino: 2300");
					System.out.println("Tipo de transferência: TED");
					System.out.println("Valor da taxa: R$ 10,50");
					System.out.println("Valor da transferência: R$" + transacao);
					System.out.println("Resultado da operação: "+ status_t);
					System.out.println("Saldo final da operação(saldo de origem): "+ so);
					System.out.println("Saldo final da operação(saldo de destino): "+ sd);
					
					break;
					
					
					default:
						System.out.println("Opção não disponível");
						break;
				}
				
			}
			else {
				t++;
				System.out.println("Senha incorreta, digite novamente, restam" + t + "tentativas");
			}
			
		}while(t < 3);
		
		System.out.println("Acesso bloqueado");

	}

}
