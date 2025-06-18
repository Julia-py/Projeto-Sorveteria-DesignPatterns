package gelatomix.model.decorator;

import gelatomix.model.interfaces.Base;

public class CaldaCaramelo extends AdicionaDecoracao {
        public CaldaCaramelo (Base base) {
            super(base);
        }
        public String getDescricao() {
            return base.getDescricao() + ", Calda de Caramelo ";
        }

        @Override
        public double getPreco() {
            return base.getPreco() + 2.00;
        }
    }

