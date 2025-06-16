package gelatomix.model.decorator;

import gelatomix.model.interfaces.Base;

public class CaldaMorango extends AdicionaDecoracao {
    public CaldaMorango (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Calda de Morango ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 2.00;
    }
}
