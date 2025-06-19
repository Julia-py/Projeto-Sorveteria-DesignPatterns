package gelatomix.controller;

import gelatomix.model.Pedido;
import gelatomix.model.facade.GelatomixFacade;
import gelatomix.model.factory.FactoryMassaMorango;
import gelatomix.model.factory.FactoryMilkshakeChocolate;

public class Main {
    public static void main(String[] args) {
    
        GelatomixFacade facade = new GelatomixFacade();
       
        Pedido pedido1 = facade.fazerPedido(new FactoryMilkshakeChocolate());
        facade.statusPedido(pedido1);
        facade.statusPedido(pedido1);
        facade.statusPedido(pedido1);

        Pedido pedido2 = facade.fazerPedido(new FactoryMassaMorango());
        facade.statusPedido(pedido2);
    }
}
