package gelatomix.model.state;

import gelatomix.model.interfaces.EstadoPedido;
import gelatomix.model.observer.PedidoObserver;


public class PedidoRecebido implements EstadoPedido {
    private static final PedidoObserver observer = new PedidoObserver();

    @Override
    public void proximoEstado(Pedido pedido) {
        pedido.setEstadoAtual(new PedidoPreparando());
        observer.notificarClientes("Pedido agora está sendo preparado.");
    }

    @Override
    public String getNomeEstado() {
        return "Pedido Recebido";
    }
}
