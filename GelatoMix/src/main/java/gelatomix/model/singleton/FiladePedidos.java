package gelatomix.model.singleton;
import gelatomix.model.Pedido;
import java.util.LinkedList;
import java.util.Queue;

public class FiladePedidos {
    private static FiladePedidos instancia;

    private Queue<Pedido> fila;

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
        System.out.println("Pedido adicionado: " + pedido.getDescricao());
    }
    public boolean isVazio () {
       return fila.isEmpty();
    }

    public int tamanhoFila () {
        return fila.size();

    }

    public Pedido proximoPedido (){
        return fila.poll();
    }
}
