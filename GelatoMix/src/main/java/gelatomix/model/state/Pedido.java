package gelatomix.model.state;

import java.time.LocalDateTime;

import gelatomix.model.interfaces.EstadoPedido;
import gelatomix.model.interfaces.Sorvetes;

public class Pedido {
    private EstadoPedido estadoAtual;
    private Sorvetes sorvete;
    private LocalDateTime dataCriacao;

    // Removido campo cliente daqui, o cliente está registrado no observer
    // private Cliente cliente;

    public Pedido(Sorvetes sorvete) {
        this.sorvete = sorvete;
        this.estadoAtual = new PedidoRecebido();
        this.dataCriacao = LocalDateTime.now();
    }

    public void proximoEstado() {
        estadoAtual.proximoEstado(this);
    }

    public void setEstadoAtual(EstadoPedido estado) {
        this.estadoAtual = estado;
    }

    public String getEstado() {
        return estadoAtual.getNomeEstado();
    }

    public String getDescricao() {
        return sorvete.getDescricao();
    }


    public double getPrecoSimples() {
        return sorvete.getPreco();
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
}
