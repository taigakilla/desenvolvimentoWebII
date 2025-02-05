public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(){
        this("", 0, 0, "");
    }

    public Aluno(String nome, int age){
        this.matricula = "";
    }

    public Aluno(String nome, int age, long cpf, String matricula){
        super(matricula, age, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }    
}
