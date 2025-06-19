package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Cookie extends AdicionaDecoracao {
    public Cookie (Sorvetes base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Cookie ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 6.00;
    }
}
