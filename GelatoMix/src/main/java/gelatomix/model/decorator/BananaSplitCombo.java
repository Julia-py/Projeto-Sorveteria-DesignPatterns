package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class BananaSplitCombo extends AdicionaDecoracao {
    public BananaSplitCombo(Sorvetes sorvete) {
        super(new Chantilly(new CaldaChocolate(new Banana(sorvete))));
    }
    @Override
    public String getDescricao(){
        return sorvete.getDescricao() + " com Banana Split Combo";
    }


    @Override
    public  double getPreco() {
       return sorvete.getPreco() + 16.00;
    }
}
