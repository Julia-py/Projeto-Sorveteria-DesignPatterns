package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class FarofaCastanha extends AdicionaDecoracao {
    public FarofaCastanha (Sorvetes base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Farofa Crocante de Castanha ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 8.00;
    }
}
