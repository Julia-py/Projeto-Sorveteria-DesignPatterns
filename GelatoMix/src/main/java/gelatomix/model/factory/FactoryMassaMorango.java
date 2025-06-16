package model.factory;

import model.factory.sorvetes.MassaMorango;
import model.interfaces.ISorveteFactory;
import model.interfaces.Sorvetes;

public class FactoryMassaMorango implements ISorveteFactory {

    @Override
    public Sorvetes criarSorvete() {
        return new MassaMorango();
    }
}
