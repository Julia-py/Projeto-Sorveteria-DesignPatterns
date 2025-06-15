package gelatomix.model.decorator;

public class CaldaChocolateBranco extends AdicionaDecoracao {
    public CaldaChocolateBranco (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Calda de Chocolate Branco ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 2.50;
    }

}
