package br.com.m2j.proteseanalytics.models;

public abstract class Pessoa {

    private String nome;
    private String celularPrincipal;
    private String celularSecundario;
    private Endereco endereco;
    private String email;
    private String senha;
    private TipoPessoa tipo;

    public Pessoa(String nome, String celularPrincipal, Endereco endereco,
                  String email, TipoPessoa tipo) {
        this.nome = nome;
        this.celularPrincipal = celularPrincipal;
        this.endereco = endereco;
        this.email = email;
        this.tipo = tipo;
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
