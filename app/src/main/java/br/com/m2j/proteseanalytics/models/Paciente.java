package br.com.m2j.proteseanalytics.models;

import java.util.ArrayList;
import java.util.List;

import br.com.m2j.proteseanalytics.models.Pessoa;

public class Paciente extends Pessoa{

    private IndentificacaoDeCoto idCoto;
    private List<Patologia> patologias = new ArrayList<>();
    private Medico medico = new Medico();

    public Paciente(String nome) {
        super(nome);
    }


}
