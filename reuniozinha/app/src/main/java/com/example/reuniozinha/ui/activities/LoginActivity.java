package com.example.reuniozinha.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.reuniozinha.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        Button botaoEntrar = findViewById(R.id.id_botao_efetuar_cadastro);
        botaoEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(
                        LoginActivity.this,
                        ListaEventosSalasActivity.class));
            }
        });

        Button botaoCadastrar = findViewById(R.id.id_botao_cadastrar);
        botaoCadastrar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                startActivity(new Intent(
                        LoginActivity.this,
                       CadastroColaboradorActivity.class));
            }
        });
    }
}
