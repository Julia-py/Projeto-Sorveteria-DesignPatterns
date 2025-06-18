package gelatomix.model.decorator;

import gelatomix.model.interfaces.Base;

public class Suspiro extends AdicionaDecoracao {
    public Suspiro (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Suspiros Artesanais ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 9.00;
    }
}
