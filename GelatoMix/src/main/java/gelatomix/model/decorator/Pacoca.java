package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Pacoca extends AdicionaDecoracao {
    public Pacoca (Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + " com Paçoca";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 2.00;
    }
}
