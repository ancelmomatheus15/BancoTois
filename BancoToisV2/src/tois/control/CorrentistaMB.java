package tois.control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tois.model.Correntista;

@ManagedBean
@SessionScoped
public class CorrentistaMB {
	
	private Correntista correntistaAtual = new Correntista();

	public Correntista getCorrentistaAtual() {
		return correntistaAtual;
	}

	public void setCorrentistaAtual(Correntista correntistaAtual) {
		this.correntistaAtual = correntistaAtual;
	}

	public String salvar() {
		System.out.println("Correntista salvo, numero : " + correntistaAtual.getCPF());
		return "correntista";
	}
	
	

}
