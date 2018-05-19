package br.com.m2j.proteseanalytics.models.game;

import java.util.Random;

public class Desafio {
    private int meta;
    private String descricao;

    public Desafio() {
        gerarRandomMeta();
    }

    public Desafio(int meta){
        gerarMeta(meta);
    }
    private void gerarMeta(int nMeta){
        this.meta = nMeta;
        this.descricao = "Aperte " + nMeta + " vezes";
    }

    private void gerarRandomMeta(){
        this.meta = rand(20,40);
        this.descricao = "Aperte " + this.meta + " vezes";
    }

    static int rand(int Str, int End) {
        return (int) Math.ceil(Math.random() * (End  - Str + 1)) - 1 + Str;
    }
}
