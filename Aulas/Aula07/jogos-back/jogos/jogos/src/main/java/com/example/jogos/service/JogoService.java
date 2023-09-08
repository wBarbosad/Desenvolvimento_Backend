package com.example.jogos.service;

import com.example.jogos.model.Jogo;
import com.example.jogos.repository.jogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JogoService {

    @Autowired
    private jogoRepository jogoRepositoryy;
    public List<Jogo> getAll(){
        return jogoRepositoryy.findAll();
    }

    public Jogo save(Jogo jogo){
        return jogoRepositoryy.save(jogo);
    }

    public Jogo favoritar(int id){
        //Optional tipo de dado; Classe genérica que pode ou não existir
        Optional<Jogo> optinalJogo = jogoRepositoryy.findById(id);
        if(optinalJogo.isPresent()){
            Jogo jogo = optinalJogo.get();
            jogo.setEstaFavoritado(!jogo.isEstaFavoritado());
            jogoRepositoryy.save(jogo);
            return jogo;
        }
        return null;
    }

    public void excluir(int id){
        jogoRepositoryy.deleteById(id);
    }
}
