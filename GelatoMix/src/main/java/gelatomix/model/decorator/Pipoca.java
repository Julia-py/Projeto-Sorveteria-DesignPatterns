package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Pipoca extends AdicionaDecoracao {
    public Pipoca (Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + " com Pipoca Gourmet Tritrurada";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 5.00;
    }
}
