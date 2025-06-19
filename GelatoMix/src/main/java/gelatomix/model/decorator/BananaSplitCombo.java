package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class BananaSplitCombo extends AdicionaDecoracao {
    public BananaSplitCombo(Sorvetes base) {
        super(new Chantilly(new CaldaChocolate(new Banana(base))));
    }
    @Override
    public String getDescricao(){
        return base.getDescricao() + " com Banana Split Combo";
    }

    @Override
    public  double getPreco() {
       return base.getPreco() + 16.00;
    }
}
