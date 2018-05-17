package br.com.m2j.proteseanalytics.models;

public class Patologia {

    private String doenca;
    private String descricao;

    public Patologia(String doenca) {
        this.doenca = doenca;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
