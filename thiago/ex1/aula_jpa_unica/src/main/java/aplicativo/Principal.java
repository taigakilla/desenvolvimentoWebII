package aplicativo;

import dominio.*;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Principal {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula-jpa"); //Instancia o EntityManagerFactory com as configurações de persistencia
		EntityManager em = emf.createEntityManager(); //Intancia o EntityManager
		
		Pessoa pessoa = new Pessoa("José", 35);
		Cliente cliente = new Cliente("Rafael", 29, 1234);
		Vendedor vendedor = new Vendedor("Thiago", 23, 12);

		
		em.getTransaction().begin();// iniciar transação com banco de dados
		
		em.persist(pessoa);
		em.persist(cliente);
		em.persist(vendedor);
		em.getTransaction().commit();//confirmar as alterações realizadas
		
		emf.close();
		em.close();
	}			
}