package tois.model;

import javax.persistence.*;

@Entity
public class Conta {
	
	private String CPFtitular;
	private int numConta;
	private int numAgencia;
	private String tipo;
	private double taxa;
	private double anuidade;
	private double saldo;
	private String senha;
	
	
	
//	@TableGenerator(name="genId",
//					table="sequences",
//					pkColumnName="numConta",
//					valueColumnName="value",
//					allocationSize=1,
//					initialValue=100)
//	
//	@GeneratedValue(strategy=GenerationType.TABLE,
//					generator="genId")
	
	

	
//	@Id
	public int getNumConta() {
		return numConta;
	}
	public String getCPFtitular() {
		return CPFtitular;
	}
	public void setCPFtitular(String cPFtitular) {
		CPFtitular = cPFtitular;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public int getNumAgencia() {
		return numAgencia;
	}
	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public double getAnuidade() {
		return anuidade;
	}
	public void setAnuidade(double anuidade) {
		this.anuidade = anuidade;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
