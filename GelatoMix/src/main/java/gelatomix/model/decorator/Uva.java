package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Uva extends AdicionaDecoracao {
    public Uva (Sorvetes base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + " com Uva ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 3.00;
    }
}
