package com.example.jogos.repository;

import com.example.jogos.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jogoRepository extends JpaRepository<Jogo, Integer>{

}
