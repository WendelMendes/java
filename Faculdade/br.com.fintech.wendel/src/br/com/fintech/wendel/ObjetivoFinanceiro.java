package br.com.fintech.wendel;

public class ObjetivoFinanceiro {
    private String nomeObjetivoFinanceiro;
    private String descricaoObjetivoFinanceiro;
    private double valorDoObjetivoFinanceiro;
    private String dataObjetivoFinanceiro;

    public ObjetivoFinanceiro() {
    }

    public ObjetivoFinanceiro(String nomeObjetivoFinanceiro, String descricaoObjetivoFinanceiro, double valorDoObjetivoFinanceiro, String dataObjetivoFinanceiro) {
        this.nomeObjetivoFinanceiro = nomeObjetivoFinanceiro;
        this.descricaoObjetivoFinanceiro = descricaoObjetivoFinanceiro;
        this.valorDoObjetivoFinanceiro = valorDoObjetivoFinanceiro;
        this.dataObjetivoFinanceiro = dataObjetivoFinanceiro;
    }

    public String getNomeObjetivoFinanceiro() {
        return nomeObjetivoFinanceiro;
    }

    public void setNomeObjetivoFinanceiro(String nomeObjetivoFinanceiro) {
        this.nomeObjetivoFinanceiro = nomeObjetivoFinanceiro;
    }

    public String getDescricaoObjetivoFinanceiro() {
        return descricaoObjetivoFinanceiro;
    }

    public void setDescricaoObjetivoFinanceiro(String descricaoObjetivoFinanceiro) {
        this.descricaoObjetivoFinanceiro = descricaoObjetivoFinanceiro;
    }

    public double getValorDoObjetivoFinanceiro() {
        return valorDoObjetivoFinanceiro;
    }

    public void setValorObjetivoFinanceiro(double valorDoObjetivoFinanceiro) {
        this.valorDoObjetivoFinanceiro = valorDoObjetivoFinanceiro;
    }

    public String getDataObjetivoFinanceiro(){
        return dataObjetivoFinanceiro;
    }

    public void setDataObjetivoFinanceiro (String dataObjetivoFinanceiro) {
        this.dataObjetivoFinanceiro = dataObjetivoFinanceiro;
    }
}
