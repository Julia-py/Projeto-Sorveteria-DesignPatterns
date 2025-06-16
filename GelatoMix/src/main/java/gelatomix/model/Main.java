package gelatomix.model;
import gelatomix.model.decorator.*;
import gelatomix.model.factory.Millkshake;
import gelatomix.model.factory.Picole;
import gelatomix.model.factory.Sorvete;
import gelatomix.model.interfaces.Base;
import gelatomix.model.singleton.FiladePedidos;
import gelatomix.model.state.PedidoEntregue;
import gelatomix.model.state.PedidoPreparando;
import gelatomix.model.state.PedidoPronto;
import gelatomix.model.state.PedidoRecebido;

public class Main {
    public static void main(String[] args) {

        //singleton
        FiladePedidos fila = FiladePedidos.getInstancia();

        //decorator
        Base base1 = new Sorvete();
        base1 = new CaldaChocolate(base1);
        base1 = new LeiteNinho(base1);

        Base base2 = new Millkshake();
        base2 = new Brownie(base2);
        base2 = new Nutella(base2);
        base2 = new Morango(base2);

        Base base3 = new Picole();
        base3 = new CaldaCaramelo(base3);
        base3 = new Pipoca(base3);

        //Pedidos
        Pedido p1 = new Pedido(base1);
        Pedido p2 = new Pedido(base2);
        Pedido p3 = new Pedido(base3);


        fila.adicionarPedido(p1);
        fila.adicionarPedido(p2);
        fila.adicionarPedido(p3);

        System.out.println("\n--- Pedidos na fila ---");
        fila.listarPedidos();

        while (fila.tamanhoFila() > 0) {
            //Processamento o proximo pedido
            Pedido pedido = fila.proximoPedido();
            if (pedido != null) {
                System.out.println("\nProximo Pedido: " + pedido.getDescricao());
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

            System.out.println("\n--- Pedidos restantes na fila ---");
            fila.listarPedidos();
        }
         System.out.println("\nTodos os pedidos foram processados. Fila vazia!");
    }
}
