package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;
import view.FormCadastroView;

public class FormCadastroController {
    
    private FormCadastroView view;

    public FormCadastroController(FormCadastroView view) {
        this.view = view;
    }    
    
    
    public void salvaUsuario(){
        
        String usuario = view.getjTextFieldusuario().getText();
        String senha = view.getjPasswordFieldsenha().getText();
        
        Usuario novoUsuario = new Usuario(usuario, senha);
        
        try {
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
            usuarioDao.insert(novoUsuario);
            
            JOptionPane.showMessageDialog(null, "Funcionário salvo com sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(FormCadastroView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
