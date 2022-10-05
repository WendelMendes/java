//Elabore um programa que leia o salário de n pessoas, o usuário deverá informar se deseja continuar a iteração. Ao final, apresente a quantidade de pessoas informadas e a média entre os salários.
package br.com.ex4;
import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner xx = new Scanner(System.in);
			int i = 0;
			float salario = 0;
			int c = 0;
			while (i == 0) {
				System.out.println("Digite o salário: ");
				salario = xx.nextFloat();
				float salarios =+ salario;
				c++;
				System.out.println("Deseja continuar? 1-Sim | 2-Não");
				int teste = xx.nextInt();
				if (teste == 2) {
					i = 1;
					System.out.println("Foram informadas: "+c+ " pessoas!");
					System.out.println("A média dos sálarios é: "+ salarios/c +"!");
				}
			}
		xx.close();
	}
}
