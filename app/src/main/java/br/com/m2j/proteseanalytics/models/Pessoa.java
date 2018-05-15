package br.com.m2j.proteseanalytics.models;

public abstract class Pessoa {

    private String nome;
    private String celular;
    private String celularSecundario;
    private Endereco endereco;
    private String email;
    private String senha;

    public Pessoa(String nome) {
        this.nome = nome;
    }


}
