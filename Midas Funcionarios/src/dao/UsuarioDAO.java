package dao;
//já está certo como funcionario

import java.sql.*;
import java.util.ArrayList;
import model.Usuario;

public class UsuarioDAO {
    
    //a classe responsavel por manipular o usuario
    
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Usuario usuario) throws SQLException{
        
            String sql = "INSERT INTO funcionario (funcionario, senha) VALUES (?,?);";    
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, usuario.getUsuario());
            statement.setString(2, usuario.getSenha());
            
            statement.execute();
            
    }
    
    public void update(Usuario usuario) throws SQLException{
        String sql = "UPDATE funcionario SET funcionario= ?, set senha = ? WHERE id = ?;";    
        PreparedStatement statement = connection.prepareStatement(sql);
            
        statement.setString(1, usuario.getUsuario());
        statement.setString(2, usuario.getSenha());
        statement.setInt(3, usuario.getId());
            
        statement.execute();    
        
    }
    
    //metodo para inserir ou atualizar um usuario
    public void insertOrUpdate(Usuario usuario) throws SQLException{
        if (usuario.getId() > 0) {
            update(usuario);
        }else{
            insert(usuario);
        }
    }
    
    public void delete(Usuario usuario) throws SQLException{
        String sql = "DELETE FROM funcionario WHERE id = ?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setInt(1, usuario.getId());
        statement.execute();
        
    }
    
    public ArrayList<Usuario> selectAll() throws SQLException{
        String sql = "SELECT * FROM usuario;";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        return pesquisa(statement);
        
    }

    private ArrayList<Usuario> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        
        //enquanto tiver proximas linhas
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String usuario = resultSet.getString("usuario");
            String senha = resultSet.getString("senha");
            
            Usuario usuarioComDadosDoBanco = new Usuario(id, usuario, senha);
            usuarios.add(usuarioComDadosDoBanco);
        }
        
        return usuarios;
    }
    
    public Usuario selectPorId(Usuario usuario) throws SQLException{
        String sql = "SELECT * FROM funcionario WHERE id = ?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, usuario.getId());
        
        return pesquisa(statement).get(0);
    }
    
    // Autenticando (conferindo se já existe o usuario e a senha no banco)
    public boolean existeNoBancoPorUsuarioESenha(Usuario usuario) throws SQLException {
        
        // são usados os ?? por questões de segurança
        String sql = "SELECT * FROM funcionario WHERE funcionario = ? AND senha = ?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        //passando os parametros que serão escritos nas ??
        statement.setString(1, usuario.getUsuario());
        statement.setString(2, usuario.getSenha());
        
        statement.execute();
        
        //pegar o resultado que vem do banco
        ResultSet resultSet = statement.getResultSet();
        
        //varrendo e conferindo se já existe um usuario e senha iguais
        //é a mesma coisa de usar um if para o resultSet e conferir se retorna true ou false
        return resultSet.next();
    }

    
}
