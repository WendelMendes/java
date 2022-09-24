//Elabore um programa que leia o nome e o salário de n pessoas, o usuário deverá informar se deseja continuar a iteração. Ao final, apresente a quantidade de pessoas informadas e a média entre os salários.
package br.com.ex4;
import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		for (int i = 0; i != 2; i++) {
			Scanner xx = new Scanner(System.in);
			System.out.println("Digite seu nome: ");
			String nome = xx.next();
			System.out.println("Digite seu salário: ");
			double salario = xx.nextDouble();
			double somaSalario = 0;
			somaSalario += salario;
			System.out.println("Deseja continuar? 0-Sim | 1-Não :  ");
			i = xx.nextInt();
			xx.close();
		}
	}
}
