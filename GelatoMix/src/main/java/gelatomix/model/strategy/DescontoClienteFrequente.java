package gelatomix.model.strategy;

import gelatomix.model.interfaces.DescontoStrategy;

public class DescontoClienteFrequente implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.1; 
    }
}
