package gelatomix.model.state;
import gelatomix.model.interfaces.EstadoPedido;
import gelatomix.model.interfaces.Sorvetes;
import gelatomix.model.observer.Cliente;

public class Pedido {
    private EstadoPedido estadoAtual;
    private Sorvetes sorvete;
    private String descricao;
    private double preco;
    private String dataCriacao; 

    private Cliente cliente;

    //tenho que colocar cliente por aqui!!!!!
    public Pedido(Sorvetes sorvete) {
        this.sorvete = sorvete;
        this.estadoAtual = new PedidoRecebido();
    }

     // Gente criei esse construtor e o metódos para os pedidos vindos do banco de dados
    public Pedido(String descricao, double preco, String dataCriacao) {
        this.descricao = descricao;
        this.preco = preco;
        this.dataCriacao = dataCriacao;
    }

    public void proximoEstado() {
        
        if (sorvete != null && estadoAtual != null) {
            estadoAtual.proximoEstado(this);
        } else {
            System.out.println("Não é possível avançar o estado do pedido no momento.");
            
        }
    }

    public void setEstadoAtual(EstadoPedido estado) {
        this.estadoAtual = estado;
    }

    public EstadoPedido getEstadoAtual() {
        return estadoAtual;
    }

    public String getEstado() {
        return estadoAtual.getNomeEstado();
    }

    public String getDescricao() {
        return sorvete.getDescricao();
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricaoSimples(){
        return descricao;
    }


    public double getPrecoSimples() {
        return sorvete.getPreco();
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public Sorvetes getSorvete() {
        return sorvete;
    }

    public void setSorvete(Sorvetes sorvete) {
        this.sorvete = sorvete;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
