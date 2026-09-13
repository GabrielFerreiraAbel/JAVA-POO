package ac9;

public class Comprador {
	
	private String nome;
	private String cpf;
	private Bilhete bilhete;
	
	public Comprador(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
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

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void exibirDados() {
		System.out.println("COMPRADOR: " + nome + " | CPF: " + cpf);
	}

	public Bilhete getBilhete() {
		return bilhete;
	}

	public void setBilhete(Bilhete bilhete) {
		this.bilhete = bilhete;
	}
	
	
	
	
}
