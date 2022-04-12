package barbearia.Model;

public class User extends People {

    protected String senha;
    protected String nivelAcesso;
    
    public User(int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }
    
    public User(int id, String nome, char sexo, String telefone, String email, String rg, String senha, String nivelAcesso) {
        super(id, nome, sexo, telefone, email, rg);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
    


}
