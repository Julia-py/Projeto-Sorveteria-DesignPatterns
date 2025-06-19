package gelatomix.model.decorator;
/*faz parte de padrão decorator */

import gelatomix.model.interfaces.Sorvetes;

public abstract class AdicionaDecoracao implements Sorvetes {
    protected Sorvetes sorvete;
    public AdicionaDecoracao( Sorvetes sorvete) {
        this.sorvete = sorvete;
    }

    public String getDescricao() {
        return sorvete.getDescricao();
    }

    @Override
    public double getPreco() {
        return sorvete.getPreco();
    }
}
