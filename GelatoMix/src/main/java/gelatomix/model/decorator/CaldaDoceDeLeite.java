package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class CaldaDoceDeLeite extends AdicionaDecoracao {
    public CaldaDoceDeLeite (Sorvetes base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + " com Calda de Doce de Leite ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 3.00;
    }
}
