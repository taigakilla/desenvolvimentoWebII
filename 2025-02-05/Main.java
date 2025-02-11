public class Main {
    public static void main(String args[]) {

        Pessoa pessoa = new Pessoa();
        System.out.println("Pessoa 1" + pessoa.toString());

        Pessoa pessoa1 = new Pessoa("Joquinha", 19, 99999999L);
        System.out.println("Pessoa 2" + pessoa1.toString());

        Pessoa pessoa2 = new Pessoa("Puff Daddy", 69);
        System.out.println("Pessoa 3" + pessoa2.toString());
    }
}