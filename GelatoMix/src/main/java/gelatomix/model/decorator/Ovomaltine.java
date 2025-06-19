package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Ovomaltine extends AdicionaDecoracao {
    public Ovomaltine (Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + ", Ovomaltine ";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 3.00;
    }
}
