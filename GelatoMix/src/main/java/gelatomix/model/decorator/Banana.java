package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class Banana extends AdicionaDecoracao {
    public Banana (Sorvetes base) {
        super(base);
    }
    public String getDescricao() {
      return base.getDescricao() + " Banana,";
    }

    @Override
    public double getPreco() {
        return base.getPreco() + 3.00;
    }
}
