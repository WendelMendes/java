package br.com.fintech.wendel;

import java.util.Date;

public class Gasto extends CategoriaGasto {
    private Double valorGasto;
    private Date dataGasto;
    private String horaGasto;
    private String descricaoGasto;
    
    public Gasto() {
    }

    public Gasto(Double valorGasto, Date dataGasto, String horaGasto, String descricaoGasto) {
        this.valorGasto = valorGasto;
        this.dataGasto = dataGasto;
        this.horaGasto = horaGasto;
        this. descricaoGasto = descricaoGasto;
    }

    public Double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(Double valorGasto) {
        this.valorGasto = valorGasto;
    }

    public Date getDataGasto() {
        return dataGasto;
    }

    public void setDataGasto(Date dataGasto) {
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

    /**
     * @param descricaoGasto the descricaoGasto to set
     */
    public void setDescricaoGasto(String descricaoGasto) {
        this.descricaoGasto = descricaoGasto;
    }

}
