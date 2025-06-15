package gelatomix.model.decorator;

public class Ovomaltine extends AdicionaDecoracao {
    public Ovomaltine (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Ovomaltine ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 2.00;
    }
}
