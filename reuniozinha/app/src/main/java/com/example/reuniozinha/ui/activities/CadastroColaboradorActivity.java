package com.example.reuniozinha.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.reuniozinha.R;

public class CadastroColaboradorActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_colaborador);

        Button botaoEfetuarCadastro = findViewById(R.id.id_botao_efetuar_cadastro);
        botaoEfetuarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(
                        CadastroColaboradorActivity.this,
                        ListaEventosSalasActivity.class));
            }
        });

    }
}
