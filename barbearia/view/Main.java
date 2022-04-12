package barbearia.view;

import barbearia.Model.Service;
/**
 * @author flaviane ferrares
 */

public class Main {
    
    public static void main(String[] args) {
        
        String nome = "Flaviane";
        System.out.println(nome);

        Service service = new Service(1, "Barba", 10);

        System.out.println(service.getDescricao());
        System.out.println(service.getValor());


    }
}
