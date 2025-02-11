public class Professor extends Pessoa{

    private String codProf;

    public Professor(){
        this("", 0, 0l, "");
    }

    public Professor(String name, int age){
        this("", 0, 0l, "");
    }

    public Professor(String name, int age, long cpf, String codProf){
        super(name, age, cpf);
        this.codProf = codProf;
    }

    public String getCodProf() {
        return this.codProf;
    }

    public void setCodProf(String codProf) {
        this.codProf = codProf;
    }

    @Override
    public String toString(){
        return "Professor: {" + super.toString() + ", Cód. Professor=" + getCodProf() + "}";
    }
}
