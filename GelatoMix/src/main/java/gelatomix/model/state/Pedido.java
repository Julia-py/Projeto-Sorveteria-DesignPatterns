package gelatomix.model.state;
import gelatomix.model.interfaces.Sorvetes;
import gelatomix.model.interfaces.DescontoStrategy;
import gelatomix.model.interfaces.EstadoPedido;
import gelatomix.model.interfaces.ObservadorPedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Sorvetes base;
    private EstadoPedido estadoAtual;

    private String descricao;
    private double preco;
    private String dataCriacao;

    // Gente criei esse construtor e os metódos para os pedidos vindos do banco de dados
    public Pedido(String descricao, double preco, String dataCriacao) {
        this.descricao = descricao;
        this.preco = preco;
        this.dataCriacao = dataCriacao;
    }

    public Pedido(Sorvetes base){
        this.base = base;
        this.estadoAtual = new PedidoRecebido();
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
        notificarObservadores();
    }

    public String getEstado() {
        return estadoAtual.getNomeEstado();
    }

    public void setEstadoAtual(EstadoPedido estado) {
        this.estadoAtual = estado;
    }

    public EstadoPedido getEstadoAtual() {
        return estadoAtual;
    }

    private DescontoStrategy descontoStrategy;

    public void setDescontoStrategy(DescontoStrategy strategy) {
        this.descontoStrategy = strategy;
    }

    public double calcularPrecoComDesconto() {
        double precoBase = base.getPreco();
        if (descontoStrategy != null) {
            return precoBase - descontoStrategy.aplicarDesconto(precoBase);
        }
        return precoBase;
    }

    private List<ObservadorPedido> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorPedido obs) {
        observadores.add(obs);
    }

    public void removerObservador(ObservadorPedido obs) {
        observadores.remove(obs);
    }

    public void notificarObservadores() {
        String status = estadoAtual.getNomeEstado();
        for (ObservadorPedido obs : observadores) {
            obs.atualizar(status);
        }
    }
    public void setSorvete(Sorvetes sorvete) {
        this.base = sorvete;
    }
}