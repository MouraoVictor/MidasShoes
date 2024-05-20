package dao;
//já está certo como funcionario
import java.sql.*;

public class Conexao {
    public Connection getConnection() throws SQLException{
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/midasshoesbd", "postgres", "dbadmin");
        return conexao;
    }
}
