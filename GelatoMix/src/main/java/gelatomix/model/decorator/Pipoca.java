package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Pipoca extends AdicionaDecoracao {
    public Pipoca (Sorvetes base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + " com Pipoca Gourmet Tritrurada ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 5.00;
    }
}
