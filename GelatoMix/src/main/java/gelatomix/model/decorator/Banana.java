package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Banana extends AdicionaDecoracao {
    public Banana (Sorvetes sorvete) {
        super(sorvete);
    }
    public String getDescricao() {
      return sorvete.getDescricao() + " Banana,";
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco() + 3.00;
    }
}

