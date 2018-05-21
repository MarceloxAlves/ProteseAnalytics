package br.com.m2j.proteseanalytics.app;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.m2j.proteseanalytics.R;

public class SplashActivity extends AppCompatActivity {

    private static int splashTime = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this,LoginPacienteActivity.class));
            finish();
        },splashTime);

    }
}