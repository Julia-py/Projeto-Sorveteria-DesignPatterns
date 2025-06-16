package gelatomix.model.decorator;

import gelatomix.model.interfaces.Base;

public class CaldaChocolateBranco extends AdicionaDecoracao {
    public CaldaChocolateBranco (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Calda de Chocolate Branco ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 2.00;
    }

}
