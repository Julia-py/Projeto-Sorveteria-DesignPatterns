package model.factory;

import model.interfaces.ISorveteFactory;
import model.interfaces.Sorvetes;

public class FactoryBuilder {
    private FactoryBuilder() {

    }

    public static Sorvetes criarSorvete(ISorveteFactory factory) {
        return factory.criarSorvete();
    }
}
