package com.example.reuniozinha.model;

public class Evento {


    private final String colaborador;
    private final String salaEscolhida;
    private final String empresa;
    private final int quantiadeDePessoas;
    private final boolean coffeBreak;
    private final String dataReuniao;
    private final String imagem;


    public String getDataReuniao() {
        return dataReuniao;
    }

    public String getImagem() {
        return imagem;
    }

    public String getColaborador() {
        return colaborador;
    }

    public String getSalaEscolhida() {
        return salaEscolhida;
    }

    public String getEmpresa() {
        return empresa;
    }

    public Evento(String colaborador, String salaEscolhida, String empresa, int quantiadeDePessoas, boolean coffeBreak, String dataReuniao, String imagem) {
        this.colaborador = colaborador;
        this.salaEscolhida = salaEscolhida;
        this.empresa = empresa;
        this.quantiadeDePessoas = quantiadeDePessoas;
        this.coffeBreak = coffeBreak;
        this.dataReuniao = dataReuniao;
        this.imagem = imagem;
    }
}
