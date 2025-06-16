package gelatomix.model.decorator;

import gelatomix.model.interfaces.Base;

public class Pipoca extends AdicionaDecoracao {
    public Pipoca (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Pipoca Gourmet Tritrurada ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 5.00;
    }
}
