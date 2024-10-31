package entity;

import model.Genero;

public class Filme {
    private int idFilme;
    private String titulo;
    private Genero genero;
    private String duracao;

    public Filme() {
    }

    public Filme(String titulo, String duracao, Genero genero) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public String getDuracao() {
        return this.duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public Genero getGenero() {
        return this.genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String toString() {
        return "FIlme: " + this.titulo + "\nGenero: " + this.genero + "\nDuração: " + this.duracao;
    }
}
