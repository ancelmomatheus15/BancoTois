package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import tois.model.Conta;

public class CtrlConta{
	
	public static void addConta(Conta novaConta){
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("BANCOT");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(novaConta);
		em.getTransaction().commit();
		em.clear();
		factory.close();
	}

	public static Conta login(int numConta, String senha) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("BANCO");
		EntityManager em = factory.createEntityManager();
		
		try{
			Query query = em.createQuery
					("SELECT conta FROM Conta conta where"
							+ "conta =: acc and senha =: pass");
			query.setParameter("acc", numConta);
			query.setParameter("pass", senha);
			
			List<Conta> contas = query.getResultList();
			
			if(contas != null && contas.size()>0){
				return contas.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}

