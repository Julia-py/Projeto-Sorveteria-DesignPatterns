package gelatomix.model.state;
import gelatomix.model.interfaces.EstadoPedido;
import gelatomix.model.Pedido;

public class PedidoPronto implements EstadoPedido {

    @Override
    public void proximoEstado( Pedido pedido) {
        pedido.setEstadoAtual(new PedidoEntregue());
    }

    public String getNomeEstado() {
       return "Pedido Pronto";
    }
}
