package br.com.fiap.POO;

public class Teste {

	public static void main(String[] args) {
		
		Cliente objCliente = new Cliente();	
		Conta objConta = new Conta();
		objConta.setCliente(objCliente);
		objCliente.nome = "Caio";	
		objConta.depositar(1000);
		System.out.println("O valor atual do saldo é  " + objConta.getSaldo() );
		objConta.sacar(100);	
		System.out.println("O valor atual do saldo é  " + objConta.getSaldo() );
		System.out.println(objConta.getCliente().nome);
		
	}

}
