package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Oreo extends AdicionaDecoracao {
    public Oreo(Sorvetes base) {
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
