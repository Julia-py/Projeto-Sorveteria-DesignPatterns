package gelatomix.model.state;
import gelatomix.model.interfaces.Sorvetes;
import gelatomix.model.interfaces.EstadoPedido;

public class Pedido {
    private Sorvetes base;
    private EstadoPedido estadoAtual;

    private String descricao;
    private double preco;
    private String dataCriacao;

    public Pedido(Sorvetes base){
        this.base = base;
        this.estadoAtual = new PedidoRecebido();
    }

    // Gente criei esse construtor e o metódos para os pedidos vindos do banco de dados
    public Pedido(String descricao, double preco, String dataCriacao) {
        this.descricao = descricao;
        this.preco = preco;
        this.dataCriacao = dataCriacao;
    }

    public String getDescricaoSimples() {
        return descricao;
    }
    
    public double getPrecoSimples() {
        return preco;
    }
    
    public String getDataCriacao() {
        return dataCriacao;
    }

    //Júlia não mexi em nada da sua parte, não se preocupe
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
