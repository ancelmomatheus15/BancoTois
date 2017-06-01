package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import tois.model.Conta;

public class CtrlOperacoes{
	
	public static boolean transferencia(int numConta, double valor, String senha){
		boolean confirm = false;
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("BANCOTOIS");
		EntityManager em = factory.createEntityManager();
		
		return confirm;
	}
	
	public static boolean deposito(int numConta, double valor, String senha){
		
		return false;
	}
}

/*
 * calcular imposto com a taxa e as confirmações pro usuario
 * fazer as validações
 */



































//package DAO;
//
//import javax.persistence.EntityManagerFactory;
//import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
//
//import tois.model.Conta;
//import tois.model.Correntista;
//
//
//@WebServlet("/CtrlOperacoes")
//public class CtrlOperacoes {
//	
//	private static final long serialVersionUID = 1L;
//	private EntityManagerFactory emf;	
//	
//	public boolean deposito(Conta conta, double valDeposito){
//		boolean confirm = false;
//		double saldo = conta.getSaldo();
//		saldo += valDeposito;
//		
//		/*if atualiza no banco
//		 * confirm = true;
//		 * return confirm;
//		 * else
//		 * confirm = false;
//		 * return confirm;
//		 */
//
//		return confirm;
//	}
//	
//	public boolean transferencia(Conta contaFrom, Conta contaTo, double transferencia){
//		boolean confirm = false;
//		double saldoTo = contaTo.getSaldo();
//		double saldoFrom = contaFrom.getSaldo();
//		
//		/*
//		 * get contaTo do banco de dados
//		 * instanciar um objeto em contaTo
//		 */		
//		
//		saldoFrom -= transferencia;
//		saldoTo += transferencia;
//		
//		contaTo.setSaldo(saldoTo);
//		contaFrom.setSaldo(saldoFrom);
//		
//		/*
//		 * atualiza ambas as contas no banco
//		 * if ok
//		 * confirm = true;
//		 * return confirm;
//		 * else
//		 * return confirm;
//		 */		
//		
//		return confirm;
//	}
//	
//	public String gerarExtrato(Conta conta){
//		String extrato = "Conta numero: "+conta.getNumConta()+"\n"+
//						 "Agencia: "+conta.getNumAgencia()+"\n"+
//						 "Titular: "+conta.getTitular()+"\n"+
//						 "Tipo: "+conta.getTipo()+"\n"+
//						 "------------------------------------\n"+
//						 "Saldo: "+conta.getSaldo()+"\n"+
//						 "------------------------------------\n";
//		return extrato;
//		
//	}
//
//}
