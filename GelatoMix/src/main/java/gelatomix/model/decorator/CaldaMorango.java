package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class CaldaMorango extends AdicionaDecoracao {
    public CaldaMorango (Sorvetes base) {
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
