package barbearia.model.abstract_factory;

import barbearia.model.abstract_factory.product.Shampoo;
import barbearia.model.abstract_factory.product.Condicionador;
import barbearia.model.abstract_factory.product.Espuma;

public class NaturaProdutosLinhaFactory implements ProdutosLinhaFactory{

    @Override
    public Shampoo createShampoo() {
        return new Shampoo("Shampoo Natura", 13.24);
    }

    @Override
    public Condicionador createCondicionador() {
        return new Condicionador("Condicionador Natura", 17.40);
    }

    @Override
    public Espuma createEspuma() {
        return new Espuma("Espuma Natura", 10);
    }
    
}
