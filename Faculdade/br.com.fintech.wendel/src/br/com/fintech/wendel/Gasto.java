package br.com.fintech.wendel;

public class Gasto extends CategoriaGasto {
    private double valorGasto;
    private String dataGasto;
    private String horaGasto;
    private String descricaoGasto;
    
    public Gasto() {
    }

    public Gasto(double valorGasto, String dataGasto, String horaGasto, String descricaoGasto) {
        this.valorGasto = valorGasto;
        this.dataGasto = dataGasto;
        this.horaGasto = horaGasto;
        this. descricaoGasto = descricaoGasto;
    }

    public double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(double valorGasto) {
        this.valorGasto = valorGasto;
    }

    public String getDataGasto() {
        return dataGasto;
    }

    public void setDataGasto(String dataGasto) {
        this.dataGasto = dataGasto;
    }

    public String getHoraGasto() {
        return horaGasto;
    }

    public void setHoraGasto(String horaGasto) {
        this.horaGasto = horaGasto;
    }

    public String getDescricaoGasto() {
        return descricaoGasto;
    }

    public void setDescricaoGasto(String descricaoGasto) {
        this.descricaoGasto = descricaoGasto;
    }

}
