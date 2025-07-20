package gelatomix.model.command;

import java.util.Stack;

public class GerenciadorDePedidos {
    private Stack<PedidoCommand> historico = new Stack<>();

    public void executarComando(PedidoCommand comando) {
        comando.executar();
        historico.push(comando);
    }

    public void desfazerUltimo() {
        if (!historico.isEmpty()) {
            PedidoCommand comando = historico.pop();
            comando.desfazer();
        }
    }
}
