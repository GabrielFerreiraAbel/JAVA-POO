package ac6;

public class ContaCorrente {
	
	private int numero;
	private String nomeCliente;
	private String senha;
	private double saldo;
	
	public ContaCorrente(int numero, String nomeCliente, String senha, double saldo) {
		this.numero = numero;
		this.nomeCliente = nomeCliente;
		this.senha = senha;
		this.saldo = saldo;
	}
	public boolean autenticar(String senhaDigitada) {
		return this.senha.equals(senhaDigitada);
	}
 
	
	public boolean transferirPara(ContaCorrente destino, double valor, double taxa) {
		double total = valor + taxa;   
 
		if (total > this.saldo) {
			return false;             
		}
 
		this.saldo = this.saldo - total;   
		destino.creditar(valor);          
		return true;
	}
 
	public void creditar(double valor) {
		this.saldo = this.saldo + valor;
	}
 
	
	public double getSaldo() {
		return saldo;
	}
 
	public int getNumero() {
		return numero;
	}
 
	public String getNomeCliente() {
		return nomeCliente;
	}
 
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	
}