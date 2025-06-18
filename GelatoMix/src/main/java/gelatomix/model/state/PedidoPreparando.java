package gelatomix.model.state;
import gelatomix.model.interfaces.EstadoPedido;
import gelatomix.model.Pedido;

public class PedidoPreparando implements EstadoPedido {

    @Override
    public void proximoEstado (Pedido pedido) {
        pedido.setEstadoAtual(new PedidoPronto());
    }

    @Override
    public String getNomeEstado() {
        return "Preparando o Pedido";
    }

}
