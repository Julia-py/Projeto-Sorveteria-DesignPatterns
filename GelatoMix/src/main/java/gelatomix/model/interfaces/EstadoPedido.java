package gelatomix.model.state;
import gelatomix.model.Pedido;

public interface EstadoPedido {
    void proximoEstado(Pedido pedido);
    String getNomeEstado();

}
