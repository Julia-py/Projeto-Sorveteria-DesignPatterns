package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class CaldaChocolateBranco extends AdicionaDecoracao {
    public CaldaChocolateBranco (Sorvetes base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + " com Calda de Chocolate Branco ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 2.00;
    }

}
