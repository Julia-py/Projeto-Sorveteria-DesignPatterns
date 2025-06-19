package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Nutella extends AdicionaDecoracao {
    public Nutella (Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + " com Nutella";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 4.00;
    }
}
