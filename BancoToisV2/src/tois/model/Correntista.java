package tois.model;

import javax.persistence.*;

@Entity
public class Correntista {
	
	private String nome;
	private String sobrenome;
	private String RG;
	private String CPF;
	private String endereco;
	private String familiar;
	private String grauParentesco;
	private boolean emprego;
	
	@TableGenerator(name="genId",
					table="sequences",
					pkColumnName="CPF",
					valueColumnName="value",
					allocationSize=1,
					initialValue=100)
	
	@GeneratedValue(strategy=GenerationType.TABLE,
					generator="genId")
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	
	@Id
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getFamiliar() {
		return familiar;
	}
	public void setFamiliar(String familiar) {
		this.familiar = familiar;
	}
	public String getGrauParentesco() {
		return grauParentesco;
	}
	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}
	public boolean isEmprego() {
		return emprego;
	}
	public void setEmprego(boolean emprego) {
		this.emprego = emprego;
	}		
}
