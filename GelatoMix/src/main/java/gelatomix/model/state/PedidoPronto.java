package gelatomix.model.state;

import gelatomix.model.interfaces.EstadoPedido;
import gelatomix.model.observer.PedidoObserver;

public class PedidoPronto implements EstadoPedido {
    private static final PedidoObserver observer = new PedidoObserver();

    @Override
    public void proximoEstado(Pedido pedido) {
        pedido.setEstadoAtual(new PedidoEntregue());
        observer.notificarClientes("Pedido entregue ao cliente.");
    }

    @Override
    public String getNomeEstado() {
        return "Pedido Pronto";
    }
}