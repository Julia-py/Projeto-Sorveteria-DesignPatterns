package gelatomix.model.decorator;

import gelatomix.model.interfaces.Sorvetes;

public class CaldaCaramelo extends AdicionaDecoracao {
        public CaldaCaramelo (Sorvetes sorvete) {
            super(sorvete);
        }

        public String getDescricao() {
            return sorvete.getDescricao() + ", Calda de Caramelo ";
        }

        @Override
        public double getPreco() {
            return sorvete.getPreco() + 2.00;
        }
    }

