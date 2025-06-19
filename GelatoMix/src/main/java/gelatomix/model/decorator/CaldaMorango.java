package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class CaldaMorango extends AdicionaDecoracao {
    public CaldaMorango (Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + ", Calda de Morango ";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 2.00;
    }
}
