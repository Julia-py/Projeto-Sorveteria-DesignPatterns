package gelatomix.model.decorator;

public class Uva extends AdicionaDecoracao {
    public Uva (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ",Uva ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 3.00;
    }
}
