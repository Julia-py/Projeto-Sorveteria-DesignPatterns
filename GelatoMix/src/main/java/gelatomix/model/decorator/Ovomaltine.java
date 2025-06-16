package gelatomix.model.decorator;

import gelatomix.model.interfaces.Base;

public class Ovomaltine extends AdicionaDecoracao {
    public Ovomaltine (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Ovomaltine ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 3.00;
    }
}
