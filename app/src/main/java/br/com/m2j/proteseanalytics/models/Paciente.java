package br.com.m2j.proteseanalytics.models;

import java.util.ArrayList;
import java.util.List;

import br.com.m2j.proteseanalytics.models.Pessoa;

public class Paciente extends Pessoa{

    private IndentificacaoDeCoto idCoto;
    private BracoDeUso idBracoDeUso;
    private List<Patologia> patologias;
    private Medico medico;

    public Paciente(String nome, Medico medico) {
        super(nome);
        patologias = new ArrayList<>();
        this.medico = medico;
    }


}
