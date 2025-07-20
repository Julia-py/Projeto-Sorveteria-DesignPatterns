package gelatomix.model.observer;

import gelatomix.model.interfaces.ObservadorPedido;

public class Cliente{
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
    public void notificar(String status) {
        System.out.println("Cliente " + nome + " notificado: " + status);
    }
}
