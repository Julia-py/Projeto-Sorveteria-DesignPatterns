package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Ovomaltine extends AdicionaDecoracao {
    public Ovomaltine (Sorvetes base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + " com Ovomaltine ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 3.00;
    }
}
