package ac15;

public class Main {

	public static void main(String[] args) {
		
		Sistema sistema = new Sistema();

		Aluno aluno1 = new Aluno(1, "Matheus", "01");
		Aluno aluno2 = new Aluno(2, "Marcos", "02");
		Aluno aluno3 = new Aluno(1, "Lucas", "03");       
		sistema.adicionarAluno(aluno1);
		sistema.adicionarAluno(aluno2);
		sistema.adicionarAluno(aluno3);
		System.out.println("Alunos cadastrados: " + sistema.getAlunos().size());   

		Curso curso1 = new Curso(1, "CDIA", "TECH", 200);
		Curso curso2 = new Curso(2, "ADM", "ADM", 300);
		Curso curso3 = new Curso(1, "ARQ", "URB", 250);     
		sistema.adicionarCurso(curso1);
		sistema.adicionarCurso(curso2);
		sistema.adicionarCurso(curso3);
		System.out.println("Cursos cadastrados: " + sistema.getCursos().size());  

		sistema.matricular(1, "10/10/2010", 500, aluno1, curso1);
		sistema.matricular(2, "11/10/2010", 700, aluno1, curso2);
		sistema.matricular(3, "12/10/2010", 500, aluno2, curso1);

		sistema.matricular(4, "13/10/2010", 500, aluno1, curso1);   

		sistema.listarAlunosDoCurso(curso1);
		sistema.listarAlunosDoCurso(curso2);

	}

}
