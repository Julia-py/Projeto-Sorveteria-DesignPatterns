package model.factory;

import model.factory.sorvetes.PicoleChocolate;
import model.interfaces.ISorveteFactory;
import model.interfaces.Sorvetes;

public class FactoryPicoleChocolate implements ISorveteFactory {

    @Override
    public Sorvetes criarSorvete() {
        return new PicoleChocolate();
    }
}
