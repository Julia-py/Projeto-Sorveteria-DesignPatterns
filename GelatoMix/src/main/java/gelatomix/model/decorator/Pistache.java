package gelatomix.model.decorator;

public class Pistache extends AdicionaDecoracao{
    public Pistache (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", creme de Pistache de Dubai ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 15.00;
    }
}
