package barbearia.model;

public class Provider extends People {

    private String cnpj;
    private String endereco;

    public Provider(int id, String nome, char sexo, String telefone, String email, String rg, String cnpj, String endereco) {
        super(id, nome, sexo, telefone, email, rg);
        this.cnpj = cnpj;
        this.endereco = endereco;
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
