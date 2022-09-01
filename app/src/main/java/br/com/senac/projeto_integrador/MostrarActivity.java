package br.com.senac.projeto_integrador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MostrarActivity extends AppCompatActivity {

    //Declarando as variáveis globais
    ImageView imgMostrarImagem;
    TextView txtMostrarTitulo, txtMostrarTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar_layout);

        imgMostrarImagem = findViewById(R.id.imgMostrarImagem);
        txtMostrarTitulo = findViewById(R.id.txtMostrarTitulo);
        txtMostrarTexto = findViewById(R.id.txtMostrarTexto);

        Intent intent = getIntent();

        int imagem = intent.getIntExtra("imagem",0);
        String titulo = intent.getStringExtra("titulo");
        String texto = intent.getStringExtra("texto");

        imgMostrarImagem.setImageResource(imagem);
        txtMostrarTitulo.setText(titulo);
        txtMostrarTexto.setText(texto);

    }
}