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

    public int tamanhoFila () {
        return fila.size();
    }

    public Pedido proximoPedido (){
       if (!fila.isEmpty()){
        return fila.poll();
       } else {
           System.out.println("Fila de pedidos está vazia");
           return null;
       }
    }

    public void listarPedidos() {
        if (fila.isEmpty()) {
            System.out.println("Nenhum pedido na fila.");
        } else {
            System.out.println("Pedidos na fila:");
            for (Pedido p : fila) {
                System.out.println("  " + p.getDescricao());}
        }
    }
}
