package gelatomix.model;

import gelatomix.model.decorator.Brownie;
import gelatomix.model.decorator.LeiteNinho;
import gelatomix.model.factory.sorvetes.MassaChocolate;
import gelatomix.model.factory.sorvetes.MilkshakeChocolate;
import gelatomix.model.interfaces.Sorvetes;
import gelatomix.model.singleton.FiladePedidos;

public class Main {
    public static void main(String[] args) {

        //singleton
        FiladePedidos fila = FiladePedidos.getInstancia();

        //decorator
        Sorvetes milkshake = new MilkshakeChocolate();
        milkshake = new LeiteNinho(milkshake);


        Sorvetes casquinhaChocolate = new MassaChocolate();
        casquinhaChocolate = new Brownie(casquinhaChocolate);



        //Pedidos
        Pedido p1 = new Pedido(milkshake);
        Pedido p2 = new Pedido(casquinhaChocolate);
        //Pedido p3 = new Pedido(base3);


        fila.adicionarPedido(p1);
        fila.adicionarPedido(p2);
        //fila.adicionarPedido(p3);

        System.out.println("\n--- Pedidos na fila ---");
        fila.listarPedidos();

        while (fila.tamanhoFila() > 0) {
            //Processamento o proximo pedido
            Pedido pedido = fila.proximoPedido();
            if (pedido != null) {
                System.out.println("\nProximo Pedido: " + pedido.getDescricao());
                System.out.println("Restam:  " + fila.tamanhoFila() + " na fila.");

                //state
                System.out.println(pedido.getEstado()); //Recebido
                pedido.proximoEstado();
                System.out.println(pedido.getEstado()); //Preparando
                pedido.proximoEstado();
                System.out.println(pedido.getEstado()); //Pronto
                pedido.proximoEstado();
                System.out.println(pedido.getEstado()); //Entregue
            }

            System.out.println("\n--- Pedidos restantes na fila ---");
            fila.listarPedidos();
        }
         System.out.println("\nTodos os pedidos foram processados. Fila vazia!");
        
    }
}
