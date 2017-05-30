package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import tois.model.Conta;
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
	
	public static void delCliente(Conta conta, Correntista correntista, String senha, String cpf){
		String log;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("BANCO");
		EntityManager em = factory.createEntityManager();
		
		if(cpf.equals(correntista.getCPF())&& senha.equals(conta.getSenha())){
				try{
					Query query = em.createQuery
							("DELETE FROM Conta WHERE"
									+ "numConta =: num");
					
					Query query2 = em.createQuery
							("DELETE FROM Usuarios WHERE"
									+ "CPF =: cpf");
					
					query.setParameter("numConta", conta.getNumConta());
					query2.setParameter("cpf", correntista.getCPF());
				}catch (Exception e) {
					e.printStackTrace();
				}
		}else{
			log = "Valores inválidos";
		}
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
