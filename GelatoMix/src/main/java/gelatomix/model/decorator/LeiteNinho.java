package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class LeiteNinho extends AdicionaDecoracao {
    public LeiteNinho(Sorvetes sorvete) {
        super(sorvete);
    }

    public String getDescricao() {
        return sorvete.getDescricao() + ", Creme de Leite Ninho ";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 4.00;
    }
}
