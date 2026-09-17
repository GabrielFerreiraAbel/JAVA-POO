package ac10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Medico> medicos = new ArrayList<Medico>();
		 
		String continuar;
		int opcao;
		 
		String registroMedico;
		String nomeMedico;
		String especialidadeMedico;
		
		int idPaciente;
		String nomePaciente;
		String cpfPaciente;
		int posicaoMedicoEscolhido;
		 
		 do {
			 
			 System.out.println("1 - Cadastrar médicos da clínica.");
			 System.out.println("2 - Cadastrar pacientes da clínica.");
			 System.out.println("3 - Listar todos os médicos da clínica com seus respectivos pacientes da clínica.");
			 System.out.println("0 - SAIR");
			 opcao = sc.nextInt();
			 sc.nextLine();
			 
			 switch(opcao) {
			 case 1:
				 
				 do {
					 
					System.out.println("Registro do médico: ");
					registroMedico = sc.nextLine();
					
					System.out.println("Nome do médico: ");
					nomeMedico = sc.nextLine();
					
					System.out.println("Especialidade: ");
					especialidadeMedico = sc.nextLine();
					
					Medico medico = new Medico(registroMedico, nomeMedico, especialidadeMedico);
					
					medicos.add(medico);
					
					System.out.println("Quer cadastrar mais algum médico? ");
					continuar = sc.nextLine();
					
					 
				 }while(continuar.equals("s") || continuar.equals("S"));
				 
				 break;
			 
			 case 2:
				 
				 do {
					 
					    if(medicos.size() == 0) {
					    	System.out.println("O médicos cadastrados, cadastre um médico primeiro");
					    } 
					    else {
					    	System.out.println("ID do paciente: ");
							idPaciente = sc.nextInt();
							sc.nextLine();
							
							System.out.println("Nome do paciente: ");
							nomePaciente = sc.nextLine();
							
							System.out.println("Cpf: ");
							cpfPaciente = sc.nextLine();
							
							System.out.println("==== MÉDICOS ====");
							
							for(int i = 0; i < medicos.size(); i++) {
								System.out.println((i + 1) + "");
								medicos.get(i).exibirDados();
							}
							System.out.println("Digite a posição do médico que deseja escolher.");
							posicaoMedicoEscolhido = sc.nextInt();
							sc.nextLine();
							
							boolean posicaoValida = true;
							
							if(posicaoMedicoEscolhido < 1 || posicaoMedicoEscolhido > medicos.size()) {
								posicaoValida = false;
								System.out.println("Posição inválida.");
							}
							
							if(posicaoValida) {
								
								Medico medico = medicos.get(posicaoMedicoEscolhido - 1);
								
								Paciente paciente = new Paciente(idPaciente, nomePaciente, cpfPaciente, medico);
								medico.adiconarPaciente(paciente);
								
								System.out.println("Paciente cadastrado ao médico ");
								medico.exibirDados();
							}
					    }
					    
						
						
						System.out.println("Quer cadastrar mais algum paciente? ");
						continuar = sc.nextLine();
						
						 
					 }while(continuar.equals("s") || continuar.equals("S"));
				 
				 break;
				 
			 case 3:
				 
				 if(medicos.size() == 0) {
					 System.out.println("Nenhum médico cadastrado.");
				 }else {
					 for(int i = 0; i < medicos.size(); i++) {
						 
						 Medico medicoDaVez = medicos.get(i);
						 System.out.println("");
						 medicoDaVez.exibirDados();
						 
						 if(medicoDaVez.getPacientes().size() == 0) {
							 System.out.println("Esse médico não tem pacientes.");
						 }else {
							 System.out.println("PACIENTES");
							 
							 for(Paciente p: medicoDaVez.getPacientes()) {
								 p.exibirDados();
							 }
						 }
						 
					 }
				 }
				 
				 break;
				 
			 case 0:
				 System.out.println("Saindo.");
				 break;
				 
			default:
				System.out.println("Opção inválida");
				break;
			 } 
			 
		 }while(opcao != 0);
	}

}
