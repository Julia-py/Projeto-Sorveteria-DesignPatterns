package gelatomix.model.decorator;

public class BananaSplitCombo extends AdicionaDecoracao {
    public BananaSplitCombo(Base base) {
        super(new Chantilly(new CaldaChocolate(new Banana(base))));
    }
    @Override
    public String getDescricao(){
        return base.getDescricao() + ", Banana Split Combo";
    }

    @Override
    public  double getPreco() {
       return base.getPreco() + 7.00;
    }
}
