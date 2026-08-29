package dia3;

public class Filiais {

	private String nome;
	private String senha;
	private int estoqueCaixas;
	private int capacidadeGalpao;
	private double orcamento;

	public Filiais(String nome, String senha, int estoqueCaixas, int capacidadeGalpao, double orcamento) {
		this.nome = nome;
		this.senha = senha;
		this.estoqueCaixas = estoqueCaixas;
		this.capacidadeGalpao = capacidadeGalpao;
		this.orcamento = orcamento;
	}

	public boolean autenticar(String senhaDigitada) {
		return this.senha.equals(senhaDigitada);
	}

	public int espacoLivre() {
		return capacidadeGalpao - estoqueCaixas;
	}

	public void enviar(int caixas) {
		estoqueCaixas -= caixas;
	}

	public void receber(int caixas) {
		estoqueCaixas += caixas;
	}

	public void pagarFrete(double valor) {
		orcamento -= valor;
	}

	public String getNome() { return nome; }
	public int getEstoqueCaixas() { return estoqueCaixas; }
	public int getCapacidadeGalpao() { return capacidadeGalpao; }
	public double getOrcamento() { return orcamento; }
	public void setNome(String nome) { this.nome = nome; }
}