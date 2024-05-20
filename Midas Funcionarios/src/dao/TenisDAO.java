package dao;
//já está certo como tenis

import java.sql.*;
import java.util.ArrayList;
import model.Tenis;

public class TenisDAO {
    
    //a classe responsavel por manipular o tenis
    
    private final Connection connection;

    public TenisDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Tenis tenis) throws SQLException{
        
            String sql = "INSERT INTO tenis (tenis) VALUES (?);";    
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, tenis.getTenis());
            
            statement.executeUpdate();
            System.out.println("susssss");
            
    }
    
    public void update(Tenis tenis) throws SQLException{
        String sql = "UPDATE tenis SET tenis= ? WHERE id = ?;";    
        PreparedStatement statement = connection.prepareStatement(sql);
            
        statement.setString(1, tenis.getTenis());
        statement.setInt(2, tenis.getId());
            
        statement.execute();    
        
    }
    
    //metodo para inserir ou atualizar um tenis
    public void insertOrUpdate(Tenis tenis) throws SQLException{
        if (tenis.getId() > 0) {
            update(tenis);
        }else{
            insert(tenis);
        }
    }
    
    public void delete(Tenis tenis) throws SQLException{
        String sql = "DELETE FROM tenis WHERE id = ?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setInt(1, tenis.getId());
        statement.execute();
        
    }
    
    public ArrayList<Tenis> selectAll() throws SQLException{
        String sql = "SELECT * FROM tenis;";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        return pesquisa(statement);
        
    }

    private ArrayList<Tenis> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Tenis> teniss = new ArrayList<Tenis>();
        
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        
        //enquanto tiver proximas linhas
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String tenis = resultSet.getString("tenis");
            
            Tenis tenisComDadosDoBanco = new Tenis(id, tenis);
            teniss.add(tenisComDadosDoBanco);
        }
        
        return teniss;
    }
    
    public Tenis selectPorId(Tenis tenis) throws SQLException{
        String sql = "SELECT * FROM tenis WHERE id = ?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, tenis.getId());
        
        return pesquisa(statement).get(0);
    }
    
    // Autenticando (conferindo se já existe o usuario e a senha no banco)
    public boolean existeNoBancoPorUsuarioESenha(Tenis tenis) throws SQLException {
        
        // são usados os ?? por questões de segurança
        String sql = "SELECT * FROM tenis WHERE tenis = ?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        //passando os parametros que serão escritos nas ??
        statement.setString(1, tenis.getTenis());
        
        statement.execute();
        
        //pegar o resultado que vem do banco
        ResultSet resultSet = statement.getResultSet();
        
        //varrendo e conferindo se já existe um usuario e senha iguais
        //é a mesma coisa de usar um if para o resultSet e conferir se retorna true ou false
        return resultSet.next();
    }

    
}
