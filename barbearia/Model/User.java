package barbearia.Model;

public class User {
    private int id;
    private String nome;
    private String senha;
    private String nivelAcesso;
    private char sexo;
    private String telefone;
    private String email;
    private String rg;
    
    
    public User(int id, String nome, String senha, String nivelAcesso, char sexo, String telefone, String email, String rg) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
    }


    public User(int id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
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


    public char getSexo() {
        return sexo;
    }


    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getRg() {
        return rg;
    }


    public void setRg(String rg) {
        this.rg = rg;
    }

}