//Altere o programa anterior para registrar as temperaturas de cada dia do m�s, neste caso, utilize uma matriz com 30 linhas e 24 colunas. Ao final, verifique qual foi a maior temperatura, a menor temperatura e a temperatura m�dia do dia.
package br.com.ex7;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ex7 {
	public static void main(String[] args) throws Exception {
		HashMap temperaturas = new HashMap();
		float maior = 0;
		float menor = 1000;
		float c;
		float somaTemperatura = 0;

		Scanner xx = new Scanner(System.in);
			for (int n = 1; n <= 30; n++) {
				for (int i = 0; i < 24; i++) {
					c = xx.nextFloat();
					temperaturas.put(i,c);

					if (c > maior) {
						maior = c;
					}
					if (c < menor) {
						menor = c;
					}
					somaTemperatura =+c;
				}
				//map.put(n,temperaturas);
				System.out.println("Maior número do dia "+n+": "+maior);
				System.out.println("Menor número do dia "+n+": "+menor);
				System.out.println("Média do dia "+n+": "+ somaTemperatura/24);
				System.out.println("Temperaturas do dia "+n+": "+temperaturas);
			}
		xx.close();
	}
}