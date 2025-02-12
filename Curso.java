import java.util.List;
import java.util.ArrayList;

public class Curso {
    private String name;
    private List<Disciplina> disciplinas;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Curso(){
        this("", new ArrayList<Disciplina>());
    }
    
    public Curso(String name){
        this(name, new ArrayList<Disciplina>());
    }

    public Curso(String name, List<Disciplina> disciplinas){
        this.name = name;
        this.disciplinas = disciplinas;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }


    public void AddDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    int cargaHorariaTotal = 0;

    public int cargaHoraria(){
        disciplinas.forEach(x -> {
            cargaHorariaTotal += x.getCargaHoraria();
        });
        return cargaHorariaTotal;
    }
 
    List<String> nomeDisciplinas = new ArrayList<String>();

    public List<String> nomeDisciplinas(){
        disciplinas.forEach(x -> {
            nomeDisciplinas.add(x.getName());
        });
        return nomeDisciplinas;
    }
    public int retornaCarga1(){
        int ecargaHorariaTotal = 0;
        for (Disciplina disciplina : disciplinas) {
            ecargaHorariaTotal += disciplina.getCargaHoraria();
        }
        return ecargaHorariaTotal;
        
    }
    
    @Override
    public String toString() {
        return "Curso: {" + getName() +", Disciplinas: {" + nomeDisciplinas() + "}" + ",Carga Horaria: {" + cargaHoraria() + "}}";
    }
}
