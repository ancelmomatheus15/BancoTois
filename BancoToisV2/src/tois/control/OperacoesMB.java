package tois.control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import DAO.CtrlOperacoes;
import tois.model.Conta;

@ManagedBean
@SessionScoped
public class OperacoesMB {
	
	private String senha = "";
	private double valor = 0;
	private int contaFrom = 0;
	private int contaTo = 0;
	
	public Conta transferir(int numContaFrom, int numContaTo, double valor, String senha){
		CtrlOperacoes.transferencia(numContaFrom, numContaTo, valor, senha);
		return null;
	}
	
	public Conta depositar(int numContaFrom, int numContaTo, double valor, String senha){
		CtrlOperacoes.deposito(numContaFrom, numContaTo, valor, senha);
		return null;
	}
	
	public void cancelar(){
		
	}

}
