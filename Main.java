public class Main {
    public static void main(String args[]) {

        Aluno aluno1 = new Aluno("Aluno1", 18, 99999999l, "SI2024");
        System.out.println(aluno1.toString());

        Aluno aluno2 = new Aluno("Aluno2", 18, 99999999l, "SI2024");
        System.out.println(aluno2.toString());

        Professor professor1 = new Professor("Professor", 38, 99999999l, "2024SI");
        System.out.println(professor1.toString());

        Professor professor2 = new Professor("Professor2", 38, 99999999l, "2024SI");
        System.out.println(professor2.toString());

        Disciplina disciplina = new Disciplina("Web II");
        System.out.println(disciplina.toString());

        disciplina.addAluno(aluno1);
        disciplina.addAluno(aluno2);

        disciplina.addProfessor(professor1);
        disciplina.addProfessor(professor2);

        System.out.println("\n\n\n" + disciplina.toString());
    }
}