package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Morango extends AdicionaDecoracao {
    public Morango (Sorvetes base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Morango ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 3.00;
    }
}
