package br.com.m2j.proteseanalytics.models.game;

import java.util.ArrayList;
import java.util.List;

import br.com.m2j.proteseanalytics.models.Paciente;
import br.com.m2j.proteseanalytics.models.game.Fase;

public class Jogo {
    private Paciente jogador;
    private int score;
    private Fase fase;
    private List<Desafio> desafioList = new ArrayList<Desafio>();

    public Jogo(){
    }

    public Paciente getJogador() {
        return jogador;
    }

    public void setJogador(Paciente jogador) {
        this.jogador = jogador;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Fase getFase() {
        return fase;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
    }

    public void pontuar(){
        this.score += 10;
    }

    public List<Desafio> getDesafioList() {
        return desafioList;
    }

    public void setDesafioList(List<Desafio> desafioList) {
        this.desafioList = desafioList;
    }
}
