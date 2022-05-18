package loja.Infrastructure.DB;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class BDContext {
     public Statement st;
    public ResultSet rs;

    private static final String CAMINHO = "jdbc:mysql://localhost:3306/lojabrinquedo?useTimezone=true&serverTimezone=UTC&useSSL=false";
    private static final String USER = "root";
    private static final String SENHA = "";

    public static java.sql.Connection obterConexao()
            throws ClassNotFoundException, SQLException, ClassNotFoundException, SQLException  {
        // 1) Declarar o driver JDBC de acordo com o Banco de dados usado
        Class.forName("com.mysql.jdbc.Driver");
        // 2) Abrir a conexão
        java.sql.Connection conn = DriverManager.getConnection(CAMINHO, USER, SENHA);
        
        return conn;
    }
}
