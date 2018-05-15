package br.com.m2j.proteseanalytics.models;

public enum BracoDeUso {

    DESTRO(1),
    CANHOTO(2),
    AMBIDESTRO(3);

    private final int valorUsoBraco;

    BracoDeUso(int valorUsoBraco) {
        this.valorUsoBraco = valorUsoBraco;
    }

    public int getValorUsoBraco() {
        return valorUsoBraco;
    }
}
