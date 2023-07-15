package br.com.salao.salao.model;

public class Sala {
    private int id;
    private Boolean estaAlugada;
    private String nomeLocatario;

    public Sala() {
    }

    public Sala(int id, Boolean estaAlugada, String nomeLocatario) {
        this.id = id;
        this.estaAlugada = estaAlugada;
        this.nomeLocatario = nomeLocatario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getEstaAlugada() {
        return estaAlugada;
    }

    public void setEstaAlugada(Boolean estaAlugada) {
        this.estaAlugada = estaAlugada;
    }

    public String getNomeLocatario() {
        return nomeLocatario;
    }

    public void setNomeLocatario(String nomeLocatario) {
        this.nomeLocatario = nomeLocatario;
    }
}
