package br.com.senac.projeto_integrador;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;

public class MostrarActivity extends AppCompatActivity {
    //Declarando as variáveis globais
    ImageView imgMostrarImagem;
    TextView txtMostrarTitulo, txtMostrarTexto;
    MaterialToolbar idToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar_layout);

        imgMostrarImagem = findViewById(R.id.imgMostrarImagem);
        txtMostrarTitulo = findViewById(R.id.txtMostrarTitulo);
        txtMostrarTexto = findViewById(R.id.txtMostrarTexto);
        idToolbar = findViewById(R.id.idToolbar);

        Intent intent = getIntent();

        int imagem = intent.getIntExtra("imagem", 0);
        String titulo = intent.getStringExtra("titulo");
        String texto = intent.getStringExtra("texto");

        imgMostrarImagem.setImageResource(imagem);
        txtMostrarTitulo.setText(titulo);
        txtMostrarTexto.setText(texto);
        idToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
