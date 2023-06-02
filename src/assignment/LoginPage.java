package assignment;

import javax.swing.*;

public class LoginPage extends javax.swing.JFrame {
    
    public LoginPage() {
        initComponents();
        this.setSize(470, 380);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnResetPass = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Login Page");
        setResizable(false);
        setSize(new java.awt.Dimension(457, 450));
        getContentPane().setLayout(null);

        lblLogin.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblLogin.setText("Login Page");
        getContentPane().add(lblLogin);
        lblLogin.setBounds(134, 42, 180, 48);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Password: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 169, 90, 30);

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(240, 280, 72, 27);

        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(130, 280, 72, 27);

        lblUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUsername.setText("Username: ");
        getContentPane().add(lblUsername);
        lblUsername.setBounds(80, 129, 100, 30);

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsername.setNextFocusableComponent(txtPassword);
        getContentPane().add(txtUsername);
        txtUsername.setBounds(200, 129, 147, 31);

        btnResetPass.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnResetPass.setText("Reset Password");
        btnResetPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPassActionPerformed(evt);
            }
        });
        getContentPane().add(btnResetPass);
        btnResetPass.setBounds(200, 210, 110, 21);

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtPassword);
        txtPassword.setBounds(200, 169, 147, 31);

        btnLogin1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnLogin1.setText("Register as a new student");
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin1);
        btnLogin1.setBounds(200, 237, 160, 21);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int confirmation = JOptionPane.showConfirmDialog(this,"Exit the program?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(confirmation == JOptionPane.YES_OPTION){
           JOptionPane.showMessageDialog(this, "You will be exit soon.\nThank you for using the program. ");
           System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        User u = new User(txtUsername.getText(), String.valueOf(txtPassword.getPassword()));
        if(u.Login()){
            u.writeLoginRecord();
            txtUsername.setText("");
            txtPassword.setText("");
            if("Student".equals(u.getRole())){
            JOptionPane.showMessageDialog(this, "Hi student");
            }else if("Admin".equals(u.getRole())){
                AdminPage adminpage = new AdminPage(u.getUsername());
                adminpage.setVisible(true);
            }
        }else
            JOptionPane.showMessageDialog(this, "Invalid username/password.\nPlease enter again.","Alert" ,JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnResetPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPassActionPerformed
        PasswordRecoverPage prpage = new PasswordRecoverPage();
        prpage.setVisible(true);
    }//GEN-LAST:event_btnResetPassActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogin1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JButton btnResetPass;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
