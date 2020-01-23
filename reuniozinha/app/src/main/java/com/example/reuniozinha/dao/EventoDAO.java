package com.example.reuniozinha.dao;

import com.example.reuniozinha.model.Evento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EventoDAO {
    public List<Evento> lista() {
        List<Evento> eventos = new ArrayList<>(Arrays.asList(
                new Evento(
                        "Ana Martins",
                        "sala_conselho_jedi",
                        "Wise Systems",
                        6,
                        true, "29/01/2020"),
                new Evento("Guilherme Ramalho",
                        "sala_conselho_elfico",
                        "Wise Systems",
                        3,
                        false, "30/01/2020"),
                new Evento("Veronica Souza",
                        "sala_gandalf",
                        "Wise Systems",
                        10,
                        true, "29/01/2020"),
                new Evento("Pedro Cabral",
                        "sala_conselho_jedi",
                        "Wise Systems",
                        3,
                        false, "02/02/2020")));
        return eventos;
    }

}
