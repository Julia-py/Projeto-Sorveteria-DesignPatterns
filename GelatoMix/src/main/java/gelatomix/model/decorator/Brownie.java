package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Brownie extends AdicionaDecoracao {
    public Brownie (Sorvetes base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + " com Pedaços de Brownie ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 6.00;
    }
}
