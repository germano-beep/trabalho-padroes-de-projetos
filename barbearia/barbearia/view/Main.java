package barbearia.view;
import barbearia.model.*;

/**
 * @author flaviane ferrares
 */

public class Main {
    
    public static void main(String[] args) {

        ServicoInterfFactory fabr02 = new RafaelFactory();
        Corte cort01 = fabr02.createCorte();

        System.out.println(cort01);


    }
}
