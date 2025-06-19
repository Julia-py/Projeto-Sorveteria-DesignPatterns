package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class CaldaChocolateBranco extends AdicionaDecoracao {
    public CaldaChocolateBranco (Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + ", Calda de Chocolate Branco ";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 2.00;
    }

}
