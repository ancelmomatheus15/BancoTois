package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import tois.model.Conta;
import tois.model.Correntista;

public class CtrlCliente {
	
	public static String addCorrentista(Correntista novoCorrentista){
		String aux = "";
		
		try{
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("BANCOTOIS");
			EntityManager em = factory.createEntityManager();
			em.getTransaction().begin();
			em.persist(novoCorrentista);
			em.getTransaction().commit();
			em.clear();
			factory.close();
			
			aux = "Conta";
			return aux;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return aux;	
		
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
	
	private static Correntista readCliente(String CPF){
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("BANCO");
		EntityManager em = factory.createEntityManager();
		
		try{
			Query query = em.createQuery
					("SELECT correntista FROM Correntistas where"
							+ "CPF =: cpf");
			query.setParameter("cpf", CPF);
			
			List<Correntista> lista = query.getResultList();
			
			if(lista != null && lista.size()>0){
				return lista.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
