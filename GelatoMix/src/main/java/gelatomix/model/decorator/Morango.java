package gelatomix.model.decorator;

public class Morango extends AdicionaDecoracao {
    public Morango (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Morango ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 3.00;
    }
}
