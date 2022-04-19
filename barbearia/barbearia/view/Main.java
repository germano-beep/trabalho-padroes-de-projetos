package barbearia.view;

import barbearia.model.abstract_factory.BioExtratusProdutosLinhaFactory;
import barbearia.model.abstract_factory.ProdutosLinhaFactory;
import barbearia.model.abstract_factory.product.Shampoo;
import model.servicos.RafaelFactory;

/**
 * @author flaviane ferrares
 */

public class Main {
    
    public static void main(String[] args) {
        
        ProdutosLinhaFactory fabr01 = new BioExtratusProdutosLinhaFactory();
        Shampoo shamp01 = fabr01.createShampoo();

        System.out.println(shamp01.getNome());
        System.out.println(shamp01.getPreco());


        ServicoInterfFactory fabr02 = new RafaelFactory();
        Corte cort01 = fabr02.createCorte();


    }
}
