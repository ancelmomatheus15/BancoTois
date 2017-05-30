package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import tois.model.Correntista;

public class CtrlCliente {
	
	public static void addCorrentista(Correntista novoCorrentista){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("BANCO");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(novoCorrentista);
		em.getTransaction().commit();
		em.clear();
		factory.close();
	}
//	
//	private boolean readCliente(){
//		return false;
//	}
//	
//	private boolean attCliente(){
//		return false;
//	}
//	
//	private boolean delCliente(){
//		return false;
//	}

}
