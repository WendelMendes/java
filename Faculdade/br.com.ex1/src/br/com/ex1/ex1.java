package br.com.ex1;
import java.util.Scanner;
public class ex1 {
 public static void main(String[] args) {
     int valorTotal = 0;
     Scanner xx = new Scanner(System.in);
         for (int i=1; i<=20 ; i++) {
        	 System.out.println("Digite o " + i + "º valor: ");
        	 int valor = xx.nextInt();
             valorTotal = valorTotal + valor;
         }
         System.out.println(valorTotal);
     xx.close();
 }
}
//Elabore um programa para ler 20 valores inteiros fornecidos pelo usuário e calcular a soma deles. Apresente o resultado ao final.
