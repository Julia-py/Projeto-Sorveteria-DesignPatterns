package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Cereja extends AdicionaDecoracao {
    public Cereja (Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + " com Cereja";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 5.00;
    }
}
