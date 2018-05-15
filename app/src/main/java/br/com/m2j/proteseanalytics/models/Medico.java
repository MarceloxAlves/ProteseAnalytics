package br.com.m2j.proteseanalytics.models;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa {

    private String especialidade;
    private int crm;
    private String ufCrm;
    private List<Paciente> pacientes;

    public Medico(String nome, String especialidade, int crm, String ufCrm) {
        super(nome);
        this.especialidade = especialidade;
        this.crm = crm;
        this.ufCrm = ufCrm;
        pacientes = new ArrayList<>();
    }
}