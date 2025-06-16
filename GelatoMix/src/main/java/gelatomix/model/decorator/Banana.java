package gelatomix.model.decorator;

import gelatomix.model.interfaces.Base;

public class Banana extends AdicionaDecoracao {
    public Banana (Base base) {
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
