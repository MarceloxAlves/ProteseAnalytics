package br.com.m2j.proteseanalytics.models;

public class Pessoa {

    private String nome;
    private String celularPrincipal;
    private String celularSecundario;
    private Endereco endereco;
    private String email;
    private String senha;
    private TipoPessoa tipo;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Campo nome não pode estar vazio");
        }
        this.nome = nome;
    }

}
