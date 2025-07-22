package gelatomix.model.command;

import gelatomix.model.facade.GelatomixFacade;
import gelatomix.model.interfaces.ISorveteFactory;
import gelatomix.model.interfaces.PedidoCommand;
import gelatomix.model.state.Pedido;
import gelatomix.model.state.PedidoRecebido;

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
        if (pedido.getSorvete() == null) {
            System.out.println("Nenhum sorvete associado ao pedido para desfazer.");
            return;
        }
        pedido.setSorvete(null);
        pedido.setEstadoAtual(new PedidoRecebido()); // Reseta o estado para "Pedido Recebido"
        System.out.println("Pedido desfeito: " + pedido.getDescricao());
    }
}