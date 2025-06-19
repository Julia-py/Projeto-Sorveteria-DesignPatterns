package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class ChocoBall extends AdicionaDecoracao {
    public ChocoBall (Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + ", ChocoBall ";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 2.00;
    }
}
