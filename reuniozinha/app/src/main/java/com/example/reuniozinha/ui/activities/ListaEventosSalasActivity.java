package com.example.reuniozinha.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.reuniozinha.R;
import com.example.reuniozinha.adapter.ListaEventosAdapter;
import com.example.reuniozinha.dao.EventoDAO;
import com.example.reuniozinha.model.Evento;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class ListaEventosSalasActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Próximos eventos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_eventos_salas);

        setTitle(TITULO_APPBAR);

        configuraLista();
        configuraBotaoVisaoMensal();

    }

    private void configuraLista() {
        ListView listaDeEventos = findViewById(R.id.lista_eventos_salas_listview);
        List<Evento> eventos = new EventoDAO().lista();
        listaDeEventos.setAdapter(new ListaEventosAdapter(eventos, this));
    }

    private void configuraBotaoVisaoMensal() {
        FloatingActionButton botaoNovoAluno = findViewById(R.id.id_botao_visao_mensal);
        botaoNovoAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abreVisaoMensal();
            }
        });
}
    private void abreVisaoMensal() {
        startActivity(new Intent(this, VisaoMensalReservasActivity.class));
    }
}
