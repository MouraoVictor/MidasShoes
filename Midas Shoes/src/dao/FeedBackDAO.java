package dao;

import java.sql.*;
import java.util.ArrayList;
import model.FeedBack;

public class FeedBackDAO {
    private final Connection connection;

    public FeedBackDAO(Connection connection) {
        this.connection = connection;
    }
    
    public ArrayList<FeedBack> selectAll() throws SQLException{
        String sql = "SELECT * FROM feedback;";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        return pesquisa(statement);
    }
    private ArrayList<FeedBack> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<FeedBack> feedBacks = new ArrayList<FeedBack>();
        
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        
        //enquanto tiver proximas linhas
        while (resultSet.next()) {
            String id_pedido = resultSet.getString("id_pedido");
            String feedBack = resultSet.getString("feedback");
            String cpf = resultSet.getString("cpf");
            
            FeedBack feedBackComDadosDoBanco = new FeedBack(id_pedido, cpf, feedBack);
            feedBacks.add(feedBackComDadosDoBanco);
        }
        
        return feedBacks;
    }
}
