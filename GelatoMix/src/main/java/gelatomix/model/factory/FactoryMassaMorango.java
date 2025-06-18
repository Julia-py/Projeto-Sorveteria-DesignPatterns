package gelatomix.model.factory;

import gelatomix.model.factory.sorvetes.MassaMorango;
import gelatomix.model.interfaces.ISorveteFactory;
import gelatomix.model.interfaces.Sorvetes;

public class FactoryMassaMorango implements ISorveteFactory {

    @Override
    public Sorvetes criarSorvete() {
        return new MassaMorango();
    }
}
