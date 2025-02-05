public class Pessoa{

    private String name;
    private int age;
    private long cpf;

    public Pessoa(String name, int age, long cpf){
        this.name = name;
        this.age = age;
        this.cpf = cpf;
    }

    public Pessoa() {
        this("", 0, 0);
    }

    public Pessoa(String name, int age) {
        this(name, age, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getCpf() {
        return cpf;
    }

    @Override
    public String toString(){
        return "Pessoa{Nome=" + getName() + ", Idade=" + getAge() + ", CPF=" + getCpf() + "}";
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}