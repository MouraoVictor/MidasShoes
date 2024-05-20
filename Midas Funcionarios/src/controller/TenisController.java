package controller;

import dao.Conexao;
import dao.TenisDAO;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*;
import javax.swing.JOptionPane;
import model.Tenis;
import view.CadastrarTenis;

/**
 *
 * @author tinho
 */
public class TenisController {

    private final CadastrarTenis view;

    public TenisController(CadastrarTenis view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {

        //Buscar um usuario da View
        String tenis = view.getjTextFieldNovoTenis().getText();

        Tenis tenisAutenticar = new Tenis(tenis);

        //Verificar se existe no banco de dados
        Connection conexao = new Conexao().getConnection();
        TenisDAO tenisDao = new TenisDAO(conexao);

        boolean existe = tenisDao.existeNoBancoPorUsuarioESenha(tenisAutenticar);

        //Se existir, direciona para o menu
        if (existe) {
            CadastrarTenis telaDeMenu = new CadastrarTenis();
            telaDeMenu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(view, "Usuário ou senha inválidos!");
        }

    }

    public void salvaTenis(){
        String tenis = view.getjTextFieldNovoTenis().getText();
        
        Tenis novotenis = new Tenis(tenis);
        
        try {
            Connection conn = new Conexao().getConnection();
            TenisDAO dao = new TenisDAO(conn);
            
            dao.insert(novotenis);
            
        } catch (Exception e) {
        }
        //não funcionando

    }
    
}
