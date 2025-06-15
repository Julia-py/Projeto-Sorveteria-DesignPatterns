package gelatomix.model.decorator;

public class ChocoBall extends AdicionaDecoracao {
    public ChocoBall (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", ChocoBall ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 2.00;
    }
}
