package gelatomix.model.command;

import gelatomix.model.facade.GelatomixFacade;
import gelatomix.model.interfaces.ISorveteFactory;
import gelatomix.model.interfaces.PedidoCommand;
import gelatomix.model.state.Pedido;

public class CriarPedidoCommand implements PedidoCommand {
    private Pedido pedido;
    private ISorveteFactory factory;
    private GelatomixFacade facade;

    public CriarPedidoCommand(Pedido pedido, ISorveteFactory factory, GelatomixFacade facade) {
        this.pedido = pedido;
        this.factory = factory;
        this.facade = facade;
    }

    @Override
    public void executar() {
        Pedido pedidoCriado = facade.fazerPedido(factory);
        pedido.setEstadoAtual(pedidoCriado.getEstadoAtual());
        pedido.setSorvete(pedidoCriado.getSorvete());
    }

    @Override
    public void desfazer() {
    //ver oq fazer para remover da fila de pedidos
        pedido.setSorvete(null); // remover o sorvete do pedido
        System.out.println("Pedido cancelado");
    }
}
