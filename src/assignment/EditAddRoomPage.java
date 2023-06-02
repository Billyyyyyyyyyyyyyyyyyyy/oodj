package assignment;

import javax.swing.JOptionPane;

public class EditAddRoomPage extends javax.swing.JFrame {

    String RoomNumber = "";
    
    public EditAddRoomPage(String roomNumber){
        initComponents();
        this.setTitle("Edit Room Info Page");
        RoomNumber = roomNumber;
        RoomInfo editRoom = new RoomInfo(roomNumber);
        txtRoomNumber.setText(editRoom.getRoomNumber());
        cbxRoomType.setSelectedItem(editRoom.getRoomType());
        btnAddRoom.setText("Edit Room");
    }
    
    public EditAddRoomPage() {
        initComponents();
        this.setTitle("Add New Room Page");
        txtRoomNumber.setText(""); 
        cbxRoomType.setSelectedIndex(-1); 
        btnAddRoom.setText("Add Room");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRoomType = new javax.swing.JLabel();
        txtRoomNumber = new javax.swing.JTextField();
        lblRoomNumber = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReminder = new javax.swing.JTextArea();
        btnCancel2 = new javax.swing.JButton();
        btnAddRoom = new javax.swing.JButton();
        cbxRoomType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Edit");

        lblRoomType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRoomType.setText("Room Type:");

        txtRoomNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblRoomNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRoomNumber.setText("Room Number:");

        txtReminder.setEditable(false);
        txtReminder.setColumns(20);
        txtReminder.setRows(3);
        txtReminder.setTabSize(9);
        txtReminder.setText("Reminder  \nClick the 'Edit Student Info' button \nin the \"Hostel Room Info\" page\nto edit booking student ");
        jScrollPane1.setViewportView(txtReminder);

        btnCancel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancel2.setText("Cancel");
        btnCancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel2ActionPerformed(evt);
            }
        });

        btnAddRoom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddRoom.setText("Add Room");
        btnAddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRoomActionPerformed(evt);
            }
        });

        cbxRoomType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxRoomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Room", "Double Room", "Triple Room", "Quad Room" }));
        cbxRoomType.setSelectedIndex(-1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRoomType)
                            .addComponent(lblRoomNumber))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRoomNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(cbxRoomType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddRoom)
                                .addGap(62, 62, 62)
                                .addComponent(btnCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGap(75, 75, 75))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoomNumber)
                    .addComponent(txtRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoomType)
                    .addComponent(cbxRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddRoom)
                    .addComponent(btnCancel2))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancel2ActionPerformed

    private void btnAddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRoomActionPerformed
        RoomInfo room = new RoomInfo();
        if((!room.accessRoomNumber().contains(txtRoomNumber.getText()) || txtRoomNumber.getText().equals(RoomNumber)) && !txtRoomNumber.getText().equals("") && cbxRoomType.getSelectedIndex() != -1){
            if(this.getTitle().equals("Add New Room Page")){
                RoomInfo newroom = new RoomInfo(txtRoomNumber.getText(), cbxRoomType.getSelectedItem().toString());
                newroom.setSpaceAvailable(newroom.getSpaceAvailable((String)cbxRoomType.getSelectedItem()));
                if(newroom.addNewRoom()){
                    JOptionPane.showMessageDialog(this, "New room information added.");
                    this.dispose();
                }else
                JOptionPane.showMessageDialog(this, "Failed writing to file.\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
            }else{
                RoomInfo edit = new RoomInfo(RoomNumber);
                StudentApplication editapplication = new StudentApplication();
                edit.setRoomNumber(txtRoomNumber.getText());
                if(cbxRoomType.getSelectedItem().equals(edit.getRoomType())){
                    if(edit.editRoom(RoomNumber) && editapplication.editRoomNumber(RoomNumber, txtRoomNumber.getText())){
                        JOptionPane.showMessageDialog(this, "Room information updated.");
                        this.dispose();
                    }else
                    JOptionPane.showMessageDialog(this, "Update failed.\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
                }else{
                    edit.setRoomType(cbxRoomType.getSelectedItem().toString());
                    int confirmation = JOptionPane.showConfirmDialog(this,
                            "Changing the room type will result in deleting \nall current booking student.\nAre you sure you want to continue?", 
                            "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(confirmation == JOptionPane.YES_OPTION){
                        edit.setSpaceAvailable(edit.getSpaceAvailable(cbxRoomType.getSelectedItem().toString()));
                        if(edit.editRoomPlus(RoomNumber) && editapplication.editRoomNumber(RoomNumber, txtRoomNumber.getText())){
                            JOptionPane.showMessageDialog(this, "Room information updated.");
                            this.dispose();
                        }else
                            JOptionPane.showMessageDialog(this, "Update failed.\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        }else if (txtRoomNumber.getText().equals("") || cbxRoomType.getSelectedIndex() == -1)
            JOptionPane.showMessageDialog(this, "Insufficeint information.\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
        else
            JOptionPane.showMessageDialog(this, "Room Number used.\nPlease enter another one.","Alert" ,JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnAddRoomActionPerformed

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
            java.util.logging.Logger.getLogger(EditAddRoomPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditAddRoomPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditAddRoomPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditAddRoomPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditAddRoomPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRoom;
    private javax.swing.JButton btnCancel2;
    private javax.swing.JComboBox<String> cbxRoomType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRoomNumber;
    private javax.swing.JLabel lblRoomType;
    private javax.swing.JTextArea txtReminder;
    private javax.swing.JTextField txtRoomNumber;
    // End of variables declaration//GEN-END:variables
}
