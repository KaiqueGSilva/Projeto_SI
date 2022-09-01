package br.com.senac.projeto_integrador;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class BarraInferiorActivity extends AppCompatActivity {

    //Declarando as variaveis no Java

    BottomNavigationView bottomNavigationView;

    //Instanciando as janelas (Fragments)

    DocumentosFragment documentosFragment = new DocumentosFragment();
    HomeFragment homeFragment = new HomeFragment();
    SobreFragment sobreFragment = new SobreFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barra_inferior_layout);

        //Apresentando o xml ao Java
        bottomNavigationView = findViewById(R.id.idBottomNavView);

        //Carregamento do fragment default (Home) na janela de conteudo
        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer,
                homeFragment).commit();

        //Criando o clique nos itens do menu BottomView
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //Criando o switch case para acessar o menu

                switch (item.getItemId()) {
                    case R.id.mDocumentos:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, documentosFragment)
                                .commit();
                        return true;

                    case R.id.mPaginaInicial:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, homeFragment)
                                .commit();
                        return true;

                    case R.id.mSobre:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frmContainer, sobreFragment)
                                .commit();
                        return true;
                }

                return false;
            }
        });
    }
}