package br.com.salao.salao.controller;

import br.com.salao.salao.model.Sala;
import br.com.salao.salao.service.SalaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("salas")
public class SalaoController {
    @Autowired
    private SalaoService salao;

    @GetMapping
    public List<Sala> getSalas(){
        return salao.getSalas();
    }
    @PutMapping()
    public String alugarSala(@RequestBody Sala salas){
        return salao.alugar(salas);
    }
}
