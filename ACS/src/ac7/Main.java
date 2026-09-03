package ac7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite quantos funcionários tem na empresa: ");
		int numeroFuncionarios = teclado.nextInt();
		
		double salarioTotal = 0;
		String relatorio = "";
		
		for(int i = 0; i < numeroFuncionarios; i++) {
			teclado.nextLine();
			System.out.println("Funcionário "+ (i+1));
			
			System.out.println("Digite o nome do funcionário: ");
			String nomeFuncionario = teclado.nextLine();
			
			System.out.println("Quantidade de horas trabalhadas no mês: ");
			double horasFuncionario = teclado.nextDouble();
			
			System.out.println("Quantidade de dias trabalhados: ");
			int diasFuncionario = teclado.nextInt();
			
			System.out.println("Valor da hora trabalhada: ");
			double valorHoraFuncionario = teclado.nextDouble();
			
			Funcionario funcionario = new Funcionario(nomeFuncionario, diasFuncionario, horasFuncionario, valorHoraFuncionario);
			funcionario.salario();
			
			System.out.println("Salario: " + funcionario.getSalario());
			
			salarioTotal += funcionario.getSalario();
			
			System.out.print("Nome: "+ nomeFuncionario + "| ");
			System.out.print(+ diasFuncionario + " dias de trabalho | ");
			System.out.print(+ horasFuncionario + " de trabalho por dia | ");
			System.out.println("");
			
			relatorio = relatorio + String.format("Nome: %s | %d dias | %.1f horas/dia | R$ %.2f por hora | Salario: R$ %.2f%n",
			        nomeFuncionario, diasFuncionario, horasFuncionario, valorHoraFuncionario, funcionario.getSalario());
		}
		
		double mediaSalarial = salarioTotal/numeroFuncionarios;
		
		System.out.println(relatorio);
		System.out.printf("Média Salarial: R$ %.2f", mediaSalarial);
		

	}

}
