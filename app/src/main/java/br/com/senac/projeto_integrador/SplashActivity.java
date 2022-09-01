package br.com.senac.projeto_integrador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        //Executar um processo em background
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Abrir a janela de login
                startActivity(new Intent(getApplicationContext(),
                        LoginActivity.class));
            }
        },3000);

    }
}