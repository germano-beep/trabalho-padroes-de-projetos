package model.servicos.servicos.ServicosJacare;

import model.servicos.servicos.Pigmentacao;

public class PigmentacaoJ implements Pigmentacao {
    double preco = 40.00;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
