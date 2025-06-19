package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Chantilly extends AdicionaDecoracao {
    public Chantilly (Sorvetes base) {
        super(base);
    }
    
    public String getDescricao() {
        return sorvete.getDescricao() + " com Chantilly";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 4.00;
    }
}
