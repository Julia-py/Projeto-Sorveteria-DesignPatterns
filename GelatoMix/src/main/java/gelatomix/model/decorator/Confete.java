package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Confete extends AdicionaDecoracao {
    public Confete (Sorvetes base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + " com Confete ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 2.00;
    }
}
