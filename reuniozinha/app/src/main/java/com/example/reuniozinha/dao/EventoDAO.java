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
                        "Sala Conselho Jedi",
                        "Wise Systems",
                        6,
                        true, "29/01/2020", "sala_conselho_jedi.png"),
                new Evento("Guilherme Ramalho",
                        "Sala Conselho Elfico",
                        "Wise Systems",
                        3,
                        false, "30/01/2020", "sala_conselho_jedi.png"),
                new Evento("Veronica Souza",
                        "Sala Gandalf",
                        "Wise Systems",
                        10,
                        true, "29/01/2020", "sala_conselho_jedi.png"),
                new Evento("Pedro Cabral",
                        "Sala Conselho Jedi",
                        "Wise Systems",
                        3,
                        false, "02/02/2020", "sala_conselho_jedi.png")));
        return eventos;
    }

}
