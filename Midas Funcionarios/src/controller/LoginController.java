package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.*;
import javax.swing.JOptionPane;
import model.Usuario;
import view.LoginView;
import view.MenuView;

/**
 *
 * @author tinho
 */
public class LoginController {
    private LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {
        
        //Buscar um usuario da View
        String usuario = view.getjTextFieldUsuario().getText();
        String senha = view.getjPasswordFieldSenha().getText();
        
        Usuario usuarioAutenticar = new Usuario(usuario, senha);
        
        //Verificar se existe no banco de dados
        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        
        boolean existe = usuarioDao.existeNoBancoPorUsuarioESenha(usuarioAutenticar);
        
        //Se existir, direciona para o menu
        if (existe) {
            MenuView telaDeMenu = new MenuView();
            telaDeMenu.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(view, "Usuário ou senha inválidos!");
        }
        
        
        
        
    }
    
    
    
}
