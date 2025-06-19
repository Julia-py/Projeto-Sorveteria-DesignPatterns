package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Nutella extends AdicionaDecoracao {
    public Nutella (Sorvetes base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + " com Nutella ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 4.00;
    }
}
