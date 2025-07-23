package gelatomix.model.observer;

public class Cliente{
    private String nome;

    //adicionar lista de pedidos feitos pelo cliente
    public Cliente(String nome) {
        this.nome = nome;
    }

    public void atualizar(String status) {
        System.out.println("Cliente " + nome + " notificado: " + status);
    }
}
