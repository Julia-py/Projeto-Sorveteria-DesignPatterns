package gelatomix.model.decorator;

import gelatomix.model.interfaces.Base;

public class CaldaChocolate extends AdicionaDecoracao {
    public CaldaChocolate (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Calda de Chocolate ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 2.00;
    }
}
