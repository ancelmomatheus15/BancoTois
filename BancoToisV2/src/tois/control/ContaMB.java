package tois.control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tois.model.Conta;

@ManagedBean
@SessionScoped
public class ContaMB {
	
	private Conta contaAtual = new Conta();
	
	public Conta getContaAtual() {
		return contaAtual;
	}

	public void setContaAtual(Conta contaAtual) {
		this.contaAtual = contaAtual;
	}

	public String salvar() {
		System.out.println("conta gerada : " + contaAtual.getNumConta());
		return "conta";
	}
	
	public String sair(){
		contaAtual = null;
		return "login";
	}
}
