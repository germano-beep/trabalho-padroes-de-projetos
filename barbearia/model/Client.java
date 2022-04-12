package barbearia.model;

/**
 * @author flaviane ferrares
 */

public class Client extends People {

    private String endereco;
    private String cep;


    public Client(int id, String nome, String endereco, String cep) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Client(int id, String nome, char sexo, String telefone, String email, String rg, String endereco, String cep) {
        super(id, nome, sexo, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
   
}
