package gelatomix.model.state;

import gelatomix.model.interfaces.EstadoPedido;
import gelatomix.model.Pedido;

public class PedidoRecebido implements EstadoPedido {

    @Override
    public void proximoEstado(Pedido pedido) {
        pedido.setEstadoAtual(new PedidoPreparando());
    }

    @Override
    public String getNomeEstado() {
        return "Pedido Recebido";
    }
}
