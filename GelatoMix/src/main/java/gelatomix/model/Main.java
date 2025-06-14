package gelatomix.model;
import gelatomix.model.singleton.FiladePedidos;

public class Main {
    public static void main(String[] args) {
        //singleton
        FiladePedidos fila = FiladePedidos.getInstancia();

        //Pedidos
        Pedido p1 = new Pedido("Milshake de chocolate" );
        Pedido p2 = new Pedido ("Sorvete de Cookie");


        fila.adicionarPedido(p1);
        fila.adicionarPedido(p2);

        Pedido pedido = fila.proximoPedido();
        System.out.println("Proximo Pedido: " + pedido.getDescricao());
        System.out.println("Restam:  " + fila.tamanhoFila() + " na fila.");

        //state
        System.out.println(pedido.getEstado()); // Recebido
        pedido.proximoEstado();
        System.out.println(pedido.getEstado()); // Preparando
        pedido.proximoEstado();
        System.out.println(pedido.getEstado()); // Pronto
        pedido.proximoEstado();
        System.out.println(pedido.getEstado()); // Entregue
    }

}
