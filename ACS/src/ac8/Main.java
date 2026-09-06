package ac8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

		System.out.print("Digite quantos funcionários tem na empresa: ");
		int numeroFuncionarios = teclado.nextInt();

		for (int i = 0; i < numeroFuncionarios; i++) {
			teclado.nextLine();                   
			System.out.println();
			System.out.println("--- Funcionário " + (i + 1) + " ---");

			System.out.print("Nome do funcionário: ");
			String nomeFuncionario = teclado.nextLine();

			System.out.print("Dias trabalhados no mês: ");
			int diasFuncionario = teclado.nextInt();

			System.out.print("Horas trabalhadas por dia: ");
			double horasFuncionario = teclado.nextDouble();

			System.out.print("Valor da hora trabalhada: ");
			double valorHoraFuncionario = teclado.nextDouble();

			Funcionario funcionario = new Funcionario(nomeFuncionario, diasFuncionario,
					horasFuncionario, valorHoraFuncionario);

			funcionarios.add(funcionario);          
		}

		double salarioTotal = 0;

		System.out.println();
		System.out.println("===== PAGAMENTOS ===== ");
		for (Funcionario f : funcionarios) {
			System.out.println(f.linhaRelatorio());
			salarioTotal += f.calcularSalario();
		}

		double mediaSalarial = salarioTotal / funcionarios.size();
		System.out.printf("Média salarial: R$ %,.2f%n", mediaSalarial);

		teclado.close();
	}
}