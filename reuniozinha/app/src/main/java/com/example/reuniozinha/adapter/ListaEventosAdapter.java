package com.example.reuniozinha.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.reuniozinha.R;
import com.example.reuniozinha.model.Evento;
import com.example.reuniozinha.util.ResourceUtil;

import java.util.List;

public class ListaEventosAdapter extends BaseAdapter {

    private final List<Evento> eventos;
    private final Context context;

    public ListaEventosAdapter(List<Evento> eventos, Context context) {
        this.eventos = eventos;
        this.context = context;
    }
    @Override
    public int getCount() {
        return eventos.size();
    }

    @Override
    public Object getItem(int posicao) {
        return eventos.get(posicao);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int posicao, View view, ViewGroup parent) {
        View viewCriada = LayoutInflater.from(context)
                .inflate(R.layout.unidade_evento, parent, false);

        Evento evento = eventos.get(posicao);

        mostraColaborador(viewCriada, evento);
        mostraSala(viewCriada, evento);
        mostraEmpresa(viewCriada, evento);
        mostraData(viewCriada, evento);
//        mostraImagem(viewCriada, evento);

        return viewCriada;
    }

//    private void mostraImagem(View viewCriada, Evento evento) {
//        ImageView imagem = viewCriada.findViewById(R.id.unidade_evento_imagem);
//        Drawable drawableImagemPacote = ResourceUtil
//                .devolveDrawable(context, evento.getImagem());
//        imagem.setImageDrawable(drawableImagemPacote);
//    }

    private void mostraData(View viewCriada, Evento evento) {
        TextView data = viewCriada.findViewById(R.id.unidade_evento_data);
        data.setText(evento.getDataReuniao());
        //implementar formatacao da data
    }

    private void mostraEmpresa(View viewCriada, Evento evento) {
        TextView empresa = viewCriada.findViewById(R.id.unidade_evento_empresa);
        empresa.setText(evento.getEmpresa());
    }

    private void mostraSala(View viewCriada, Evento evento) {
        TextView sala = viewCriada.findViewById(R.id.unidade_evento_sala);
        sala.setText(evento.getSalaEscolhida());
    }

    private void mostraColaborador(View viewCriada, Evento evento) {
        TextView colaborador = viewCriada.findViewById(R.id.unidade_evento_colaborador);
        colaborador.setText(evento.getColaborador());
    }
}
