package br.com.m2j.proteseanalytics.models;

public enum TipoPessoa {

    MEDICO(1),
    PACIENTE(2),
    DESENVOLVEDOR(3);

    private final int tipoPessoa;

    TipoPessoa(int tipo) {
        this.tipoPessoa = tipo;
    }

    public int getTipoPessoa() {
        return tipoPessoa;
    }
}
