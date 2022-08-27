package br.com.fiap.POO;

public class Conta {

	private String numeroConta;
	private String agencia;
	private float saldo;
	private String senha;	
	private Cliente cliente;
	
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {		
		this.cliente = cliente;
	}
	public float getSaldo() {
		return saldo;
	}	
	public void sacar (float valor) {
		if (valor <= this.saldo) {
			this.saldo-=valor;
		}
		else {
			System.out.println("ERRO. Saldo insuficiente");
		}
	}
	public void depositar(float valor) {
		this.saldo += valor;
	}

}
