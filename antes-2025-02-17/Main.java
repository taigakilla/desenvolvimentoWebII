public class Main {
    public static void main(String args[]) {

        Aluno aluno1 = new Aluno("Aluno1", 18, 99999999l, "SI2024");
        Aluno aluno2 = new Aluno("Aluno2", 18, 99999999l, "SI2024");

        Professor professor1 = new Professor("Professor", 38, 99999999l, "2024SI");
        Professor professor2 = new Professor("Professor2", 38, 99999999l, "2024SI");

        Disciplina disciplina = new Disciplina("Web II", 100);
        Disciplina disciplina2 = new Disciplina("Web I", 50);

        disciplina.addAluno(aluno1);
        disciplina.addAluno(aluno2);
        disciplina.addProfessor(professor1);
        disciplina.addProfessor(professor2);

        System.out.println("\n\n\n" + disciplina.toString());

        Curso curso = new Curso("Sistemas");

        curso.AddDisciplina(disciplina);
        curso.AddDisciplina(disciplina2);

        System.out.println("\n\n\n\n" + curso.toString());
    }
}