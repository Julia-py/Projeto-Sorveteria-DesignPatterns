package gelatomix.model.factory.sorvetes;

import gelatomix.model.interfaces.Sorvetes;

public class PicoleChocolate implements Sorvetes {
    @Override
    public void exibirInformacoes() {
        System.out.println("Picole de Chocolate");
    }
}
