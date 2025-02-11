public class Aluno extends Pessoa{

    private String matricula;

    public Aluno(){
        this("", 0, 0, "");
    }

    public Aluno(String name, int age){
        this("", 0, 0, "");
    }

    public Aluno(String name, int age, long cpf, String matricula){
        super(name, age, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString(){
        return "Aluno: {" + super.toString() + ", Matricula=" + getMatricula() + "}";
    }
}
