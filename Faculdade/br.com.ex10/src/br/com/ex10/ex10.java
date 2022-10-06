//Indique se uma expressão é palíndroma. Exemplo: “AMOR” e “ROMA” não são palíndromos. “OVO” e “OVO” ou “AMOR ME AMA EM ROMA” e “AMOR ME AMA EM ROMA” são palíndromes.
package br.com.ex10;

public class ex10 {
	public static void main(String[] args) {
		String palavra = new String("AMOR ME AMA EM ROMA");
		String palavraInvertida = new StringBuilder(palavra).reverse().toString();
		if (palavra.equals(palavraInvertida)) {
			System.out.println(palavra+" É um palíndromo");
		} else {
			System.out.println(palavra+" não é um palíndromo");
		}
	}
}
