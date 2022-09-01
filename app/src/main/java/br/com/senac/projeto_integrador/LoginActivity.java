package br.com.senac.projeto_integrador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    //Declarar as variáveis globais

    EditText edtEmail, edtSenha;
    Button btnLogin, btnCadUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        //Apresentando as variáveis xml no java

        edtEmail = findViewById(R.id.edtEmail);
        edtSenha = findViewById(R.id.edtSenha);
        btnLogin = findViewById(R.id.btnLogin);
        btnCadUsuario = findViewById(R.id.btnCadUsuario);

        //Criando o clique do botão
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Pegar os valores do usuário: E-mail e Senha
                String email, senha;

                email = edtEmail.getText().toString();
                senha = edtSenha.getText().toString();

                //Criando a estrutura de decisão para acesso ao sistema
                if (email.equals("email@gmail.com") && senha.equals("senha")) {
                    //Entrar aqui...
                    Intent intent = new Intent(getApplicationContext(),
                            BarraInferiorActivity.class);
                    //Passar parâmetros para outras janelas
                    startActivity(intent);
                    finish();
                }
            }
        });

        btnCadUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),CadastroActivity.class));
                finish();
            }
        });

    }
}

