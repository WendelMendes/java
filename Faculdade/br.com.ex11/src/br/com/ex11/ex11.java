//Dado um texto contendo somente palavras separadas por caracteres em branco, terminando em ponto final, escreva apenas as palavras distintas existentes no texto.
//Texto = �EU SOU MAIS EU ENQUANTO. EU SOU EU
//Resposta = EU SOU MAIS ENQUANTO
package br.com.ex11;

public class ex11 {
	public static void main(String[] args) {
		String texto = new String("EU SOU MAIS EU. ENQUANTO EU SOU EU");
		int ponto = texto.indexOf(".");
		if (ponto != -1) {
			String textoEditato = texto.substring(0, ponto);
			System.out.println(textoEditato);
		} else {
			System.out.println("Não existe pontos no texto!");
		}
		

	}

}
