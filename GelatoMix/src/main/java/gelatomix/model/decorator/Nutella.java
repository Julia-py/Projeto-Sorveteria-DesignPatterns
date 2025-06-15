package gelatomix.model.decorator;

public class Nutella extends AdicionaDecoracao {
    public Nutella (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Nutella ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 4.00;
    }
}
