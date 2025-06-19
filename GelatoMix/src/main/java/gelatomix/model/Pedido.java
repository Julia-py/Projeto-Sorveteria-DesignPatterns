package gelatomix.model;
import gelatomix.model.interfaces.Sorvetes;
import gelatomix.model.interfaces.EstadoPedido;
import gelatomix.model.state.PedidoRecebido;

public class Pedido {
    private Sorvetes base;
    private EstadoPedido estadoAtual;

    public Pedido(Sorvetes base){
        this.base = base;
        this.estadoAtual = new PedidoRecebido();
    }

    public Sorvetes getSorvete() {
        return base;
    }    

    public String getDescricao() {
        return "- Pedido do Cliente: " + base.getDescricao() + " | Preço: R$" + base.getPreco();
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
