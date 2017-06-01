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
	private int numConta = 0;
	
	public Conta transferir(int numConta, double valor, String senha){
		CtrlOperacoes.transferencia(numConta, valor, senha);
		return null;
	}
	
	public Conta depositar(int numConta, double valor, String senha){
		CtrlOperacoes.deposito(numConta, valor, senha);
		return null;
	}
	
	public void cancelar(){
		
	}

}
