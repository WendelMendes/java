package br.com.fintech.wendel;

public class Recebimento extends CategoriaRecebimento {
    private double valorRecebimento;
    private String dataRecebimento;
    private String descricaoRecebimento;

    public Recebimento() {
    }

    public Recebimento(double valorRecebimento, String dataRecebimento, String descricaoRecebimento) {
        this.valorRecebimento = valorRecebimento;
        this.dataRecebimento = dataRecebimento;
        this.descricaoRecebimento = descricaoRecebimento;
    }

    public double getValorRecebimento() {
        return valorRecebimento;
    }

    public void setValorRecebimento(double valorRecebimento) {
        this.valorRecebimento = valorRecebimento;
    }

    public String getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(String dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public String getDescricaoRecebimento() {
        return descricaoRecebimento;
    }

    public void setDescricaoRecebimento(String descricaoRecebimento) {
        this.descricaoRecebimento = descricaoRecebimento;
    }

}
