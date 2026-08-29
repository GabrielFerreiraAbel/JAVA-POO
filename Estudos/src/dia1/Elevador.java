package dia1;

public class Elevador {
	
	private int andarAtual;      
	private int andarMaisAlto;
	private int pessoasDentro;
	private int capacidade;
	
	
	public Elevador(int capacidade, int andarMaisAlto) {
		this.andarAtual = 0;
		this.andarMaisAlto = andarMaisAlto;
		this.pessoasDentro = 0;
		this.capacidade = capacidade;
	}
	
	public boolean subir(){
		if(andarAtual < andarMaisAlto){
			
			andarAtual++;
			return true;
		}
		
		return false;
	}
	
	public boolean descer(){
		if(andarAtual <= 0){
			return false;
		}
		andarAtual--;
		return true;
	}
	
	public boolean entrar(){
		if(pessoasDentro >= capacidade){
			return false;
		}
		
		pessoasDentro++;
		return true;
	}
	
	public boolean sair(){
		if(pessoasDentro == 0){
			return false;
		}
		pessoasDentro--;
		return true;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getPessoasDentro() {
		return pessoasDentro;
	}
	
	
	
	
}
