package model.factory.sorvetes;

import model.interfaces.Sorvetes;

public class MilkshakeMenta implements Sorvetes {

    @Override
    public void exibirInformacoes() {
        System.out.println("Milkshake sabor Menta");
    }
}

