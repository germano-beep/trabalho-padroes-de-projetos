package barbearia.model.abstract_factory;

import barbearia.model.abstract_factory.product.Condicionador;
import barbearia.model.abstract_factory.product.Espuma;
import barbearia.model.abstract_factory.product.Shampoo;

public interface ProdutosLinhaFactory {

    public Shampoo createShampoo();
    public Condicionador createCondicionador();
    public Espuma createEspuma();

}
