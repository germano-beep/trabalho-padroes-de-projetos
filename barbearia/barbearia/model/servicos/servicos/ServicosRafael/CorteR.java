package model.servicos.servicos.ServicosRafael;

import model.servicos.servicos.Corte;

public class CorteR implements Corte {
        
    double preco = 15.00;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
