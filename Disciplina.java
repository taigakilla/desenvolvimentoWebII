import java.util.ArrayList;
import java.util.List;

public class Disciplina{

    private String name;
    private List<Aluno> alunos;
    private List<Professor> professores;

    public Disciplina(){
        this("", new ArrayList<Aluno>(), new ArrayList<Professor>());
    }

    public Disciplina(String name){
        this(name, new ArrayList<Aluno>(), new ArrayList<Professor>());
    }

    public Disciplina(String name, List<Aluno> alunos, List<Professor> professores){
        this.name = name;
        this.alunos = alunos;
        this.professores = professores;
    }

    public String getName() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void addAluno(Aluno aluno) {
       this.alunos.add(aluno);
    }

    public List<Professor> getProfessores() {
        return professores;
    }
    
    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public void addProfessor(Professor professor) {
       this.professores.add(professor);
     }

     @Override
     public String toString(){
        return "Disciplina: {" + getName() +
         ", Alunos: {" + getAlunos() + "}" +
         ",Professores: {" + getProfessores() + "}}";
     }
}