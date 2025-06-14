package gelatomix.model.interfaces;
import gelatomix.model.Pedido;
/*faz parte do padrão state*/

public interface EstadoPedido {
    void proximoEstado(Pedido pedido);
    String getNomeEstado();

}
