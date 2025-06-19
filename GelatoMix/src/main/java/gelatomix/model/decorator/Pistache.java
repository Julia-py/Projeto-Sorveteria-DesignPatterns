package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Pistache extends AdicionaDecoracao{
    public Pistache (Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + " com creme de Pistache de Dubai";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 15.00;
    }
}
