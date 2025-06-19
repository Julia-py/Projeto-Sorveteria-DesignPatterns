package gelatomix.model.factory;

import gelatomix.model.factory.sorvetes.MassaChocolate;
import gelatomix.model.interfaces.ISorveteFactory;
import gelatomix.model.interfaces.Sorvetes;

public class FactoryMassaChocolate implements ISorveteFactory {

    @Override
    public Sorvetes criarSorvete() {
        return new MassaChocolate();
    }
}
