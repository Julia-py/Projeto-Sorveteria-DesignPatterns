package gelatomix.model.interfaces;
/*faz parte de padrão decorator */

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
