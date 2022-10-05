//Escreva um programa para armazenar em uma matriz as notas das 5 disciplinas dos 3 alunos de uma turma.
package br.com.ex8;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		int[][]matriz = new int[5][3];

		Scanner entrada = new Scanner(System.in);
			System.out.println("Matriz M[5][3]\n");

			for (int linha = 0; linha < 5; linha++) {
				for (int coluna = 0; coluna < 3; coluna++) {
					System.out.printf("Insira o elemento [displina: %d][aluno: %d]: ", linha + 1, coluna + 1);
					matriz[linha][coluna] = entrada.nextInt();
				}
			}

			System.out.println("\nA Matriz ficou: \n");
			for (int linha = 0; linha < 5; linha++) {
				for (int coluna = 0; coluna < 3; coluna++) {
					System.out.printf("\t %d \t", matriz[linha][coluna]);
				}
				System.out.println();
			}
		entrada.close();
	}
}
