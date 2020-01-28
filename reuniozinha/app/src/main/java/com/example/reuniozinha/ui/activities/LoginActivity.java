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
        final EditText emailUsuario = findViewById(R.id.id_campo_email);
        final EditText senhaUsuario = findViewById(R.id.id_campo_senha);

        String emailString = emailUsuario.getText().toString();
        String senhaString = senhaUsuario.getText().toString();

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

    public static int makeAuthRequest(String email, String password) throws Exception {
        try {
            String wsURL = "http://localhost:8080/ReservaDeSala/rest/usuario/login";
            URL obj = new URL(wsURL);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("authorization", "secret");
            con.setConnectTimeout(2000);
            con.setRequestProperty("email", email);
            con.setRequestProperty("password", password);

            int responseCode = con.getResponseCode();
            return responseCode;
        } catch (Exception e) {
            e.printStackTrace();
            return 400;
        }
    }
}
