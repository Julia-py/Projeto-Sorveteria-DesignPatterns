package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Uva extends AdicionaDecoracao {
    public Uva (Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + " com Uvas";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 3.00;
    }
}
