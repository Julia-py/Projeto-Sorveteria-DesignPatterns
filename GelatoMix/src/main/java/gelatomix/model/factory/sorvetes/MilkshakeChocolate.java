package gelatomix.model.factory.sorvetes;

import gelatomix.model.interfaces.Sorvetes;

public class MilkshakeChocolate implements Sorvetes {

    public String getDescricao() {
        return "Milkshake sabor Chocolate";
    }

    public double getPreco() {
        return 10.00;
    }
}
