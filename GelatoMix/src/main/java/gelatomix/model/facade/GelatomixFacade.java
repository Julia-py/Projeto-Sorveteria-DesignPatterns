package gelatomix.model.facade;

import gelatomix.model.Pedido;
import gelatomix.model.factory.FactoryBuilder;
import gelatomix.model.interfaces.ISorveteFactory;
import gelatomix.model.interfaces.Sorvetes;
import gelatomix.model.singleton.FiladePedidos;

public class GelatomixFacade {

    public Pedido fazerPedido(ISorveteFactory factory) {
        Sorvetes sorvete = FactoryBuilder.criarSorvete(factory);

        Pedido pedido = new Pedido(sorvete);
        FiladePedidos fila = FiladePedidos.getInstancia();
        fila.adicionarPedido(pedido);

        System.out.println("✔ Pedido registrado com sucesso!");
        System.out.println(pedido.getDescricao());
        System.out.println("- Estado atual: " + pedido.getEstado());
        exibirBarraProgresso(pedido.getEstado());
        
        return pedido;
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
