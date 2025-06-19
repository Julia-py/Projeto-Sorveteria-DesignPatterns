package gelatomix.model.factory.sorvetes;

import gelatomix.model.interfaces.Sorvetes;

public class MassaChocolate implements Sorvetes {

    public String getDescricao() {
        return "Bola de Sorvete de Chocolate";
    }

    public double getPreco() {
        return 2.00;
    }
}
