package com.example.jogos.service;

import com.example.jogos.model.Categoria;
import com.example.jogos.repository.categoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private categoriaRepository categoriaaRepository;
    public List<Categoria> getAll(){
        return categoriaaRepository.findAll();
    }
    public Categoria save(Categoria categoria){
        return categoriaaRepository.save(categoria);
    }


}
