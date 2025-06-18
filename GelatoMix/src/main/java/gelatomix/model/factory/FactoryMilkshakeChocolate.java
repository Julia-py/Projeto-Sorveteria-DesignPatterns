package gelatomix.model.factory;

import gelatomix.model.factory.sorvetes.MilkshakeChocolate;
import gelatomix.model.interfaces.ISorveteFactory;
import gelatomix.model.interfaces.Sorvetes;

public class FactoryMilkshakeChocolate implements ISorveteFactory {

    @Override
    public Sorvetes criarSorvete() {
        return new MilkshakeChocolate();
    }
}
