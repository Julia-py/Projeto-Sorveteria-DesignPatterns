package gelatomix.controller;

import gelatomix.model.decorator.LeiteNinho;
import gelatomix.model.facade.GelatomixFacade;
import gelatomix.model.factory.FactoryBuilder;
import gelatomix.model.factory.FactoryMilkshakeChocolate;
import gelatomix.model.factory.FactoryMilkshakeMenta;
import gelatomix.model.interfaces.Sorvetes;


public class Main {
    public static void main(String[] args) {
        //Sorvetes milkShake = FactoryBuilder.criarSorvete(new FactoryMilkshakeMenta());
        //System.out.println(milkShake.getDescricao());
        //System.out.println(milkShake.getPreco());

        GelatomixFacade facade = new GelatomixFacade();

        facade.fazerPedido(new FactoryMilkshakeChocolate());
    }
}
