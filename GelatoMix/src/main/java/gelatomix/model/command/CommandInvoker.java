package gelatomix.model.command;

import gelatomix.model.interfaces.PedidoCommand;

import java.util.Stack;

public class CommandInvoker {
    private Stack<PedidoCommand> historico = new Stack<>();

    public void executarComando(PedidoCommand comando) {
        comando.executar();
        historico.push(comando);
    }

    public void desfazerUltimoComando() {
        if (!historico.isEmpty()) {
            PedidoCommand ultimoComando = historico.pop();
            ultimoComando.desfazer();
        } else {
            System.out.println("Nenhum comando para desfazer.");
        }
    }

    public boolean temHistorico() {
        return !historico.isEmpty();
    }
}
