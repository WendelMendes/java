package br.com.exUm;
import java.util.Scanner;
public class exUm {
 public static void main(String[] args) {
     int valorTotal = 0;
     Scanner xx = new Scanner(System.in);
         for (int i=1; i<=20 ; i++) {
        	 System.out.println("Digite o " + i + "� valor: ");
        	 int valor = xx.nextInt();
             valorTotal = valorTotal + valor;
         }
         System.out.println(valorTotal);
     xx.close();
 }
}
//Elabore um programa para ler 20 valores inteiros fornecidos pelo usu�rio e calcular a soma deles. Apresente o resultado ao final.
