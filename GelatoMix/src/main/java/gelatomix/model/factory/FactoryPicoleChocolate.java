package gelatomix.model.factory;

import gelatomix.model.factory.sorvetes.PicoleChocolate;
import gelatomix.model.interfaces.ISorveteFactory;
import gelatomix.model.interfaces.Sorvetes;

public class FactoryPicoleChocolate implements ISorveteFactory {

    @Override
    public Sorvetes criarSorvete() {
        return new PicoleChocolate();
    }
}
