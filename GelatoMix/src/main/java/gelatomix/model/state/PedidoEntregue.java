package gelatomix.model.state;

import gelatomix.model.interfaces.EstadoPedido;

public class PedidoEntregue implements EstadoPedido {

    @Override
    public void proximoEstado(Pedido pedido) {
        System.out.println("Pedido já foi entregue.");
    }

    @Override
    public String getNomeEstado() {
        return "Pedido Entregue";
    }

    @Override
    public String getNotificacaoEstado() {
        return "✔ Pedido entregue ao cliente!";
    }
}