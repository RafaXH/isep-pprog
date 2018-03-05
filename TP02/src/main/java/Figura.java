//package org.dei.figuras;

public class Figura {

    private String cor;

    private static final String COR_POR_OMISSAO = "cinzento";

    public Figura(String cor) {
        setCor(cor);
    }

    public Figura() {
        this(COR_POR_OMISSAO);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Overriden Method
    public String toString() {
        return String.format("cor=%s", cor);
    }

}