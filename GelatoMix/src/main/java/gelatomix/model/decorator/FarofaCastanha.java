package gelatomix.model.decorator;

public class FarofaCastanha extends AdicionaDecoracao {
    public FarofaCastanha (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Farofa Crocante de Castanha ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 4.00;
    }
}
