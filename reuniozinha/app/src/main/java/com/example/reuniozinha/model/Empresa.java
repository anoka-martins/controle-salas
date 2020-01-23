package com.example.reuniozinha.model;

public class Empresa {
    private final String nomeEmpresa;
    private final String dominioEmpresa;
    private final String dataCriacaoEmpresa;
    private final boolean atividadeEmpresa;

    public Empresa(String nomeEmpresa, String dominioEmpresa, String dataCriacaoEmpresa, boolean atividadeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.dominioEmpresa = dominioEmpresa;
        this.dataCriacaoEmpresa = dataCriacaoEmpresa;
        this.atividadeEmpresa = atividadeEmpresa;
    }
}
