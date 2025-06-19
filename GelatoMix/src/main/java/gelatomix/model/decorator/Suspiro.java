package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Suspiro extends AdicionaDecoracao {
    public Suspiro (Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + " com Suspiros Artesanais";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 9.00;
    }
}
