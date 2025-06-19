package gelatomix.model.facade;

import java.util.List;

import gelatomix.model.factory.FactoryBuilder;
import gelatomix.model.interfaces.ISorveteFactory;
import gelatomix.model.interfaces.Sorvetes;
import gelatomix.model.singleton.FiladePedidos;
import gelatomix.model.state.Pedido;
import gelatomix.repository.PedidoRepository;

public class GelatomixFacade {

    private PedidoRepository pedidoRepository = new PedidoRepository();

    public Pedido fazerPedido(ISorveteFactory factory) {
        //pedidoRepository.limparPedidos();
        Sorvetes sorvete = FactoryBuilder.criarSorvete(factory);

        Pedido pedido = new Pedido(sorvete);
        FiladePedidos fila = FiladePedidos.getInstancia();
        fila.adicionarPedido(pedido);
        
        pedidoRepository.salvarPedido(pedido);
        
        return pedido;
    }

    public void mostrarHistorico() {
        List<Pedido> pedidos = pedidoRepository.listarPedidos();
        System.out.println("\n HISTÓRICO DE PEDIDOS:");
        for (Pedido pedido : pedidos) {
            System.out.println("Pedido: " + pedido.getDescricaoSimples()
                             + " | Preço: R$" + pedido.getPrecoSimples()
                             + " | Data: " + pedido.getDataCriacao());
        }
    }

    public void listarFilaPedidos() {
        FiladePedidos.getInstancia().listarPedidos();
    }

    private void exibirBarraProgresso(String estado) {
        switch (estado) {
            case "Pedido Recebido":
                System.out.println("[█▒▒▒▒▒▒▒▒▒▒] 33% - Pedido recebido ⏳");
                break;
            case "Preparando o Pedido":
                System.out.println("[█████▒▒▒▒▒] 66% - Preparando pedido");
                break;
            case "Pedido Pronto":
                System.out.println("[██████████] 100% - Pedido pronto");
                break;
            case "Pedido Entregue":
                System.out.println("✔ Pedido entregue ao cliente!\n");
                break;
            default:
                System.out.println("⚠ Estado desconhecido.");
        }
    }
    

    public void statusPedido(Pedido pedido) {
        System.out.println("\nAtualização do status do pedido:");
        pedido.proximoEstado();
        
        String novoStatus = pedido.getEstado();
        exibirBarraProgresso(novoStatus);
    }
}
