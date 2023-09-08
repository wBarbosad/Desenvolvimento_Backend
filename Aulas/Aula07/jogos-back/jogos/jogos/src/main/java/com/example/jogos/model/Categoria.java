package com.example.jogos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String nome;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("categoria") //Ignorar certas propriedades da lista que tem dentro dela
    public List<Jogo> jogos; //O jogo vai ser responsável por guardar a chave estrangeira, o id da categoria ao qual ele pertence;
    public int getId() {
        return id;
    }
    //OneToOne
    //OneToMany
    //@ManyToOne
    //@ManyToMany

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
