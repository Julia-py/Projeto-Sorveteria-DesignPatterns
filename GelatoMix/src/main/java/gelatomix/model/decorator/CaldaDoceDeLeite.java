package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class CaldaDoceDeLeite extends AdicionaDecoracao {
    public CaldaDoceDeLeite (Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + ", Calda de Doce de Leite ";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 3.00;
    }
}
