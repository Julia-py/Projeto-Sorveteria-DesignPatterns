package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class CaldaCaramelo extends AdicionaDecoracao {
        public CaldaCaramelo (Sorvetes base) {
            super(base);
        }
        public String getDescricao() {
            return base.getDescricao() + " com Calda de Caramelo ";
        }

        @Override
        public double getPreco() {
            return base.getPreco() + 2.00;
        }
    }

