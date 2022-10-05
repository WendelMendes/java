//Considere a string �BANANADA� e combine as instru��es de manipula��o de string para:
	//Imprimir ANA, usando substr.
	//Substituir a string �BANANADA� por �BANDA�, usando a instru��o delete.
	//Indicar as posi��es de todos os 'A's existentes na palavra �BANANADA�.
package br.com.ex9;

public class ex9 {

	public static void main(String[] args) {
		String nome = new String("BANANADA");
		System.out.println(nome);

		String testeUm = nome.substring(3,6);
		System.out.println(testeUm);

		String testeDois = nome.replace("BANANADA","BANDA");
		System.out.println(testeDois);

		int pos = -1;
		for (int i = 1; i <= nome.length(); i++) {
			int x = nome.indexOf("A");
			if (x != -1 && x != pos) {
				System.out.println("Tem 'A' na posição: "+ i);
				pos = x;
			} else {
				pos++;
			}

		}
	}

}
