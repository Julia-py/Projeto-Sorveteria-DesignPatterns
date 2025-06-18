package gelatomix.model.decorator;

import gelatomix.model.interfaces.Base;

public class Pacoca extends AdicionaDecoracao {
    public Pacoca (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Paçoca ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 2.00;
    }
}
