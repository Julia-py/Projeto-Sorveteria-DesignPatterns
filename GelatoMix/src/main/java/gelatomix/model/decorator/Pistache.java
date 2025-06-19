package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Pistache extends AdicionaDecoracao{
    public Pistache (Sorvetes base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + " com creme de Pistache de Dubai ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 15.00;
    }
}
