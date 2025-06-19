package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class ChocoBall extends AdicionaDecoracao {
    public ChocoBall (Sorvetes base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + " com ChocoBall ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 2.00;
    }
}
