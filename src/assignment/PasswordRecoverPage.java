/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment;

import javax.swing.JOptionPane;

public class PasswordRecoverPage extends javax.swing.JFrame {

    String username = "a";
    
    public PasswordRecoverPage() {
        initComponents();
        lblConfirmPass.setVisible(false);
        txtConfirmPass.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReset = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        lblConfirmPass = new javax.swing.JLabel();
        txtConfirmPass = new javax.swing.JTextField();
        lblNewPass = new javax.swing.JLabel();
        txtNewPass = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Password Recovery Page");
        setMinimumSize(new java.awt.Dimension(430, 375));

        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReset.setText("Reset Password");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblLogin.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblLogin.setText("Password Recovery");

        lblConfirmPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblConfirmPass.setText("Confirm Password: ");

        txtConfirmPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblNewPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNewPass.setText("Email Address: ");

        txtNewPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnCancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNewPass)
                            .addComponent(lblConfirmPass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblLogin)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblLogin)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        if(lblConfirmPass.isVisible() == false){
            User user = new User(txtNewPass.getText(), 0);
            if(user.getUsername() != null){
                lblNewPass.setText("New Password: ");
                txtNewPass.setText("");
                lblConfirmPass.setVisible(true);
                txtConfirmPass.setVisible(true);
                username = user.getUsername();
            }else
                JOptionPane.showMessageDialog(this, "Invalid email address.\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
        }else{
            if(txtNewPass.getText().equals(txtConfirmPass.getText())){
                User user = new User();
                user.setUsername(username);
                user.setPassword(txtNewPass.getText());
                if(user.resetPassword())
                    JOptionPane.showMessageDialog(this, "Password Updated.");
                else
                    JOptionPane.showMessageDialog(this, "Update failed.\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
                this.dispose();
            }else
                JOptionPane.showMessageDialog(this, "Non-identical password.\nPlease enter again.","Alert" ,JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordRecoverPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel lblConfirmPass;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNewPass;
    private javax.swing.JTextField txtConfirmPass;
    private javax.swing.JTextField txtNewPass;
    // End of variables declaration//GEN-END:variables
}
