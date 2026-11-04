package ac15;

import java.util.HashSet;
import java.util.Iterator;

public class Sistema {
	
	private HashSet<Aluno> alunos;
	private HashSet<Curso> cursos;
	
	public Sistema() {
		super();
		this.alunos = new HashSet<Aluno>();
		this.cursos = new HashSet<Curso>();
	}
	
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void adicionarCurso(Curso curso) {
		cursos.add(curso);
	}
	
	public void matricular(int id, String data, double valor, Aluno aluno, Curso curso) {
		boolean jaExiste = false;

		for (Matricula m : aluno.getMatriculas()) {
			if (m.getCurso().getId() == curso.getId()) {
				jaExiste = true;
			}
		}

		if (jaExiste) {
			System.out.println("Recusada: " + aluno.getNome() + " ja esta matriculado em " + curso.getNome() + ".");
		} else {
			Matricula matricula = new Matricula(id, data, valor, aluno, curso);
			aluno.adicionarMatricula(matricula);
			curso.adicionarMatricula(matricula);
			System.out.println("Matricula " + id + ": " + aluno.getNome() + " em " + curso.getNome() + ".");
		}
	}
	
	public boolean desmatricular(Aluno aluno, Curso curso) {
		
		boolean achou = false;
		Iterator<Matricula> it = aluno.getMatriculas().iterator();
		while(it.hasNext()) {
			Matricula m = it.next();
			if(m.getCurso().getId() == curso.getId()) {
				curso.getMatriculas().remove(m);
				it.remove();
				achou  = true;
			}
		}
		
		if(achou == false) {
			System.out.println("Não encontrado!");
		}
		
		return achou;
	}
	

	public HashSet<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(HashSet<Aluno> alunos) {
		this.alunos = alunos;
	}

	public HashSet<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(HashSet<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public void buscarAlunoEmCurso(Curso curso, int idAluno) {

		Aluno encontrado = null;

		for (Matricula m : curso.getMatriculas()) {
			if (m.getAluno().getId() == idAluno) {
				encontrado = m.getAluno();
			}
		}

		if (encontrado != null) {
			System.out.println("Aluno encontrado: " + encontrado);
		} else {
			System.out.println("Aluno nao matriculado nesse curso.");
		}
	}
	
	public void listarAlunosDoCurso(Curso curso) {

		System.out.println("CURSO: " + curso.getNome());

		if (curso.getMatriculas().size() == 0) {
			System.out.println("  O curso nao tem matriculas.");
		} else {
			for (Matricula m : curso.getMatriculas()) {
				m.exibirDados();
			}
		}
	}
	
}
