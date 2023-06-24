package com.playstation.midiaDigital.models;

public class Jogo {
    private int id;
    private String nome;
    private Double preco;

    public Jogo(){

    }
    public Jogo(int id, String nome, Double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId(){
        return this.id;
    }
    public String getNome(){
        return this.nome;
    }
    public Double getPreco(){
        return this.preco;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
}
