package gelatomix.model.decorator;

public class Cereja extends AdicionaDecoracao {
    public Cereja (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Cereja ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 3.50;
    }
}
