package gelatomix.model.decorator;
/*faz parte de padrão decorator */

import gelatomix.model.interfaces.Base;

public abstract class AdicionaDecoracao implements Base {
    protected Base base;
    public AdicionaDecoracao( Base base) {
        this.base = base;
    }

    public String getDescricao() {
        return base.getDescricao();
    }

    @Override
    public double getPreco() {
        return base.getPreco();
    }
}
