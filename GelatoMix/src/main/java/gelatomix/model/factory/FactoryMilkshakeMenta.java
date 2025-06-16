package model.factory;

import model.factory.sorvetes.MilkshakeMenta;
import model.interfaces.ISorveteFactory;
import model.interfaces.Sorvetes;

public class FactoryMilkshakeMenta implements ISorveteFactory {

    @Override
    public Sorvetes criarSorvete() {
        return new MilkshakeMenta();
    }
}
