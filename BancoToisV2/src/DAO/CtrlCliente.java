package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import tois.model.Correntista;

public class CtrlCliente {
	
	public static void addCorrentista(Correntista novoCorrentista){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("BANCOT");
		EntityManager em = factory.createEntityManager();
		em.persist(novoCorrentista);
		em.getTransaction().commit();
		em.clear();
		factory.close();
	}
	
//	private boolean addCliente(){
//		return false;
//	}
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
