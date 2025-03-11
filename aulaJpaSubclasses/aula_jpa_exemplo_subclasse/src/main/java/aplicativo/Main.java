package aplicativo;

import javax.persistence.Query;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.*;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula-jpa");
        EntityManagerFactory em = emf.createEntityManagerFactory();

        Pessoa pessoa1 = new Pessoa("João", "123456789");
        Pessoa pessoa2 = new Pessoa("Maria", "987654321");

        Professor professor1 = new Professor("José", "123456789", "1234");
        Professor professor2 = new Professor("Ana", "987654321", "5678");

        Aluno aluno1 = new Aluno("Pedro", "111222333", "4321");
        Aluno aluno2 = new Aluno("Carla", "333222111", "8765");

        em.getTransaction().begin();
        em.persist(pessoa1);
        em.persist(pessoa2);
        em.persist(professor1);
        em.persist(professor2);
        em.persist(aluno1);
        em.persist(aluno2);
       
        Query consulta = em.createQuery("Select pessoa from Pessoa pessoa");

        ArrayList<Pessoa> listaPessoas = (ArrayList<Pessoa>) consulta.getResultList();
    }
    
}