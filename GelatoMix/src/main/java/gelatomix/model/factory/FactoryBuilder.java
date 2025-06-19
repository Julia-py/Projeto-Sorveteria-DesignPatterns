package gelatomix.model.factory;

import gelatomix.model.interfaces.ISorveteFactory;
import gelatomix.model.interfaces.Sorvetes;

public class FactoryBuilder {
    private FactoryBuilder() {

    }

    public static Sorvetes criarSorvete(ISorveteFactory factory) {
        return factory.criarSorvete();
    }
}
