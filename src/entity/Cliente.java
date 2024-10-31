package entity;

import entity.composicao.Endereco;

public class Cliente {
    private String nome;
    private String CPF;
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(String nome, String CPF, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.CPF = CPF;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String toString(){
        return "Ciente:"+this.nome+"\nCPF:"+this.CPF+"\nEndereço:\n"+this.endereco.toString();
    }
}
