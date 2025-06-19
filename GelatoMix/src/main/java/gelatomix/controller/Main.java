package gelatomix.controller;

import gelatomix.model.facade.GelatomixFacade;
import gelatomix.model.factory.FactoryMilkshakeChocolate;

public class Main {
    public static void main(String[] args) {
        /**Sorvetes milkShake = FactoryBuilder.criarSorvete(new FactoryMilkshakeMenta());
        System.out.println(milkShake.getDescricao());
        System.out.println(milkShake.getPreco());*/

        GelatomixFacade facade = new GelatomixFacade();

        facade.fazerPedido(new FactoryMilkshakeChocolate());
    }
}
