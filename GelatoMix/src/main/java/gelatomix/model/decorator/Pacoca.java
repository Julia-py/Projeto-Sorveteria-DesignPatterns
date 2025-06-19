package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Pacoca extends AdicionaDecoracao {
    public Pacoca (Sorvetes base) {
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
