package gelatomix.model.factory.sorvetes;

import gelatomix.model.interfaces.Sorvetes;

public class MilkshakeMenta implements Sorvetes {

    @Override
    public void exibirInformacoes() {
        System.out.println("Milkshake sabor Menta");
    }
}

