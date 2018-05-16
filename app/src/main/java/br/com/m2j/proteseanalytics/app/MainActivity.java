package br.com.m2j.proteseanalytics.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.m2j.proteseanalytics.R;
import br.com.m2j.proteseanalytics.app.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void realizarLogin(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void realizarCadastro(View view) {
        //ToDO::cadastro
        startActivity(new Intent(this,SiginChoseActivity.class));
    }

    public void autentificarComFacebook(View view) {
        //ToDO::loginFacebook
    }

    public void autentificarComGoogle(View view) {
        //ToDO::loginFacebook
    }
}
