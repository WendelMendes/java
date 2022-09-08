package br.com.fintech.wendel;

public class Investimento extends TipoInvestimento {
    private String nomeAplicacaoInvestimento;
    private double valorInvestimento;
    private String corretoraInvestimento;
    private String dataInvestimento;
    private String vencimentoInvestimento;

    public Investimento() {
    }

    public Investimento(String nomeAplicacaoInvestimento, double valorInvestimento, String corretoraInvestimento, String dataInvestimento, String vencimentoInvestimento) {
        this.nomeAplicacaoInvestimento = nomeAplicacaoInvestimento;
        this.valorInvestimento = valorInvestimento;
        this.corretoraInvestimento = corretoraInvestimento;
        this.dataInvestimento = dataInvestimento;
        this.vencimentoInvestimento = vencimentoInvestimento;
    }

    public String getNomeAplicacaoInvestimento() {
        return nomeAplicacaoInvestimento;
    }

    public void setNomeAplicacaoInvestimento(String nomeAplicacaoInvestimento) {
        this.nomeAplicacaoInvestimento = nomeAplicacaoInvestimento;
    }

    public double getValorInvestimento() {
        return valorInvestimento;
    }

    public void setValorInvestimento(double valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
    }

    public String getCorretoraInvestimento() {
        return corretoraInvestimento;
    }

    public void setCorretoraInvestimento(String corretoraInvestimento) {
        this.corretoraInvestimento = corretoraInvestimento;
    }

    public String getDataInvestimento() {
        return dataInvestimento;
    }

    public void setDataInvestimento(String dataInvestimento) {
        this.dataInvestimento = dataInvestimento;
    }

    public String getVencimentoInvestimento() {
        return vencimentoInvestimento;
    }

    public void setVencimentoInvestimento(String vencimentoInvestimento) {
        this.vencimentoInvestimento = vencimentoInvestimento;
    }

}
