package gelatomix.controller;

import java.sql.SQLException;

import gelatomix.model.Pedido;
import gelatomix.model.facade.GelatomixFacade;
import gelatomix.model.factory.FactoryMilkshakeChocolate;
import gelatomix.model.factory.FactoryPicoleChocolate;
import gelatomix.repository.ConexaoBD;

public class Main {
    public static void main(String[] args) {

        GelatomixFacade facade = new GelatomixFacade();

        Pedido pedido1 = facade.fazerPedido(new FactoryMilkshakeChocolate());
        facade.statusPedido(pedido1);
        facade.statusPedido(pedido1);
        facade.statusPedido(pedido1);

        Pedido pedido2 = facade.fazerPedido(new FactoryPicoleChocolate());
        facade.statusPedido(pedido2);

        facade.mostrarHistorico();

        //Testando conexão com o banco
        try {
            var conn = ConexaoBD.conectar();
            System.out.println("Conexão realizada com sucesso!");
            conn.close();
        } catch(SQLException e) {
            System.out.println("Erro na conexão: " + e.getMessage());
        }
    }
}
