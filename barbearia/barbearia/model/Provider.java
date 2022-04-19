package barbearia.model;

public class Provider extends People {

    private String cnpj;
    
    public Provider(int id, String nome, char sexo, String telefone, String email, String rg, String endereco, String cnpj) {
        super(id, nome, sexo, telefone, email, rg, endereco);
        this.cnpj = cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
