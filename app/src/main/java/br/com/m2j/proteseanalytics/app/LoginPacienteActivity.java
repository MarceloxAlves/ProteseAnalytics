package br.com.m2j.proteseanalytics.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import br.com.m2j.proteseanalytics.R;

public class LoginPacienteActivity extends AppCompatActivity {

    EditText editUsername, editPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_paciente);
        setupViews();
    }

    private void setupViews() {
        editUsername = findViewById(R.id.editUsername);
        editPassword = findViewById(R.id.editPassword);
    }

    public void refazerSenha(View view) {
    }

    public void login(View view) {
    }
}
