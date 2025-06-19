package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Oreo extends AdicionaDecoracao {
    public Oreo(Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + ", Oreo Triturado ";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 4.00;
    }
}
