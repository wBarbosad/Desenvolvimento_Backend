package br.com.salao.salao.service;

import br.com.salao.salao.model.Sala;

import java.util.ArrayList;
import java.util.List;

public class BandoDeDados {
    private List<Sala> sala = new ArrayList<>();

    public BandoDeDados(){
        sala.add(new Sala(1, false, null));
        sala.add(new Sala(2, false, null));
        sala.add(new Sala(3, true, "Hisoka"));
        sala.add(new Sala(4, true, "Gon Freecss"));
        sala.add(new Sala(5, true, "Killua Zoldyck"));
    }
}
