/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ucr.ac.cr.view;

import java.awt.event.ActionListener;

/**
 *
 * @author Jeikol
 */
public class LoginGUI extends javax.swing.JFrame {

    
    public LoginGUI() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

     public void addJoinButtonListener(ActionListener listener) {
        btnJoin.addActionListener(listener);
    }
    public String getUsername() {
        return txtUser.getText();
    }

    public String getPassword() {
        return new String(jpPassword.getPassword());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlUser = new javax.swing.JLabel();
        jlPassword = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jpPassword = new javax.swing.JPasswordField();
        btnJoin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel1.setText("Welcome to Hungry Hippie Tacos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jlUser.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        jlUser.setText("User:");
        getContentPane().add(jlUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jlPassword.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        jlPassword.setText("Password:");
        getContentPane().add(jlPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 171, -1));
        getContentPane().add(jpPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 171, -1));

        btnJoin.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        btnJoin.setText("Join");
        getContentPane().add(btnJoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 30, 20));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 70, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJoin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JLabel jlUser;
    private javax.swing.JPasswordField jpPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
