package br.com.empresa.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Juliano Ramos
 */
public class ConectionFactory {
    private static final String CONEXAO = "jdbc:mysql://127.0.0.1:3306/";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE = "bde";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "admservice";
    
    public static void main(String Args[]) throws ClassNotFoundException, SQLException{
        ConectionFactory.conectar();
    }
    
    public static Connection conectar() throws ClassNotFoundException, SQLException{
        try{
           Class.forName(DRIVER);
           Connection conexao = DriverManager.getConnection(CONEXAO + DATABASE, USUARIO, PASSWORD);
           System.out.println("Conexao bem sucedida.");
           return conexao;
        }
        catch(SQLException i)
        {throw new SQLException("Falha na conexao com o banco de dados" + i.getMessage());}
    }
    
    public static void desconectar(Connection conn) throws SQLException{
        if(conn != null){
            conn.close();
        }
    }
    
    public static void desconectar(Connection conn, PreparedStatement ps) throws SQLException{
        if(conn != null){
            conn.close();
            ps.close();
        }
    }
    
    public static void desconectar(Connection conn, PreparedStatement ps, ResultSet rs) throws SQLException{
        if(conn != null){
            conn.close();
            ps.close();
            rs.close();
        }
    }
}
