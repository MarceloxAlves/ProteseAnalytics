package br.com.m2j.proteseanalytics.models;

public class Endereco {

    private String rua;
    private String numero;
    private String bairro;
    private int cep;
    private String cidade;
    private String logradouro;
    private String UF;
    private String pais;

    public Endereco(String rua, String numero, String bairro, int cep, String cidade, String UF) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.UF = UF;
    }
}
