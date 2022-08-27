package br.com.fiap.poo1;

public class Teste {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente("Caio","999.999.999-99","00000000-0");	
		//cli1.nome = "Caio";
		//cli1.cpf = "999.999.999-99";
		//cli1.rg = "11111111";
		Conta refFutura;
		if (true) {
		refFutura = new ContaCorrente();
		}
		refFutura.saque(90);
		ContaPopanca c1 = new ContaPopanca();
		c1.depositar(1000);
		c1.cliente = cli1;
		c1.numeroConta = "000001";
		c1.agencia = "00002";
		c1.depositar(90);
		float saldoAtual = c1.getSaldo();
		Cliente cli2 = new Cliente();
		 cli2.nome = "Caio";
		 cli2.cpf = "999.999.999-99";
	     cli2.rg = "11111111";
		ContaCorrente c2 = new ContaCorrente();
		System.out.println("Agencia" + c1.agencia);
		System.out.println("Numero da conta" + c1.numeroConta);
		System.out.println("O valor do saldo atual � " + saldoAtual);

	}

}