package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class CaldaChocolate extends AdicionaDecoracao {

    public CaldaChocolate (Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + " com Calda de Chocolate";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 2.00;
    }
}
