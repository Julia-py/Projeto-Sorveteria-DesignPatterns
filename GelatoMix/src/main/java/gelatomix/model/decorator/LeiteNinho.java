package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class LeiteNinho extends AdicionaDecoracao {
    public LeiteNinho(Sorvetes base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + " com Creme de Leite Ninho ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 4.00;
    }
}
