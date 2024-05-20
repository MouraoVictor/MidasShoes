/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.Conexao;
import dao.TenisDAO;
import dao.UsuarioDAO;
import dao.FeedBackDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.FeedBack;
import model.Tenis;
import model.Usuario;

/**
 *
 * @author tinho
 */
public class MenuView extends javax.swing.JFrame {

    /**
     * Creates new form MenuView
     */
    public MenuView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BttnVerTodosUsuarios = new javax.swing.JButton();
        BttnVerFeedBacks = new javax.swing.JButton();
        BttnCadastrarTenis = new javax.swing.JButton();
        BttnVerTodosTenis = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JTenisMenu = new javax.swing.JMenu();
        MenuCadastrarTenis = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        JClientesMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu do Funcion�rio");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BttnVerTodosUsuarios.setBackground(new java.awt.Color(229, 229, 229));
        BttnVerTodosUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BttnVerTodosUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/logoSmall.png"))); // NOI18N
        BttnVerTodosUsuarios.setText("Ver todos os Usu�rios");
        BttnVerTodosUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BttnVerTodosUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnVerTodosUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(BttnVerTodosUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 112, 190, 75));

        BttnVerFeedBacks.setBackground(new java.awt.Color(229, 229, 229));
        BttnVerFeedBacks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BttnVerFeedBacks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/logoSmall.png"))); // NOI18N
        BttnVerFeedBacks.setText("Ver FeedBacks");
        BttnVerFeedBacks.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BttnVerFeedBacks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnVerFeedBacksActionPerformed(evt);
            }
        });
        getContentPane().add(BttnVerFeedBacks, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 112, 190, 75));

        BttnCadastrarTenis.setBackground(new java.awt.Color(229, 229, 229));
        BttnCadastrarTenis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BttnCadastrarTenis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/logoSmall.png"))); // NOI18N
        BttnCadastrarTenis.setText("Cadastrar T�nis");
        BttnCadastrarTenis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BttnCadastrarTenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnCadastrarTenisActionPerformed(evt);
            }
        });
        getContentPane().add(BttnCadastrarTenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 19, 190, 75));

        BttnVerTodosTenis.setBackground(new java.awt.Color(229, 229, 229));
        BttnVerTodosTenis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BttnVerTodosTenis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/logoSmall.png"))); // NOI18N
        BttnVerTodosTenis.setText("Ver todos os T�nis");
        BttnVerTodosTenis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BttnVerTodosTenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnVerTodosTenisActionPerformed(evt);
            }
        });
        getContentPane().add(BttnVerTodosTenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 19, 190, 75));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/imgBranco.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -40, -1, -1));

        JTenisMenu.setText("T�nis");

        MenuCadastrarTenis.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuCadastrarTenis.setText("Cadastrar novo T�nis");
        MenuCadastrarTenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrarTenisActionPerformed(evt);
            }
        });
        JTenisMenu.add(MenuCadastrarTenis);

        jMenuItem4.setText("Ver os T�nis");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        JTenisMenu.add(jMenuItem4);

        jMenuBar1.add(JTenisMenu);

        JClientesMenu.setText("Op��es");

        jMenuItem1.setText("Ver todos os usu�rios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        JClientesMenu.add(jMenuItem1);

        jMenuItem2.setText("Ver os FeedBacks");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        JClientesMenu.add(jMenuItem2);

        jMenuBar1.add(JClientesMenu);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(450, 263));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
            
            //teste select all
            ArrayList<Usuario> usuarios = usuarioDao.selectAll();
            for (Usuario usuario : usuarios) {
                System.out.println(usuario.getUsuario() + " ");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MenuCadastrarTenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarTenisActionPerformed
        CadastrarTenis telaTenis = new CadastrarTenis();
        telaTenis.setVisible(true);
    }//GEN-LAST:event_MenuCadastrarTenisActionPerformed

    private void BttnVerTodosTenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnVerTodosTenisActionPerformed
        try {
            Connection conexao = new Conexao().getConnection();
            TenisDAO tenisDao = new TenisDAO(conexao);
            
            //teste select all
            ArrayList<Tenis> tenis = tenisDao.selectAll();
            System.out.println("Lista de Tênis cadastrados:");
            for (Tenis teni : tenis) {
                System.out.println(teni.getTenis()+" ");
            }
            System.out.println();
            
        } catch (SQLException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BttnVerTodosTenisActionPerformed

    private void BttnCadastrarTenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnCadastrarTenisActionPerformed
        CadastrarTenis telaTenis = new CadastrarTenis();
        telaTenis.setVisible(true);
    }//GEN-LAST:event_BttnCadastrarTenisActionPerformed

    private void BttnVerTodosUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnVerTodosUsuariosActionPerformed
        try {
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
            
            //teste select all
            ArrayList<Usuario> usuario = usuarioDao.selectAll();
            System.out.println("Lista de Usuários:");
            for (Usuario usuario1 : usuario) {
                System.out.println(usuario1.getUsuario()+" ");
            }
            System.out.println();
            
        } catch (SQLException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BttnVerTodosUsuariosActionPerformed

    private void BttnVerFeedBacksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnVerFeedBacksActionPerformed
        try {
            Connection conexao = new Conexao().getConnection();
            FeedBackDAO feedBackDao = new FeedBackDAO(conexao);
            
            //teste select all
            ArrayList<FeedBack> feedBack = feedBackDao.selectAll();
            System.out.println("Lista de FeedBacks:");
            for (FeedBack feedback : feedBack) {
                System.out.println("Id do pedido: " + feedback.getId_pedido() + " CPF do Cliente: " + 
                    feedback.getCpf() + " FeedBack: " + feedback.getFeedback() + "   ");
            }
            System.out.println();
            
        } catch (SQLException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BttnVerFeedBacksActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            Connection conexao = new Conexao().getConnection();
            FeedBackDAO feedBackDao = new FeedBackDAO(conexao);
            
            //teste select all
            ArrayList<FeedBack> feedBack = feedBackDao.selectAll();
            System.out.println("Lista de FeedBacks:");
            for (FeedBack feedback : feedBack) {
                System.out.println("Id do pedido: " + feedback.getId_pedido() + " CPF do Cliente: " + 
                    feedback.getCpf() + " FeedBack: " + feedback.getFeedback() + "   ");
            }
            System.out.println();
            
        } catch (SQLException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            Connection conexao = new Conexao().getConnection();
            TenisDAO tenisDao = new TenisDAO(conexao);
            
            //teste select all
            ArrayList<Tenis> tenis = tenisDao.selectAll();
            System.out.println("Lista de Tênis cadastrados:");
            for (Tenis teni : tenis) {
                System.out.println(teni.getTenis()+" ");
            }
            System.out.println();
            
        } catch (SQLException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttnCadastrarTenis;
    private javax.swing.JButton BttnVerFeedBacks;
    private javax.swing.JButton BttnVerTodosTenis;
    private javax.swing.JButton BttnVerTodosUsuarios;
    private javax.swing.JMenu JClientesMenu;
    private javax.swing.JMenu JTenisMenu;
    private javax.swing.JMenuItem MenuCadastrarTenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}