package gelatomix.model.decorator;

public class Pipoca extends AdicionaDecoracao {
    public Pipoca (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Pipoca Gourmet Tritrurada ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 2.50;
    }
}
