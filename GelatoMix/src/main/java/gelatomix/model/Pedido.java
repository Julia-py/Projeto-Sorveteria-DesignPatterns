package gelatomix.model;
import gelatomix.model.interfaces.EstadoPedido;
import gelatomix.model.state.PedidoRecebido;

public class Pedido {
    private String descricao;
    private EstadoPedido estadoAtual;

    public Pedido(String descricao){
        this.descricao = descricao;
        this.estadoAtual = new PedidoRecebido();
    }
    public String getDescricao() {
        return "Pedido do Cliente " + descricao;
    }
    public void proximoEstado() {
        estadoAtual.proximoEstado(this);
    }

    public String getEstado() {
        return estadoAtual.getNomeEstado();
    }

    public void setEstadoAtual(EstadoPedido estado) {
        this.estadoAtual = estado;
    }
}
