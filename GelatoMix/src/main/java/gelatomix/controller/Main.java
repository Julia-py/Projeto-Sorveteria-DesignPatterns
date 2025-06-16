package controller;

import model.factory.FactoryBuilder;
import model.factory.FactoryMassaChocolate;
import model.factory.FactoryMilkshakeMenta;
import model.factory.FactoryPicoleChocolate;
import model.interfaces.Sorvetes;

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
