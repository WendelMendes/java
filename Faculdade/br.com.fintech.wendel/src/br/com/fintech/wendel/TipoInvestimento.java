package br.com.fintech.wendel;

public class TipoInvestimento {
    protected String tipoInvestimento;

    public TipoInvestimento() {
    }

    public TipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }
}
