package gelatomix.model.decorator;

public class Brownie extends AdicionaDecoracao {
    public Brownie (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Pedaços de Brownie ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 3.50;
    }
}
