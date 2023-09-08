package com.example.jogos.controller;

import com.example.jogos.model.Jogo;
import com.example.jogos.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogos")
@CrossOrigin("*") //Evita o CORS e PERMITE que outros host tenham acesso ao meu conteúdo.
public class JogoController {

    @Autowired
    private JogoService jogoService;

    @GetMapping
    public ResponseEntity<List<Jogo>> getAll(){
        //List<Jogo> = jogoService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(jogoService.getAll());
    }
    @PostMapping
    public ResponseEntity<Jogo> save(@RequestBody Jogo jogoParametro){
        return ResponseEntity.ok(jogoService.save(jogoParametro));
    }
    @PutMapping("/favoritar/{id}")
    public ResponseEntity<Jogo> favoritar(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(jogoService.favoritar(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity excluir(@PathVariable int id){
        jogoService.excluir(id);
        return ResponseEntity.noContent().build();
    }


}
