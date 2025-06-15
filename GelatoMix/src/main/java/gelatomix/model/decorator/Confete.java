package gelatomix.model.decorator;

public class Confete extends AdicionaDecoracao {
    public Confete (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Confete ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 2.00;
    }
}
