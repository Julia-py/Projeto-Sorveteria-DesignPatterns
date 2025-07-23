package gelatomix.model.command;

import gelatomix.model.interfaces.PedidoCommand;

import java.util.Stack;

public class CommandInvoker {
    private static Stack<PedidoCommand> historico = new Stack<>();

    public static void executarComando(PedidoCommand comando) {
        comando.executar();
        historico.push(comando);
    }

    public static void desfazerUltimoComando() {
        if (!historico.isEmpty()) {
            PedidoCommand ultimoComando = historico.pop();
            ultimoComando.desfazer();
        } else {
            System.out.println("Nenhum comando para desfazer.");
        }
    }

    public static boolean temHistorico() {
        return !historico.isEmpty();
    }
}
