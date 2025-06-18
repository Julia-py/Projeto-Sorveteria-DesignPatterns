package gelatomix.model.decorator;

import gelatomix.model.interfaces.Base;

public class MerengueDoceLeite extends AdicionaDecoracao {
    public MerengueDoceLeite (Base base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + ", Merengue de Doce de Leite ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 8.00;
    }
}
