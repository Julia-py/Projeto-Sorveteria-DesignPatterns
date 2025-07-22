package gelatomix.model.observer;

import java.util.ArrayList;
import java.util.List;

public class PedidoObserver {
    private List<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public void notificarClientes(String status) {
        for (Cliente cliente : clientes) {
            cliente.atualizar(status);
        }
    }
}
