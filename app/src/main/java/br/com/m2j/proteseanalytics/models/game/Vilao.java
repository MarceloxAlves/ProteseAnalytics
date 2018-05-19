package br.com.m2j.proteseanalytics.models.game;

public class Vilao {
    private String nome;
    private int vida;

    public Vilao(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public Vilao(String nome){
        this.nome = nome;
        this.vida = rand(5,10);
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    static int rand(int Str, int End) {
        return (int) Math.ceil(Math.random() * (End  - Str + 1)) - 1 + Str;
    }


}
