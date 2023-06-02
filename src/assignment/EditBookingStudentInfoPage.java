package assignment;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EditBookingStudentInfoPage extends javax.swing.JFrame {
    
    String thisroomNumber;
    ArrayList<String> currentStudent = new ArrayList<String>();
    ArrayList<String> bookingDate = new ArrayList<String>();
    ArrayList<String> duration = new ArrayList<String>();

    public EditBookingStudentInfoPage(String roomNumber) {
        initComponents();
        this.thisroomNumber = roomNumber;
        setCurrentStudentCBX(thisroomNumber);
        setNewStudentCBX();
    }
    
    public EditBookingStudentInfoPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxCurrentStudent = new javax.swing.JComboBox<>();
        lblNewStudent = new javax.swing.JLabel();
        lblBookingDate = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtBookingDate = new javax.swing.JTextField();
        lblDuration = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        lblCurrentStudent = new javax.swing.JLabel();
        cbxNewStudent = new javax.swing.JComboBox<>();
        lblNewBookingDate = new javax.swing.JLabel();
        txtNewBookingDate = new javax.swing.JTextField();
        btnCancel2 = new javax.swing.JButton();
        lblNewDuration = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        txtNewDuration = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        lblSpaceAvailable = new javax.swing.JLabel();
        txtSpaceAvailable = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Edit Booking Student Information Page");

        cbxCurrentStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxCurrentStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCurrentStudentActionPerformed(evt);
            }
        });

        lblNewStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNewStudent.setText("New Student:");

        lblBookingDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBookingDate.setText("Booking Date:");

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtBookingDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblDuration.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDuration.setText("Duration(month):");

        txtDuration.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblCurrentStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCurrentStudent.setText("Current Student:");

        cbxNewStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblNewBookingDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNewBookingDate.setText("Booking Date:");

        txtNewBookingDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnCancel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancel2.setText("Cancel");
        btnCancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel2ActionPerformed(evt);
            }
        });

        lblNewDuration.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNewDuration.setText("Duration(month):");

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtNewDuration.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        lblSpaceAvailable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSpaceAvailable.setText("Space Available:");

        txtSpaceAvailable.setEditable(false);
        txtSpaceAvailable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd)
                        .addGap(160, 160, 160))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCurrentStudent)
                            .addComponent(lblBookingDate)
                            .addComponent(lblDuration))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxCurrentStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNewDuration)
                            .addComponent(lblNewStudent)
                            .addComponent(lblNewBookingDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNewDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNewBookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(btnCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(lblSpaceAvailable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSpaceAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpaceAvailable)
                    .addComponent(txtSpaceAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNewStudent)
                            .addComponent(cbxNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNewBookingDate)
                            .addComponent(txtNewBookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNewDuration)
                            .addComponent(txtNewDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxCurrentStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCurrentStudent))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBookingDate))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDuration))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnEdit))
                .addGap(18, 18, 18)
                .addComponent(btnCancel2)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        RoomInfo edit = new RoomInfo(thisroomNumber);
        if(cbxNewStudent.getSelectedIndex() == -1 || cbxNewStudent.getSelectedIndex() == 0)
            JOptionPane.showMessageDialog(this, "Please choose a student to add.","Alert" ,JOptionPane.WARNING_MESSAGE);
        else if(txtNewBookingDate.getText().equals("") || txtNewDuration.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Insufficient info(date/duration).\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
        else if(!(Integer.parseInt(txtNewDuration.getText()) > 0))
            JOptionPane.showMessageDialog(this, "Invalid duration.\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
        else{
            switch(verifyDate(txtNewBookingDate.getText())){
                case 0:
                    StudentApplication application = new StudentApplication();
                    ArrayList<String> allOngoingRoomNumber = application.accessAllOngoingRoomNumber();
                    int exist = 0;
                    boolean proceed;
                    for(String roomNumber : allOngoingRoomNumber){
                        if(roomNumber.equals(thisroomNumber))
                            exist++;
                    }
                    if(Integer.parseInt(txtSpaceAvailable.getText()) == 1 && exist > 0){
                        int confirmation = JOptionPane.showConfirmDialog(this,"There are " + exist + " student(s) is applying for this room."
                                + "\nAdding this student will result in declining others\nas there is only 1 space left for this room."
                                + "\nAre you sure you want to continue?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if(confirmation == JOptionPane.YES_OPTION){
                            proceed = true;
                            application.changeApplicationStatusWithRN("Declined", thisroomNumber, "Declined by system(insufficeint space after adding)");
                        }
                        else
                            proceed = false;
                    }else
                        proceed = true;
                    if(proceed){
                        if(currentStudent.get(0).equals("-")){
                            currentStudent.set(0, cbxNewStudent.getSelectedItem().toString());
                            bookingDate.set(0, txtNewBookingDate.getText());
                            duration.set(0, txtNewDuration.getText());
                        }else{
                            currentStudent.add(cbxNewStudent.getSelectedItem().toString());
                            bookingDate.add(txtNewBookingDate.getText());
                            duration.add(txtNewDuration.getText());
                        }
                        edit.setBookingStudent(currentStudent);
                        edit.setBookingDate(bookingDate);
                        edit.setDuration(duration);
                        edit.setSpaceAvailable(Integer.parseInt(txtSpaceAvailable.getText())-1);
                        if(edit.editRoom(thisroomNumber)){
                            JOptionPane.showMessageDialog(this, "Room information updated.");
                            setCurrentStudentCBX(thisroomNumber);
                            setNewStudentCBX();
                        }
                        else
                            JOptionPane.showMessageDialog(this, "Update failed.\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 1:
                    JOptionPane.showMessageDialog(this, "Invalid date.\n(Date format: dd/mm/yyyy)\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(this, "Invalid date format.\n(Date format: dd/mm/yyyy)\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancel2ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int confirmation = JOptionPane.showConfirmDialog(this,"Are you sure you want to\ndelete the following student?", 
                "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(confirmation == JOptionPane.YES_OPTION){
            RoomInfo edit = new RoomInfo(thisroomNumber);
            if(currentStudent.size() == 1){
                currentStudent.set(0, "-");
                bookingDate.set(0, "-");
                duration.set(0, "-");
            }else{
                int index = currentStudent.indexOf(cbxCurrentStudent.getSelectedItem());
                currentStudent.remove(index);
                bookingDate.remove(index);
                duration.remove(index);
            }
            edit.setBookingStudent(currentStudent);
            edit.setBookingDate(bookingDate);
            edit.setDuration(duration);
            edit.setSpaceAvailable(Integer.parseInt(txtSpaceAvailable.getText())+1);
            if(edit.editRoom(thisroomNumber)){
                JOptionPane.showMessageDialog(this, "Room information updated.");
                setCurrentStudentCBX(thisroomNumber);
                setNewStudentCBX();
            }
            else
                JOptionPane.showMessageDialog(this, "Update failed.\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        RoomInfo edit = new RoomInfo(thisroomNumber);
        if(txtBookingDate.getText().equals("") || txtDuration.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Insufficient info(date/duration).\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
        else if(!(Integer.parseInt(txtDuration.getText()) > 0))
            JOptionPane.showMessageDialog(this, "Invalid duration.\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
        else {
            switch(verifyDate(txtBookingDate.getText())){
                case 0:
                    int index = currentStudent.indexOf(cbxCurrentStudent.getSelectedItem());
                    bookingDate.set(index, txtBookingDate.getText());
                    duration.set(index, txtDuration.getText());
                    edit.setBookingDate(bookingDate);
                    edit.setDuration(duration);
                    if(edit.editRoom(thisroomNumber)){
                        JOptionPane.showMessageDialog(this, "Room information added Updated.");
                    }
                    else
                        JOptionPane.showMessageDialog(this, "Update failed.\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
                    break;
                case 1:
                    JOptionPane.showMessageDialog(this, "Invalid date.\n(Date format: dd/mm/yyyy)\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(this, "Invalid date format.\n(Date format: dd/mm/yyyy)\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void cbxCurrentStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCurrentStudentActionPerformed
        if(cbxCurrentStudent.getSelectedIndex() != -1){
            int index = currentStudent.indexOf(cbxCurrentStudent.getSelectedItem());
            txtBookingDate.setText(bookingDate.get(index));
            txtDuration.setText(duration.get(index));
        }
    }//GEN-LAST:event_cbxCurrentStudentActionPerformed

    public void setNewStudentCBX(){
        txtNewBookingDate.setText("");
        txtNewDuration.setText("");
        if(Integer.parseInt(txtSpaceAvailable.getText()) > 0){
            cbxNewStudent.setEnabled(true);
            txtNewBookingDate.setEnabled(true);
            txtNewDuration.setEnabled(true);
            btnAdd.setEnabled(true);
            cbxNewStudent.removeAllItems();
            cbxNewStudent.addItem("");
            User student = new User();
            ArrayList<String> newStudentName = student.accessAllStudentName();
            RoomInfo allBookingStudent = new RoomInfo();
            ArrayList<String> allBookingStudentName = allBookingStudent.accessAllBookingStudent();
            StudentApplication allStudentApplication = new StudentApplication();
            ArrayList<String> AllOngoingStudentName = allStudentApplication.accessAllOngoingStudent();
            for(String name : newStudentName){
                if(!allBookingStudentName.contains(name))
                    if(!AllOngoingStudentName.contains(name))
                        cbxNewStudent.addItem(name);
            }
        }else{
            cbxNewStudent.removeAllItems();
            cbxNewStudent.setEnabled(false);
            txtNewBookingDate.setEnabled(false);
            txtNewDuration.setEnabled(false);
            btnAdd.setEnabled(false);
        }
    }
    
    public void setCurrentStudentCBX(String roomNumber){
        RoomInfo room = new RoomInfo(roomNumber);
        txtSpaceAvailable.setText(Integer.toString(room.getSpaceAvailable()));
        currentStudent = room.getBookingStudent();
        bookingDate = room.getBookingDate();
        duration = room.getDuration();
        cbxCurrentStudent.removeAllItems();
        for(String name : currentStudent){
            cbxCurrentStudent.addItem(name);
        }
        if(cbxCurrentStudent.getSelectedItem().equals("-")){
            btnEdit.setEnabled(false);
            btnDelete.setEnabled(false);
        }else{
            btnEdit.setEnabled(true);
            btnDelete.setEnabled(true);
        }
    }
    
    public int verifyDate(String date){
        int valid;
        int days;
        String[] room = date.split("/");
        if(room.length != 3)
            valid = 2;
        else{
            if(Integer.parseInt(room[2]) > 1999 && Integer.parseInt(room[1]) > 0){
                switch(Integer.parseInt(room[1])){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2:
                    if(Integer.parseInt(room[2])%4 == 0)
                        days = 29;
                    else days = 28;
                    break;
                default:
                    valid = 1;
                    return valid;
                }
                if(days >= Integer.parseInt(room[0]))
                    valid = 0;
                else
                    valid = 1;
            }else
                valid = 1;
        }
        return valid;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditBookingStudentInfoPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel2;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> cbxCurrentStudent;
    private javax.swing.JComboBox<String> cbxNewStudent;
    private javax.swing.JLabel lblBookingDate;
    private javax.swing.JLabel lblCurrentStudent;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblNewBookingDate;
    private javax.swing.JLabel lblNewDuration;
    private javax.swing.JLabel lblNewStudent;
    private javax.swing.JLabel lblSpaceAvailable;
    private javax.swing.JTextField txtBookingDate;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtNewBookingDate;
    private javax.swing.JTextField txtNewDuration;
    private javax.swing.JTextField txtSpaceAvailable;
    // End of variables declaration//GEN-END:variables
}
