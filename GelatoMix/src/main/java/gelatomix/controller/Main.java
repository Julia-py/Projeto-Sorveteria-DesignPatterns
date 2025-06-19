package gelatomix.controller;

import gelatomix.model.Pedido;
import gelatomix.model.decorator.Brownie;
import gelatomix.model.decorator.LeiteNinho;
import gelatomix.model.facade.GelatomixFacade;
import gelatomix.model.factory.FactoryBuilder;
import gelatomix.model.factory.FactoryMassaChocolate;
import gelatomix.model.factory.FactoryMilkshakeChocolate;
import gelatomix.model.factory.FactoryMilkshakeMenta;
import gelatomix.model.factory.sorvetes.MassaChocolate;
import gelatomix.model.factory.sorvetes.MilkshakeChocolate;
import gelatomix.model.interfaces.Sorvetes;
import gelatomix.model.singleton.FiladePedidos;


public class Main {
    public static void main(String[] args) {
        //decorator
        Sorvetes milkshake = new MilkshakeChocolate();
        milkshake = new LeiteNinho(milkshake);
        System.out.println(milkshake.getDescricao());
        System.out.println(milkshake.getPreco());

        Sorvetes casquinhaChocolate = new MassaChocolate();
        casquinhaChocolate = new Brownie(casquinhaChocolate);
        System.out.println(casquinhaChocolate.getDescricao());
        System.out.println(casquinhaChocolate.getPreco());

        //facade
        GelatomixFacade facade = new GelatomixFacade();
        facade.fazerPedido(new FactoryMilkshakeChocolate());

        facade.fazerPedido(new FactoryMassaChocolate());
    }
}
