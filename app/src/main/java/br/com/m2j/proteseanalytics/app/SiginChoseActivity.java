package br.com.m2j.proteseanalytics.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.m2j.proteseanalytics.R;

public class SiginChoseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigin_chose);
    }

    public void irParaCadastroMedico(View view) {
        startActivity(new Intent(this,SiginMedicoActivity.class));
    }

    public void irParaCadastroPaciente(View view) {
        startActivity(new Intent(this,SiginPacienteActivity.class));
    }
}
