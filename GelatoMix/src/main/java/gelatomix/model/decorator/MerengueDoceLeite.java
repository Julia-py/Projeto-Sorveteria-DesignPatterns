package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class MerengueDoceLeite extends AdicionaDecoracao {
    public MerengueDoceLeite (Sorvetes base) {
        super(base);
    }
    public String getDescricao() {
        return base.getDescricao() + " com Merengue de Doce de Leite ";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 8.00;
    }
}
