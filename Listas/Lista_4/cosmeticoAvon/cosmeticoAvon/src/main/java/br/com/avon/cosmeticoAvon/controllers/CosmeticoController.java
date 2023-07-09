package br.com.avon.cosmeticoAvon.controllers;

import br.com.avon.cosmeticoAvon.models.Cosmetico;
import br.com.avon.cosmeticoAvon.service.CosmeticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cosmeticos")
public class CosmeticoController {

    @Autowired
    CosmeticoService cosmeticoService;

    @GetMapping
    public List<Cosmetico> getAll(){
        return cosmeticoService.getDados();
    }
    @GetMapping("/{id}")
    public Cosmetico getById(@PathVariable int id){
        return cosmeticoService.getProduto(id);
    }
    @PostMapping
    public
}
