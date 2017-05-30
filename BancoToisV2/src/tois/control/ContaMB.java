package tois.control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import DAO.CtrlConta;
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
		String confirm;
		CtrlConta.addConta(contaAtual);
		confirm = "Conta?faces-redirect=true";
		
		return confirm;
	}
	
	public String sair(){
		contaAtual = null;
		return "login";
	}
	
	public String Login(){
		String confirm = "";
		
		contaAtual = CtrlConta.login(contaAtual.getNumConta(), contaAtual.getSenha());
		if(contaAtual != null){
			confirm = "Conta?faces-redirect=true";
		}else{
			confirm = "Home";
		}
		return confirm;
	}
}
