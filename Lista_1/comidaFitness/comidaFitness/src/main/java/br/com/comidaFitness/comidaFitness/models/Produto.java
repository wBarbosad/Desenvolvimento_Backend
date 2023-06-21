package br.com.comidaFitness.comidaFitness.models;

public class Produto {
    private int condigoDeBarras;
    private String nome;
    private Double preco;

    public Produto(){
    }

    public Produto(int condigoDeBarras, String nome, Double preco){
        this.condigoDeBarras = condigoDeBarras;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }

    public int getCondigoDeBarras() {
        return condigoDeBarras;
    }

    public Double getPreco(){
        return this.preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }
    public void setCondigoDeBarras(int condigoDeBarras){
        this.condigoDeBarras = condigoDeBarras;
    }

}
