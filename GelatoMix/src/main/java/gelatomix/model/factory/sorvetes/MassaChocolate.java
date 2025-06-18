package gelatomix.model.factory.sorvetes;

import gelatomix.model.interfaces.Sorvetes;

public class MassaChocolate implements Sorvetes {

    @Override
    public void exibirInformacoes() {
        System.out.println("Bola de Sorvete de Chocolate");
    }
}
