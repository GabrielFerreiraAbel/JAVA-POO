package ac10;

public class Paciente {
	
	private int id;
	private String nome;
	private String cpf;
	private Medico medico;
	
	public Paciente(int id, String nome, String cpf, Medico medico) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.medico = medico;
	}
	
	public Medico getMedico() {
		return medico;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpg(String cpf) {
		this.cpf = cpf;
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id + " | NOME: " + nome + " | CPF: " + cpf);
	}
	
}
