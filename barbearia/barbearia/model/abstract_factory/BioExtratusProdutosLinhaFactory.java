package barbearia.model.abstract_factory;

import barbearia.model.abstract_factory.product.Shampoo;
import barbearia.model.abstract_factory.product.Condicionador;
import barbearia.model.abstract_factory.product.Espuma;


public class BioExtratusProdutosLinhaFactory implements ProdutosLinhaFactory {

    @Override
    public Shampoo createShampoo() {
        return new Shampoo("Shampoo Bio Extratus", 25.78);
    }

    @Override
    public Condicionador createCondicionador() {
        return new Condicionador("Condicionador Bio Extratus", 22.54);
    }

    @Override
    public Espuma createEspuma() {
        return new Espuma("Espuma Bio Extratus", 18.16);
    }
    
}
