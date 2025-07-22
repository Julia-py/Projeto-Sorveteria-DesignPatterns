package gelatomix.model.singleton;

import java.util.LinkedList;
import java.util.Queue;

import gelatomix.model.state.Pedido;
import gelatomix.model.observer.PedidoObserver;

public class FiladePedidos {
    private static FiladePedidos instancia;
    private Queue<Pedido> fila;
    private PedidoObserver observer = new PedidoObserver();

    private FiladePedidos () {
        fila = new LinkedList<>();
    }

    public static FiladePedidos getInstancia() {
        if (instancia == null){
            instancia = new FiladePedidos ();
        }
        return instancia;
    }

    public void adicionarPedido (Pedido pedido) {
        fila.add(pedido);
        observer.notificarClientes("Pedido adicionado: " + pedido.getDescricao());
    }

    public void removerPedido (Pedido pedido) {
        boolean removido = fila.remove(pedido);
        if (removido) {
            observer.notificarClientes("Pedido cancelado: " + pedido.getDescricao());
        } else {
            observer.notificarClientes("Pedido não encontrado na fila.");
        }
    }

    public int tamanhoFila () {
        return fila.size();
    }

    public Pedido proximoPedido () {
        if (!fila.isEmpty()){
            return fila.poll();
        } else {
            observer.notificarClientes("Fila de pedidos está vazia");
            return null;
        }
    }

    public void listarPedidos() {
        if (fila.isEmpty()) {
            observer.notificarClientes("Nenhum pedido na fila.");
        } else {
            StringBuilder sb = new StringBuilder("Pedidos na fila:\n");
            for (Pedido p : fila) {
                sb.append(" - ").append(p.getDescricao()).append("\n");
            }
            observer.notificarClientes(sb.toString());
        }
    }
}