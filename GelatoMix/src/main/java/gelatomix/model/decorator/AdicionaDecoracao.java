package gelatomix.model.decorator;
/*faz parte de padrão decorator */

import gelatomix.model.interfaces.Sorvetes;

public abstract class AdicionaDecoracao implements Sorvetes {
    protected Sorvetes base;
    public AdicionaDecoracao( Sorvetes base) {
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
