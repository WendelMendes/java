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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setGenero(Boolean genero) {
        this.genero = genero;
    }
}
