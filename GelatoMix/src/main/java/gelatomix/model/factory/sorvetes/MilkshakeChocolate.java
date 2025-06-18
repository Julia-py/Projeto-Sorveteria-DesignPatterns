package gelatomix.model.factory.sorvetes;

import gelatomix.model.interfaces.Sorvetes;

public class MilkshakeChocolate implements Sorvetes {

    @Override
    public void exibirInformacoes() {
        System.out.println("Milkshake sabor Chocolate");
    }
}
