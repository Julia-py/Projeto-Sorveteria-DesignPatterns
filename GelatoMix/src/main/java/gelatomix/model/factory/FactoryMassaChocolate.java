package model.factory;

import model.factory.sorvetes.MilkshakeChocolate;
import model.interfaces.ISorveteFactory;
import model.interfaces.Sorvetes;

public class FactoryMassaChocolate implements ISorveteFactory {

    @Override
    public Sorvetes criarSorvete() {
        return new MilkshakeChocolate();
    }
}
