package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Confete extends AdicionaDecoracao {
    public Confete (Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + ", Confete ";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 2.00;
    }
}
