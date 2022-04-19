package barbearia.model;

/**
 * @author flaviane ferrares
 */

public class Client extends People {

    private String tipo;

    public Client(int id, String nome, char sexo, String telefone, String endereco) {
        super(id, nome, sexo, telefone, endereco);
    }

    public Client(int id, String nome, char sexo, String telefone, String email, String rg, String endereco, String tipo) {
        super(id, nome, sexo, telefone, email, rg, endereco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
}
