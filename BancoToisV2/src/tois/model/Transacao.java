package tois.model;

public class Transacao {
	
	private int codTransacao;
	private double valor;
	private int contaFrom;
	private int contaTo;
	
	
	public Transacao(int numConta, int contaTo2, double valor2) {
		codTransacao =(int) (100000 + Math.random() * 899991);
		contaTo = contaTo2;
		contaFrom = numConta;
		valor = valor2;
	}
	public int getCodTransacao() {
		return codTransacao;
	}
	public void setCodTransacao(int codTransacao) {
		this.codTransacao = codTransacao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getContaFrom() {
		return contaFrom;
	}
	public void setContaFrom(int contaFrom) {
		this.contaFrom = contaFrom;
	}
	public int getContaTo() {
		return contaTo;
	}
	public void setContaTo(int contaTo) {
		this.contaTo = contaTo;
	}
	
	
}
