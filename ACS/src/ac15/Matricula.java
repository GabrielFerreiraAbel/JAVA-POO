package ac15;

public class Matricula {
	
	private int id;
	private String dataMatricula;
	private double valorPago;
	private Aluno aluno;
	private Curso curso;
	
	public Matricula(int id, String dataMatricula, double valorPago, Aluno aluno, Curso curso) {
		super();
		this.id = id;
		this.dataMatricula = dataMatricula;
		this.valorPago = valorPago;
		this.aluno = aluno;
		this.curso = curso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public void exibirDados() {
		System.out.println("ID: " + id + " | NOME: " + aluno.getNome() + " | CURSO: " + curso.getNome() + " | DATA: " + dataMatricula + " | VALOR: " + valorPago);
	}
	
}
