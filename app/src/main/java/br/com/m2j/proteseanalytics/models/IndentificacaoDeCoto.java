package br.com.m2j.proteseanalytics.models;

public enum IndentificacaoDeCoto {

    ESQUERDO(1),
    DIREITO(2),
    AMBOS(3);

    private final int valorBraco;

    IndentificacaoDeCoto(int valorBraco) {
        this.valorBraco = valorBraco;
    }

    public int getValorBraco() {
        return valorBraco;
    }
}
