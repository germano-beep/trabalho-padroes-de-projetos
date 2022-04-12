package barbearia.view;

import barbearia.Model.Client;
import barbearia.Model.Schedule;
import barbearia.Model.Service;
import barbearia.Model.User;
/**
 * @author flaviane ferrares
 */

public class Main {
    
    public static void main(String[] args) {

        Service servico = new Service(1, "Barba", 10);
        //System.out.println(servico.getDescricao());
        //System.out.println(servico.getValor());

        Client cliente = new Client(1, "Flaviane", "Teste", "1111111");
        //System.out.println(cliente.getNome());

        User usuario = new User(1, "Barbeiro", "senha");
        //System.out.println(usuario.getNome());

        Schedule agenda = new Schedule(1, cliente, servico, 10, "12/04/2022 10:55");
        System.out.println(agenda.getId());
        System.out.println(agenda.getCliente().getNome());
        System.out.println(agenda.getServico().getDescricao());
        System.out.println(agenda.getValor());
        System.out.println(agenda.getData());


    }
}
