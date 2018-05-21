package br.com.m2j.proteseanalytics.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.m2j.proteseanalytics.R;

public class MainPacienteActivity extends AppCompatActivity {

    Button perfilBtn, conectividadeBtn, debugBtn, gameBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_paciente);
        setupViews();
    }

    private void setupViews() {
        perfilBtn = findViewById(R.id.perfil_paciente_btn);
        conectividadeBtn = findViewById(R.id.conctividade_paciente_btn);
        debugBtn = findViewById(R.id.debug_paciente_btn);
        gameBtn = findViewById(R.id.game_paciente_btn);
    }

    public void irParaTelaDePerfil(View view) {
        startActivity(new Intent(this,PacientePerfilActivity.class));
    }

    public void irParaTelaDeConectividade(View view) {
        startActivity(new Intent(this,JogoActivity.class));
    }

    public void irParaTelaDeDebug(View view) {
        startActivity(new Intent(this,JogoActivity.class));
    }

    public void irParaGame(View view) {
        startActivity(new Intent(this,JogoActivity.class));
    }
}
