package com.example.reuniozinha.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.reuniozinha.R;
import com.example.reuniozinha.services.Verificador;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);
        final EditText emailUsuario = findViewById(R.id.id_campo_email);
        final EditText senhaUsuario = findViewById(R.id.id_campo_senha);

        Button botaoEntrar = findViewById(R.id.id_botao_login);
        botaoEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String emailUsuarioStr = emailUsuario.getText().toString();
                    String senhaUsuarioStr = senhaUsuario.getText().toString();
                    String respostaMetodo = new Verificador().execute(emailUsuarioStr, senhaUsuarioStr).get();

                    if (respostaMetodo.equals("Login efetuado com sucesso!")) {
                        startActivity(new Intent(
                                LoginActivity.this,
                                ListaEventosSalasActivity.class));
                    } else {
                        Toast.makeText(LoginActivity.this, "Credenciais inválidas!", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    Toast.makeText(LoginActivity.this, "Erro ao efetuar login!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button botaoCadastrar = findViewById(R.id.id_botao_voltar_login);
        botaoCadastrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(
                        LoginActivity.this,
                        CadastroColaboradorActivity.class));
            }
        });
    }

}
