package gelatomix.model.factory;

import gelatomix.model.interfaces.Base;

/*ja esta com o padrao decorator*/
public class Sorvete implements Base {
    public String getDescricao() {
        return  "Sorvete ";
    }
    public double getPreco() {
        return 2.00;
    }
}
