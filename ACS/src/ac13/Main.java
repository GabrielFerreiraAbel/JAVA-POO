package ac13;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Empresa> empresas = new ArrayList<Empresa>();

		int opcao;
		String continuar = "n";                 

		String nomeEmpresa;
		String endereco;

		int quantidadeFuncionarios;
		String desenvolvedor;

		String nomeFuncionario;
		int numeroIdentificacao;
		double salarioMensal;

		do {

			System.out.println();
			System.out.println("1 - CADASTRAR EMPRESA.");
			System.out.println("2 - CADASTRAR FUNCIONARIO DA EMPRESA.");
			System.out.println("3 - EXIBIR RELATORIO.");
			System.out.println("0 - SAIR.");

			opcao = sc.nextInt();
			sc.nextLine();

			switch(opcao) {

			case 1:

				do {

					System.out.println("Digite o nome da empresa: ");
					nomeEmpresa = sc.nextLine();

					System.out.println("Digite o endereco da empresa: ");
					endereco = sc.nextLine();

					Empresa empresa = new Empresa(nomeEmpresa, endereco);
					empresas.add(empresa);

					System.out.println("Deseja cadastrar mais alguma empresa? (s/n)");
					continuar = sc.nextLine();

				}while(continuar.equals("s") || continuar.equals("S"));

				break;                         

			case 2:

				if(empresas.size() == 0) {

					System.out.println("Nenhuma empresa cadastrada!");

				} else {

					for(int i = 0; i < empresas.size(); i++) {                    
						System.out.println((i + 1) + " - " + empresas.get(i).getNome());
					}

					System.out.println("Escolha a empresa: ");
					int indice = sc.nextInt();
					sc.nextLine();

					Empresa empresaEscolhida = empresas.get(indice - 1);

					System.out.println("Digite o numero de funcionarios que serao cadastrados");
					quantidadeFuncionarios = sc.nextInt();
					sc.nextLine();                                               
					
					for(int i = 0; i < quantidadeFuncionarios; i++) {

						System.out.println("Nome: ");
						nomeFuncionario = sc.nextLine();

						System.out.println("Numero de identificacao: ");
						numeroIdentificacao = sc.nextInt();
						sc.nextLine();

						System.out.println("Salario mensal: ");
						salarioMensal = sc.nextDouble();
						sc.nextLine();

						System.out.println("O funcionario e desenvolvedor? (s/n)");
						desenvolvedor = sc.nextLine();

						if(desenvolvedor.equals("s") || desenvolvedor.equals("S")) {

							Desenvolvedor dev = new Desenvolvedor(nomeFuncionario, numeroIdentificacao, salarioMensal);
							empresaEscolhida.adicionarFuncionario(dev);
							System.out.println("Desenvolvedor cadastrado!");

						} else {                                                   

							Funcionario funcionario = new Funcionario(nomeFuncionario, numeroIdentificacao, salarioMensal);
							empresaEscolhida.adicionarFuncionario(funcionario);
							System.out.println("Funcionario cadastrado!");

						}

					}

				}

				break;

			case 3:

				if(empresas.size() == 0) {
					System.out.println("Nenhuma empresa cadastrada!");
				} else {
					for(Empresa e : empresas) {
						e.exibirRelatorio();
					}
				}

				break;

			case 0:

				System.out.println("Encerrando...");
				break;

			default:

				System.out.println("Opcao invalida!");
			}

		}while(opcao != 0);

		sc.close();
	}
}