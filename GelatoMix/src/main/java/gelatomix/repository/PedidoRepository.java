package gelatomix.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import gelatomix.model.interfaces.Sorvetes;
import gelatomix.model.state.Pedido;

public class PedidoRepository {

    public void salvarPedido(Pedido pedido) {
        String sql = "INSERT INTO pedidos (descricao, preco) VALUES (?, ?)";

        try (Connection conn = ConexaoBD.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            Sorvetes sorvete = pedido.getSorvete();

            stmt.setString(1, sorvete.getDescricao());
            stmt.setDouble(2, sorvete.getPreco());

            stmt.executeUpdate();
            System.out.println("✔ Pedido salvo no banco!");

        } catch (SQLException e) {
            System.out.println("Erro ao salvar pedido: " + e.getMessage());
        }
    }

    public List<Pedido> listarPedidos() {
        String sql = "SELECT * FROM pedidos ORDER BY data_criacao DESC";
        List<Pedido> historico = new ArrayList<>();

        try (Connection conn = ConexaoBD.conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String descricao = rs.getString("descricao");
                double preco = rs.getDouble("preco");
                String data = rs.getTimestamp("data_criacao").toString();

                Pedido pedido = new Pedido(descricao, preco, data);
                historico.add(pedido);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar pedidos: " + e.getMessage());
        }
        
        return historico;
    }

    //Esse metódo é só para teste gentee
    public void limparPedidos() {
        String sql = "DELETE FROM pedidos";
        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.executeUpdate();
            System.out.println("✔ Tabela de pedidos limpa.");
        } catch (SQLException e) {
            System.out.println("Erro ao limpar pedidos: " + e.getMessage());
        }
    }
    
}
