package entity.composicao;

public class Endereco {
    private String logradouro;
    private String Bairro;
    private String numero;
    private String cidade;

    public Endereco(){

    }
    public Endereco(String logradouro, String bairro, String numero, String cidade) {
        this.logradouro = logradouro;
        this.Bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return this.Bairro;
    }

    public void setBairro(String bairro) {
        this.Bairro = bairro;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
