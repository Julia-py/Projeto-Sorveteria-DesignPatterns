package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Chantilly extends AdicionaDecoracao {
    public Chantilly (Sorvetes base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + " com Chantilly ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 4.00;
    }
}
