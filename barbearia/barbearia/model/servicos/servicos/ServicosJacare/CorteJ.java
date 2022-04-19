package model.servicos.servicos.ServicosJacare;

import model.servicos.servicos.Corte;

public class CorteJ implements Corte {
    double preco = 20.00;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
