package br.com.m2j.proteseanalytics.models;

/**
 * Created by Marcelo on 17/05/2018.
 */

class Medico extends Pessoa {

    private Double crm;
    private String especialidade;

    public Medico(String nome) {
        super(nome);
    }

    public Double getCrm() {
        return crm;
    }

    public void setCrm(Double crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}