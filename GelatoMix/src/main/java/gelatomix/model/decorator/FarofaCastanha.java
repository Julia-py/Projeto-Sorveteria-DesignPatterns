package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class FarofaCastanha extends AdicionaDecoracao {
    public FarofaCastanha (Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + " com Farofa Crocante de Castanha";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 8.00;
    }
}
