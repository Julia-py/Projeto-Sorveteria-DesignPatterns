package gelatomix.model.decorator;

public class CaldaChocolate extends AdicionaDecoracao {
    public CaldaChocolate (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Calda de Chocolate ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 2.50;
    }
}
