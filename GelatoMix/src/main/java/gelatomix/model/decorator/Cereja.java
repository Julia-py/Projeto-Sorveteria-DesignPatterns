package gelatomix.model.decorator;

import gelatomix.model.interfaces.Base;

public class Cereja extends AdicionaDecoracao {
    public Cereja (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Cereja ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 5.00;
    }
}
