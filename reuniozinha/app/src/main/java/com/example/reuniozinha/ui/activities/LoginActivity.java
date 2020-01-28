package com.example.reuniozinha.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.reuniozinha.R;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);
        final EditText emailUsuario = findViewById(R.id.id_campo_email);
        final EditText senhaUsuario = findViewById(R.id.id_campo_senha);

        String emailString = emailUsuario.getText().toString();
        String senhaString = senhaUsuario.getText().toString();

        Button botaoEntrar = findViewById(R.id.id_botao_login);
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

    public static String makeAuthRequest(String email, String password) throws Exception {
        String wsURL = "http://localhost:8080/ReservaDeSala/rest/usuario/login";

        try {
            StringBuilder result = new StringBuilder();
            URL url = new URL(wsURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("authorization", "secret");
            conn.setRequestProperty("email", email);
            conn.setRequestProperty("password", password);

            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            rd.close();
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro";
        }
    }
}
