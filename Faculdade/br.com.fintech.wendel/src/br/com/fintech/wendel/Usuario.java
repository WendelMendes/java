package br.com.fintech.wendel;

public class Usuario {
    protected String nome;
    protected String email;
    protected String senha;
    protected int dataNascimento;
    protected Boolean genero; 

    public Usuario() {
    }

    public Usuario(String nome, String email, String senha, int dataNascimento, Boolean genero) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected void setSenha(String senha) {
        this.senha = senha;
    }

    protected void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    protected void setGenero(Boolean genero) {
        this.genero = genero;
    }
}
