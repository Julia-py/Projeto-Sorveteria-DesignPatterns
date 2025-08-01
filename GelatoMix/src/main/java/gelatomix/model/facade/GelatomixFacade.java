package gelatomix.model.facade;

import java.util.List;

import gelatomix.model.command.CommandInvoker;
import gelatomix.model.command.CriarPedidoCommand;
import gelatomix.model.interfaces.Sorvetes;
import gelatomix.model.state.Pedido;
import gelatomix.repository.PedidoRepository;

public class GelatomixFacade {

    private PedidoRepository pedidoRepository = new PedidoRepository();

    public void fazerPedido(Sorvetes sorvete) {
        CommandInvoker.executarComando(new CriarPedidoCommand(sorvete));
    }

    public void mostrarHistorico() {
        List<Pedido> pedidos = pedidoRepository.listarPedidos();
        System.out.println("\n HISTÓRICO DE PEDIDOS:");
        for (Pedido pedido : pedidos) {
            System.out.println("Pedido: " + pedido.getDescricaoBD()
                             + " | Preço: R$" + pedido.getPrecoBD()
                             + " | Data: " + pedido.getDataCriacao());
        }
    }

    // public void listarFilaPedidos() { // movido para observer
    //    FiladePedidos.getInstancia().listarPedidos();
    // }

    // private void exibirBarraProgresso(String estado) { // movido para observer
    //     switch (estado) {
    //         case "Pedido Recebido":
    //             System.out.println("[█▒▒▒▒▒▒▒▒▒▒] 33% - Pedido recebido ⏳");
    //             break;
    //         case "Preparando o Pedido":
    //             System.out.println("[█████▒▒▒▒▒] 66% - Preparando pedido");
    //             break;
    //         case "Pedido Pronto":
    //             System.out.println("[██████████] 100% - Pedido pronto");
    //             break;
    //         case "Pedido Entregue":
    //             System.out.println("✔ Pedido entregue ao cliente!\n");
    //             break;
    //         default:
    //             System.out.println("⚠ Estado desconhecido.");
    //     }
    // }

    public void MudarStatusPedido(Pedido pedido) {
        // System.out.println("\nAtualização do status do pedido:"); // movido para observer
        pedido.proximoEstado();
        // String novoStatus = pedido.getEstado();
        // exibirBarraProgresso(novoStatus);
    }

}