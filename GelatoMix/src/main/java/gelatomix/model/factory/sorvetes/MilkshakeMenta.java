package gelatomix.model.factory.sorvetes;

import gelatomix.model.interfaces.Sorvetes;

public class MilkshakeMenta implements Sorvetes {

    public String getDescricao() {
        return "Milkshake sabor Menta";
    }

    public double getPreco() {
        return 10.00;
    }
}

