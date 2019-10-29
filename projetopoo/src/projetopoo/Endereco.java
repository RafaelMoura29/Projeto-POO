package projetopoo;

public class Endereco {
    int idEndereco;
    String logradouro;
    String numero;
    String complemento;
    String bairro;
    String cep;

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getIdEndereco() {
        return idEndereco;
    }
    
    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }
}
