package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Suspiro extends AdicionaDecoracao {
    public Suspiro (Sorvetes base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + " com Suspiros Artesanais ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 9.00;
    }
}
