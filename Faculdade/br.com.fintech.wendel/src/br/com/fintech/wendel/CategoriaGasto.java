package br.com.fintech.wendel;

public class CategoriaGasto {
    protected String categoriaGasto;

    public CategoriaGasto() {
    }

    public CategoriaGasto(String categoriaGasto) {
        this.categoriaGasto = categoriaGasto;
    }

    public String getCategoriaGasto() {
        return categoriaGasto;
    }

    public void setCategoriaGasto(String categoriaGasto) {
        this.categoriaGasto = categoriaGasto;
    }
}
