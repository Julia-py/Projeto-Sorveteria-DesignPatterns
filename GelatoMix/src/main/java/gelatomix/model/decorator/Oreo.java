package gelatomix.model.decorator;

import gelatomix.model.interfaces.Base;

public class Oreo extends AdicionaDecoracao {
    public Oreo(Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Oreo Triturado ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 4.00;
    }
}
