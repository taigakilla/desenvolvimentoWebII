import java.util.ArrayList;
import java.util.List;

public class Disciplina{

    private String name;
    private List<Aluno> alunos;
    private List<Professor> professores;
    private int cargaHoraria;

    public Disciplina(){
        this("", new ArrayList<Aluno>(), new ArrayList<Professor>(), 0);
    }

    public Disciplina(String name){
        this(name, new ArrayList<Aluno>(), new ArrayList<Professor>(), 0);
    }

    public Disciplina(String name, int cargaHoraria){
        this(name, new ArrayList<Aluno>(), new ArrayList<Professor>(), cargaHoraria);
    }

    public Disciplina(String name, List<Aluno> alunos, List<Professor> professores, int cargaHoraria){
        this.name = name;
        this.alunos = alunos;
        this.professores = professores;
        this.cargaHoraria = cargaHoraria;
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
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