package ac13;

import java.util.ArrayList;

public class Empresa {

	private String nome;
	private String endereco;
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();

	public Empresa(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void adicionarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}

	public void exibirRelatorio() {
		System.out.println();
		System.out.println("Empresa: " + nome);
		System.out.println("Endereco: " + endereco);

		int contador = 1;
		for (Funcionario f : funcionarios) {
			System.out.println("--- Funcionario " + contador + " ---");
			f.exibirDados();
			contador = contador + 1;
		}
	}
}
