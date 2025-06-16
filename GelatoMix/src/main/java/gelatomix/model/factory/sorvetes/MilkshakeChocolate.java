package model.factory.sorvetes;

import model.interfaces.Sorvetes;

public class MilkshakeChocolate implements Sorvetes {

    @Override
    public void exibirInformacoes() {
        System.out.println("Milkshake sabor Chocolate");
    }
}
