package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import tois.model.Conta;

public class CtrlConta{
	
	public static void addConta(Conta novaConta){
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("BANCOT");
		EntityManager em = factory.createEntityManager();
		em.persist(novaConta);
		em.getTransaction().commit();
		em.clear();
		factory.close();
	}
	
	
}

