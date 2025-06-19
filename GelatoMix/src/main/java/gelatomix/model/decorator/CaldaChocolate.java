package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class CaldaChocolate extends AdicionaDecoracao {
    public CaldaChocolate (Sorvetes base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + " com Calda de Chocolate ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 2.00;
    }
}
