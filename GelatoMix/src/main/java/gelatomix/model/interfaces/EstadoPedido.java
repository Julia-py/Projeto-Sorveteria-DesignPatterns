package gelatomix.model.interfaces;
import gelatomix.model.state.Pedido;

public interface EstadoPedido {
    void proximoEstado(Pedido pedido);
    String getNomeEstado();

}
