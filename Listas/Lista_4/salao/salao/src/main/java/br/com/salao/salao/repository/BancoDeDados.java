package br.com.salao.salao.repository;

import br.com.salao.salao.model.Sala;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
@Controller
public class BancoDeDados {
    private List<Sala> sala = new ArrayList<>();

    public BancoDeDados(){
        sala.add(new Sala(1, false, null));
        sala.add(new Sala(2, false, null));
        sala.add(new Sala(3, true, "Hisoka"));
        sala.add(new Sala(4, true, "Gon Freecss"));
        sala.add(new Sala(5, true, "Killua Zoldyck"));
        sala.add(new Sala(6, true, "Piccolo"));
        sala.add(new Sala(7, true, "Majin Boo"));
        sala.add(new Sala(8, false, null));
    }

    public List<Sala> salas(){
        return sala;
    }
    public String atualizarSalas(Sala salas){
        for (Sala salasAtuais : sala){
            if (salasAtuais.getId()==salas.getId()){
                if (salasAtuais.getEstaAlugada()==true){
                    return "Sala já alugada";
                }
                salasAtuais.setEstaAlugada(salas.getEstaAlugada());
                salasAtuais.setNomeLocatario(salas.getNomeLocatario());
                return "A sala " + salasAtuais.getId() + " foi alugada com sucesso!";
            }
        }
        return "Sala inexistente";
    }
}
