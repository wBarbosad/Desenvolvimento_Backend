package com.example.jogos.repository;

import com.example.jogos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface categoriaRepository extends JpaRepository<Categoria, Integer> {
    //Categoria tipo de dado que queremos persistir, no caso, queremos transformar a classe categoria em uma tabela;
}
