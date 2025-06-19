package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Brownie extends AdicionaDecoracao {
    public Brownie (Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + " com Pedaços de Brownie";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 6.00;
    }
}

