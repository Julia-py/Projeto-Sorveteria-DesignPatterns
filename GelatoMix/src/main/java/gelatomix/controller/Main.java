package gelatomix.controller;

import gelatomix.model.factory.FactoryBuilder;
import gelatomix.model.factory.FactoryMassaChocolate;
import gelatomix.model.factory.FactoryMilkshakeMenta;
import gelatomix.model.factory.FactoryPicoleChocolate;
import gelatomix.model.interfaces.Sorvetes;

public class Main {
    public static void main(String[] args) {
        Sorvetes milkShake = FactoryBuilder.criarSorvete(new FactoryMilkshakeMenta());
        milkShake.exibirInformacoes();

        Sorvetes picole = FactoryBuilder.criarSorvete(new FactoryPicoleChocolate());
        picole.exibirInformacoes();

        Sorvetes sorveteChocolate = FactoryBuilder.criarSorvete(new FactoryMassaChocolate());
        sorveteChocolate.exibirInformacoes();
    }
}
