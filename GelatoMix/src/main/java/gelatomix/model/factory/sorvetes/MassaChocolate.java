package model.factory.sorvetes;

import model.interfaces.Sorvetes;

public class MassaChocolate implements Sorvetes {

    @Override
    public void exibirInformacoes() {
        System.out.println("Bola de Sorvete de Chocolate");
    }
}
