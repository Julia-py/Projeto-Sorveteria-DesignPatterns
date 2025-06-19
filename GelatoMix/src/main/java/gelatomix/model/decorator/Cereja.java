package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Cereja extends AdicionaDecoracao {
    public Cereja (Sorvetes base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + " com Cereja ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 5.00;
    }
}
