package aplicativo;

import dominio.Pessoa;
import dominio.Cliente;
import dominio.Vendedor;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Principal {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula-jpa"); //Instancia o EntityManagerFactory com as configurações de persistencia
		EntityManager em = emf.createEntityManager(); //Intancia o EntityManager
		
		Vendedor vendedor = new Vendedor("Mauricio", 33, 1);
		Cliente cliente = new Cliente("Rafael", 34, 1);
		
		em.getTransaction().begin();// iniciar transação com banco de dados
		
		em.persist(vendedor);
		em.persist(cliente);
		
		em.getTransaction().commit();//confirmar as alterações realizadas
		
		emf.close();
		em.close();
	}			
}