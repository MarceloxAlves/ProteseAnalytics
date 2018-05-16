package br.com.m2j.proteseanalytics.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.m2j.proteseanalytics.R;

public class SiginMedicoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigin_medico);
    }

    public void savarMedico(View view) {
        //ToDo::salvar medico na api
    }
}
