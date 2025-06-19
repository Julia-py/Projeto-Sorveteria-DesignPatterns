package gelatomix.model.facade;

import gelatomix.model.factory.FactoryBuilder;
import gelatomix.model.interfaces.ISorveteFactory;
import gelatomix.model.interfaces.Sorvetes;

public class GelatomixFacade {

    public Sorvetes fazerPedido(ISorveteFactory factory) {
        Sorvetes sorvete = FactoryBuilder.criarSorvete(factory);
        System.out.println("Pedido realizado com sucesso!");
        System.out.println(sorvete.getDescricao());
        System.out.println(sorvete.getPreco());
        
        return sorvete;
    }
}
