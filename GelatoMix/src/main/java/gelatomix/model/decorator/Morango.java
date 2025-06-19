package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Morango extends AdicionaDecoracao {
    public Morango (Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + ", Morango ";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 3.00;
    }
}
