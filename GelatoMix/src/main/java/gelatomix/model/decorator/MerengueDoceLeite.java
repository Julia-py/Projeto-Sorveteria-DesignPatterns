package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class MerengueDoceLeite extends AdicionaDecoracao {
    public MerengueDoceLeite (Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + " com Merengue de Doce de Leite";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 8.00;
    }
}
