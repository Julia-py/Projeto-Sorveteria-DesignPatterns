package gelatomix.model.decorator;

import gelatomix.model.interfaces.Base;

public class LeiteNinho extends AdicionaDecoracao {
    public LeiteNinho(Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Creme de Leite Ninho ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 4.00;
    }
}
