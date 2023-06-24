package com.playstation.midiaDigital.controller;


import com.playstation.midiaDigital.models.Jogo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    private List<Jogo> jogo = new ArrayList<>();

    public JogoController(){
        jogo.add(new Jogo(1, "God of War", 87.91));
        jogo.add(new Jogo(2, "Gof of War - Ragnarok", 134.99));
        jogo.add(new Jogo(3, "Marvel's Spider-Man 2", 349.90));
    }

    @GetMapping()
    public List<Jogo> getAllJogos(){
        return jogo;
    }
    @GetMapping("/{id}")
    public Jogo getId(@PathVariable int id){
        for (Jogo jogo : jogo){
            if(jogo.getId() == id){
                return jogo;
            }
        }
        return null;
    }
    @GetMapping("/menor-preco")
    public Jogo getMenorPreco (){
        for (int i = 0; i < this.jogo.size(); i++) {
            if(jogo.get(i).getPreco()<jogo.get(i+1).getPreco()){
                return jogo.get(i);
            }
        }
        return null;
    }
    @PostMapping()
    public String adicionarJogo(@RequestBody Jogo jogo ){
        for (int i = 0; i < this.jogo.size(); i++) {
            if(this.jogo.get(i).getId()!=jogo.getId()){
                this.jogo.add(jogo);
                return "O jogo " + jogo.getNome() + " foi adicionado ao catálogo!";
            }
        }
        return "Jogo já existente";
    }

}
