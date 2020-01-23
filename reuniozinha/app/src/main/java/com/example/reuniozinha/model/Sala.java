package com.example.reuniozinha.model;

import android.text.format.DateFormat;

public class Sala {

    private final String nome;
    private final int capacidadeDePessoas;
    private final boolean possuiMultimidia;
    private final boolean possuiArCondicionado;
    private final DateFormat dataCriacaoSala;

    public Sala(String nome, int capacidadeDePessoas, boolean possuiMultimidia, boolean possuiArCondicionado, DateFormat dataCriacaoSala) {
        this.nome = nome;
        this.capacidadeDePessoas = capacidadeDePessoas;
        this.possuiMultimidia = possuiMultimidia;
        this.possuiArCondicionado = possuiArCondicionado;
        this.dataCriacaoSala = dataCriacaoSala;
    }
}
