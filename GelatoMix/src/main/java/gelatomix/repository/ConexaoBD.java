package gelatomix.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    private static final String URL = "jdbc:postgresql://ep-old-darkness-a42ql6p7-pooler.us-east-1.aws.neon.tech/neondb?user=neondb_owner&password=npg_2VJp3lgHiZEz&sslmode=require";
    private static final String USUARIO = "neondb_owner";
    private static final String SENHA = "npg_2VJp3lgHiZEz";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
    
}
