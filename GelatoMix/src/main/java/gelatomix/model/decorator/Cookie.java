package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Cookie extends AdicionaDecoracao {
    public Cookie (Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + " com Cookie";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 6.00;
    }
}
