package br.com.fintech.wendel;

public class Teste {
	public static void main(String[] args) {
		Usuario testeUsuario = new Usuario();
		testeUsuario.nome = "wendel";
		testeUsuario.dataNascimento = 22121999;
		testeUsuario.email = "wendel.omendes@gmail.com";
		testeUsuario.senha = "@teste1234";
		testeUsuario.genero = true; //true-masculino
		System.out.println(testeUsuario.genero);

		Configuracao testeConfiguracao = new Configuracao();
		testeConfiguracao.setNome("Capivara");
		testeConfiguracao.setDataNascimento(22122022);
		testeConfiguracao.setEmail("capivara@gmail.com");
		testeConfiguracao.setSenha("@Capivara123");
		testeConfiguracao.setGenero(false); //false-feminino
		System.out.println(testeConfiguracao.getNome());
	}
}
