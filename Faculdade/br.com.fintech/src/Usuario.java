package br.com.fintench;

public class Usuario {
    public String nome;
    public String email;
    public String senha;
    public Date dataNascimento;
    public Boolean genero; 


    public Usuario() {
    }

    public Usuario(String nome, String email, String senha, Date dataNascimento, Boolean genero) {
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

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setGenero(Boolean genero) {
        this.genero = genero;
    }
}


