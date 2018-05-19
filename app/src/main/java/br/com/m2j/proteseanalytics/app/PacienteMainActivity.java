package br.com.m2j.proteseanalytics.app;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import br.com.m2j.proteseanalytics.R;

public class PacienteMainActivity extends Activity {

    Button perfilBtn, conectividadeBtn, debugBtn, gameBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paciente_main);
        setupViews();
    }

    private void setupViews() {
        perfilBtn = findViewById(R.id.perfil_paciente_btn);
        conectividadeBtn = findViewById(R.id.conctividade_paciente_btn);
        debugBtn = findViewById(R.id.debug_paciente_btn);
        gameBtn = findViewById(R.id.game_paciente_btn);
    }

    public void irParaTelaDePerfil(View view) {
    }

    public void irParaTelaDeConectividade(View view) {
    }

    public void irParaTelaDeDebug(View view) {
    }

    public void irParaGame(View view) {
    }
}
