package model.servicos.servicos.ServicosJacare;

import model.servicos.servicos.Pezinho;

public class PezinhoJ implements Pezinho {
    double preco = 8.00;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
