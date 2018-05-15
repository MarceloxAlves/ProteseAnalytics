package br.com.m2j.proteseanalytics.models;

public enum TipoPessoa {

    MEDICO("medico"),
    PACIENTE("paciente"),
    DESENVOLVEDOR("desenvolvedor");

    private String descricao;

    TipoPessoa(String descricao) {
        this.descricao = descricao;
    }
}
