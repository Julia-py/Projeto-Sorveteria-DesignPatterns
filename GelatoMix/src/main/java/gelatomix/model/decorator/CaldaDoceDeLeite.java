package gelatomix.model.decorator;

import gelatomix.model.interfaces.Base;

public class CaldaDoceDeLeite extends AdicionaDecoracao {
    public CaldaDoceDeLeite (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Calda de Doce de Leite ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 3.00;
    }
}
