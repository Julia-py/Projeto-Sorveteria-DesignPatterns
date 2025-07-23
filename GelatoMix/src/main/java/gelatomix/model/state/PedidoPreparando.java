package gelatomix.model.state;

import gelatomix.model.interfaces.EstadoPedido;
import gelatomix.model.observer.PedidoObserver;

public class PedidoPreparando implements EstadoPedido {
    private static final PedidoObserver observer = new PedidoObserver();

    @Override
    public void proximoEstado(Pedido pedido) {
        pedido.setEstadoAtual(new PedidoPronto());
        observer.notificarClientes("Pedido pronto para retirada.");
    }

    @Override
    public String getNomeEstado() {
        return "Preparando o Pedido";
    }

    @Override
    public String getNotificacaoEstado() {
        return "[█████▒▒▒▒▒] 66% - Preparando pedido";
    }
}
