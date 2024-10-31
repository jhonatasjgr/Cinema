package entity;

import model.TipoIngresso;

public class Ingresso {
    private int idIngresso;
    private TipoIngresso tipoIngresso;
    private Cliente cliente;
    private Filme filme;
    private Sala sala;


    public Ingresso(Cliente cliente, Filme filme, TipoIngresso tipoIngresso, Sala sala) {
        this.tipoIngresso = tipoIngresso;
        this.sala = sala;
        this.filme = filme;
        this.cliente = cliente;
    }

    public int getIdIngresso() {
        return idIngresso;
    }

    public void setIdIngresso(int idIngresso) {
        this.idIngresso = idIngresso;
    }

    public TipoIngresso getTipoIngresso() {
        return this.tipoIngresso;
    }

    public void setTipoIngresso(TipoIngresso tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Filme getFilme() {
        return this.filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return this.sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }


    public String toString() {
        return "Ingresso: "+idIngresso+"\nCliente: "+cliente.getNome()+
                "\nTipo de ingresso: "+tipoIngresso+"\nFilme: "+filme.getTitulo()+
                "\nSala: "+sala.getNumero();
    }
}
