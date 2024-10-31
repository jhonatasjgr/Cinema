package entity;

public class Sala {
    private int numero;
    private int capMaxima;

    public Sala() {
    }

    public Sala(int numero, int capMaxima) {
        this.numero = numero;
        this.capMaxima = capMaxima;
    }

    public int getCapMaxima() {
        return this.capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String toString(){
        return "Numero da sala:"+this.numero+"\nCapacidade máxima:"+this.capMaxima;
    }
}
