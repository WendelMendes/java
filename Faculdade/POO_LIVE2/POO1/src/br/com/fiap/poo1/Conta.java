package br.com.fiap.poo1;

import java.util.Date;

public abstract class Conta {

	public String numeroConta;
	public String agencia;
	private float saldo;
	public Date dataAbertura;
	public Cliente cliente;

	public float getSaldo() {
		// mil linhas
		return saldo;
	}

	public void depositar(float valorDeposito) {
		System.out.println(this.agencia);
		System.out.println(this.numeroConta);
		this.saldo = valorDeposito;
	}

	public static void mensagem() {
		System.out.println("Mensagem");
	}

	public abstract void saque(float valorSaque);
		

}
