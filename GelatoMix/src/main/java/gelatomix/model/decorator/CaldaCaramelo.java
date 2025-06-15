package gelatomix.model.decorator;

public class CaldaCaramelo extends AdicionaDecoracao {
        public CaldaCaramelo (Base base) {
            super(base);
        }
        public String getDescricao() {
            return base.getDescricao() + ", Calda de Caramelo ";
        }

        @Override
        public double getPreco() {
            return base.getPreco() + 2.50;
        }
    }

