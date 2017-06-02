package tois.control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tois.model.Correntista;

@ManagedBean
@SessionScoped
public class LoginMB {
	
	private String txtUsuario;
	private String txtSenha;
	private Correntista corLogado;
	
	public String logar(){
		String pagina = "Home";
		
		if("admin".equals(txtUsuario) && "111".equals(txtSenha)){
			pagina = "Conta";
			corLogado = new Correntista();
			corLogado.setNome("Matheus");
			corLogado.setSobrenome("Ancelmo");
			corLogado.setRG("000000000");
			corLogado.setCPF("00000000000");
			corLogado.setEmprego(true);
			corLogado.setEndereco("rua do pao com ovo, 444");
			corLogado.setFamiliar("Iraide");
			corLogado.setGrauParentesco("Mãe");
		}
		
		return pagina;
	}
	
	
	public void novaConta(){
		//levar p tela de cadastro;
	}

	public String getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(String txtUsuario) {
		this.txtUsuario = txtUsuario;
	}

	public String getTxtSenha() {
		return txtSenha;
	}

	public void setTxtSenha(String txtSenha) {
		this.txtSenha = txtSenha;
	}

	public Correntista getCorLogado() {
		return corLogado;
	}

	public void setCorLogado(Correntista corLogado) {
		this.corLogado = corLogado;
	}

}
