package model.factory.sorvetes;

import model.interfaces.Sorvetes;

public class PicoleChocolate implements Sorvetes {
    @Override
    public void exibirInformacoes() {
        System.out.println("Picole de Chocolate");
    }
}
