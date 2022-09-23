//Elabore um programa para fazer a tabuada de um numero fornecido pelo usuario, variando de 0 a 12, e mostre o resultado a cada iteracao.
package br.com.ex2;
import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		System.out.println("Digite um número: ");
		Scanner xx = new Scanner(System.in);
			int valor = xx.nextInt();
		xx.close();
		for (int i = 0; i < 13; i++) {
			int resultado = i * valor;
			System.out.println(valor + " x " + i + " = " + resultado);
		}
	}

}
