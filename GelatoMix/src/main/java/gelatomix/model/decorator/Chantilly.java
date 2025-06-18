package gelatomix.model.decorator;

import gelatomix.model.interfaces.Base;

public class Chantilly extends AdicionaDecoracao {
    public Chantilly (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Chantilly ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 4.00;
    }
}
