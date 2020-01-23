package com.example.reuniozinha.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.reuniozinha.R;

public class CadastroSalaActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Criar sala";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_sala);
        setTitle(TITULO_APPBAR);
    }
}
