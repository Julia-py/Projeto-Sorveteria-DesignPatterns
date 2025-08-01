package gelatomix.model.command;

import gelatomix.model.facade.GelatomixFacade;
import gelatomix.model.factory.FactoryBuilder;
import gelatomix.model.interfaces.ISorveteFactory;
import gelatomix.model.interfaces.PedidoCommand;
import gelatomix.model.interfaces.Sorvetes;
import gelatomix.model.singleton.FiladePedidos;
import gelatomix.model.state.Pedido;
import gelatomix.model.state.PedidoRecebido;
import gelatomix.repository.PedidoRepository;

public class CriarPedidoCommand implements PedidoCommand {
    private Pedido pedido;
    private ISorveteFactory factory;
    private Sorvetes sorvete;
    private PedidoRepository pedidoRepository;

    public CriarPedidoCommand(Sorvetes sorvete) {
        //this.factory = factory;
        this.sorvete = sorvete;
        this.pedidoRepository = new PedidoRepository();
    }

    @Override
    public void executar() {
        //Sorvetes sorvete = FactoryBuilder.criarSorvete(factory);
        Pedido pedido = new Pedido(sorvete);
        FiladePedidos fila = FiladePedidos.getInstancia();
        fila.adicionarPedido(pedido);
        pedidoRepository.salvarPedido(pedido);
        pedidoRepository.listarPedidos();
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