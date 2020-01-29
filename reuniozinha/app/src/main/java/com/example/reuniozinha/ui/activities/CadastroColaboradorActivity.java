package com.example.reuniozinha.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Base64;

import androidx.appcompat.app.AppCompatActivity;

import com.example.reuniozinha.R;
import com.example.reuniozinha.services.VerificadorCadastro;

import org.json.JSONObject;

import static com.example.reuniozinha.R.id.id_botao_efetuar_cadastro;

public class CadastroColaboradorActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_colaborador);



        final EditText nomeUsuario = findViewById(R.id.id_campo_nome);
        final EditText emailUsuario = findViewById(R.id.id_campo_email);
        final EditText senhaUsuario = findViewById(R.id.id_campo_senha);

        Button botaoEfetuarCadastro = findViewById(id_botao_efetuar_cadastro);
        botaoEfetuarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String nomeUsuarioStr = nomeUsuario.getText().toString();
                    String emailUsuarioStr = emailUsuario.getText().toString();
                    String senhaUsuarioStr = senhaUsuario.getText().toString();

                    JSONObject usuarioJson = new JSONObject();

                    usuarioJson.put("nome", nomeUsuarioStr);
                    usuarioJson.put("email", emailUsuarioStr);
                    usuarioJson.put("senha", senhaUsuarioStr);

                    System.out.println(usuarioJson.toString());

                    String novoUsuarioEncoded = Base64.encodeToString(usuarioJson.toString().getBytes("UTF-8"), Base64.NO_WRAP);

                    System.out.println(novoUsuarioEncoded.toString());

                    String respostaMetodo = new VerificadorCadastro().execute(novoUsuarioEncoded).get();

                    if (respostaMetodo.equals("Usuário criado com sucesso")) {
                        startActivity(new Intent(
                                CadastroColaboradorActivity.this,
                                ListaEventosSalasActivity.class));
                    } else {
                        Toast.makeText(CadastroColaboradorActivity.this, "Credenciais inválidas!", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    Toast.makeText(
                            CadastroColaboradorActivity.this,
                            "Erro ao efetuar cadastro!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button botaoVoltarParaTelaLogin = findViewById(R.id.id_botao_voltar_login);
        botaoVoltarParaTelaLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(
                        CadastroColaboradorActivity.this,
                        LoginActivity.class));
            }
        });

    }


}
