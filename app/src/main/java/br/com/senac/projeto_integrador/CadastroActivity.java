package br.com.senac.projeto_integrador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {
    //Declarar as variáveis globais
    EditText edtCadNome, edtCadEmail, edtCadTel, edtCadSenha;
    Button btnCadCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_layout);

        //Apresentando as variáveis xml no java
        edtCadNome = findViewById(R.id.edtCadNome);
        edtCadEmail = findViewById(R.id.edtCadEmail);
        edtCadTel = findViewById(R.id.edtCadTel);
        edtCadSenha = findViewById(R.id.edtCadSenha);
        btnCadCadastrar = findViewById(R.id.btnCadCadastrar);

        btnCadCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = edtCadNome.getText().toString().trim();
                String email = edtCadEmail.getText().toString().trim();
                String telefone = edtCadTel.getText().toString().trim();
                String senha = edtCadSenha.getText().toString().trim();

                if (TextUtils.isEmpty(nome)) {
                    edtCadNome.setError("Por favor, insira o nome");
                    edtCadNome.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(email)) {
                    edtCadEmail.setError("Por favor, insira o e-mail");
                    edtCadEmail.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(telefone)) {
                    edtCadTel.setError("Por favor, insira o telefone");
                    edtCadTel.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(senha)) {
                    edtCadSenha.setError("Por favor, insira a senha");
                    edtCadSenha.requestFocus();
                    return;
                }

                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
            }
        });
    }
}