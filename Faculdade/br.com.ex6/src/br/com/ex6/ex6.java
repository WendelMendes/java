//Escreva um programa para preencher uma matriz unidimensional (vetor) que dever� receber as temperaturas ao longo do dia. A medi��o precisa ser registrada a cada uma hora. Ao final, exiba a temperatura m�dia do dia.
package br.com.ex6;
import java.util.ArrayList;
import java.util.Scanner;
public class ex6 {
  public static void main(String[] args) throws Exception {
      ArrayList temperaturas = new ArrayList();
          float somaTemperatura = 0;
          float temperatura;
          Scanner xx = new Scanner(System.in);
          for (int i = 0; i < 24; i++) {
            temperatura = xx.nextFloat();
            somaTemperatura =+ temperatura;
            temperaturas.add(temperatura);
          }
          System.out.println("A temperatura média do dia é: "+somaTemperatura/24);
      xx.close();
  }
}
