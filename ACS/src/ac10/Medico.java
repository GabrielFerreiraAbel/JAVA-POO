package ac10;

import java.util.ArrayList;

public class Medico {
	
	private String registro;
	private String nome;
	private String especialidade;
	private ArrayList<Paciente> pacientes;
	
	public Medico(String registro, String nome, String especialidade) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.especialidade = especialidade;
		this.pacientes = new ArrayList<Paciente>();
	}
	
	public void adiconarPaciente(Paciente paciente) {
		this.pacientes.add(paciente);
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	
	public void exibirDados() {
		System.out.println("REGISTRO: " + registro + " | NOME: " + nome + " | ESPECIALIDADE: " + especialidade);
	}
	
}
