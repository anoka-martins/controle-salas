package com.example.reuniozinha.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.reuniozinha.R;

import java.util.List;

public class ListaEventosSalasActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Próximos eventos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_eventos_salas);

        setTitle(TITULO_APPBAR);

//        configuraLista();

    }

//    private void configuraLista() {
//        ListView listaDeEventos = findViewById(R.id.lista_eventos_salas_listview);
//        List<Evento> eventos = new EventoDAO().lista();
//        listaDeEventos.setAdapter(new ListaEventosAdapter(eventos, this));
//    }
}
