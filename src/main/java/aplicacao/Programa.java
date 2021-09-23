package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		//Pessoa p1 = new Pessoa(null, "Edson Rego", "edsonxrego@gmail.com");
		//Pessoa p2 = new Pessoa(null, "Eva Alves", "evanusiaalves@gmail.com");
		//Pessoa p3 = new Pessoa(null, "Camilly Alves", "camillyalvesrego@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//cria os dados no banco de dados
		//em.getTransaction().begin();
		//em.persist(p1);
		//em.persist(p2);
		//em.persist(p3);
		//em.getTransaction().commit();

		System.out.println("Pronto!");
		em.close();
		emf.close();
	}

}
