package gelatomix.model.factory;

import gelatomix.model.factory.sorvetes.MilkshakeMenta;
import gelatomix.model.interfaces.ISorveteFactory;
import gelatomix.model.interfaces.Sorvetes;

public class FactoryMilkshakeMenta implements ISorveteFactory {

    @Override
    public Sorvetes criarSorvete() {
        return new MilkshakeMenta();
    }
}
