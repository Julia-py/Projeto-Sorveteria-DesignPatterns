package gelatomix.model.decorator;

public class LeiteNinho extends AdicionaDecoracao {
    public LeiteNinho(Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Creme de Leite Ninho ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 2.50;
    }
}
