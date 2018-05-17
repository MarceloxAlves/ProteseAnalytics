package br.com.m2j.proteseanalytics.models;

public class Endereco {

    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String pais;

    public Endereco(String rua, String numero, String bairro) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
    }

    public Endereco(String rua, String numero, String bairro, String cidade,
                    String uf) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Endereco(String rua, String numero, String bairro, String cidade,
                    String uf, String pais) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.pais = pais;
    }

    @Override
    public String toString() {
        String endereco = "Rua "+ rua +", numero "+ numero +", Bairro "+ bairro +".";

        if (cidade != null && uf != null) {
            endereco += "\n"+ cidade +" - "+ uf;
        }

        if (pais != null) {
            endereco += ", "+ pais;
        }

        return endereco;
    }
}
