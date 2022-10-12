package br.com.testes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		Scanner xx = new Scanner(System.in);
			try{
				int numeroUm = xx.nextInt();
				int numeroDois = xx.nextInt();
				int divisao = numeroUm/numeroDois;
				System.out.println("O resultado é: " + divisao);
			} catch (ArithmeticException e) {
				System.err.println("Erro ao divider por zero!");
			} catch (InputMismatchException e) {
				System.err.println("Erro de entrada de dados!");
			} finally {
				System.out.println("Finalizando a execução do programa!");
			}
		xx.close();
		
	}
}
