package assignment;

import java.awt.Color;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class AdminPage extends javax.swing.JFrame {
    
    String adminName;
    
    public AdminPage(String AdminName){
        initComponents();
        adminName = AdminName;
        setRoomNumberCBX();
        lblAAAlert1.setForeground(pnlRoomInfo.getBackground());
        lblAAAlert2.setForeground(pnlRoomInfo.getBackground());
        lblAAAlert3.setForeground(pnlRoomInfo.getBackground());
        lblAPAlert1.setForeground(pnlAdminProfile.getBackground());
        lblAPAlert2.setForeground(pnlAdminProfile.getBackground());
        lblAPAlert3.setForeground(pnlAdminProfile.getBackground());
        setProfile(false);
    }
    
    public AdminPage() {
        initComponents();
        setRoomNumberCBX();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAdminPage = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        tab = new javax.swing.JTabbedPane();
        pnlRoomInfo = new javax.swing.JPanel();
        cbxRoomInfo = new javax.swing.JComboBox<>();
        lblChooseRoom = new javax.swing.JLabel();
        lblRoomType = new javax.swing.JLabel();
        lblSpaceAvailable = new javax.swing.JLabel();
        lblBookingDate = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        btnEditRoom = new javax.swing.JButton();
        btnDeleteRoom = new javax.swing.JButton();
        txtRoomType = new javax.swing.JTextField();
        txtSpaceAvailable = new javax.swing.JTextField();
        txtBookingDate = new javax.swing.JTextField();
        txtDuration = new javax.swing.JTextField();
        btnAddRoom = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        lblBookingStudent = new javax.swing.JLabel();
        cbxBookingStudent = new javax.swing.JComboBox<>();
        btnManageStudent = new javax.swing.JButton();
        pnlStudentApplication = new javax.swing.JPanel();
        cbxSAStudentName = new javax.swing.JComboBox<>();
        lblSASelectStudent = new javax.swing.JLabel();
        lblSARoomBooked = new javax.swing.JLabel();
        lblSADuration = new javax.swing.JLabel();
        txtSABookingDate = new javax.swing.JTextField();
        txtSADuration = new javax.swing.JTextField();
        lblSABookingDate = new javax.swing.JLabel();
        txtSARoomBooked = new javax.swing.JTextField();
        btnSAAccept = new javax.swing.JButton();
        btnSADecline = new javax.swing.JButton();
        btnSAViewRoomInfo = new javax.swing.JButton();
        btnSARefresh = new javax.swing.JButton();
        pnlReport = new javax.swing.JPanel();
        txtReCurrentReport = new javax.swing.JTextField();
        cbxReSelectReport = new javax.swing.JComboBox<>();
        btnReGenerateReport = new javax.swing.JButton();
        lblReSelectReport = new javax.swing.JLabel();
        lblReCurrentReport = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReminder = new javax.swing.JTextArea();
        pnlAddNewAdmin = new javax.swing.JPanel();
        txtAANewAdminName = new javax.swing.JTextField();
        txtAANewEmail = new javax.swing.JTextField();
        lblAANewAdminName = new javax.swing.JLabel();
        lblAANewEmail = new javax.swing.JLabel();
        btnAAAddNewAdmin = new javax.swing.JButton();
        lblAAAlert1 = new javax.swing.JLabel();
        lblAAAlert2 = new javax.swing.JLabel();
        lblAANewAdminID = new javax.swing.JLabel();
        txtAANewAdminID = new javax.swing.JTextField();
        btnAAAutoGenerateID = new javax.swing.JButton();
        lblAAAlert3 = new javax.swing.JLabel();
        lblAAAlert4 = new javax.swing.JLabel();
        pnlAdminProfile = new javax.swing.JPanel();
        lblAPAlert1 = new javax.swing.JLabel();
        txtAPName = new javax.swing.JTextField();
        txtAPEmail = new javax.swing.JTextField();
        lblAPName = new javax.swing.JLabel();
        lblAPEmail = new javax.swing.JLabel();
        lblAPAdminID = new javax.swing.JLabel();
        txtAPAdminID = new javax.swing.JTextField();
        lblAAAlert6 = new javax.swing.JLabel();
        lblAPAlert3 = new javax.swing.JLabel();
        btnAPEditProfile = new javax.swing.JButton();
        lblAPPassword = new javax.swing.JLabel();
        lblAPAlert2 = new javax.swing.JLabel();
        txtAPPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Admin Page");

        lblAdminPage.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblAdminPage.setText("Admin Page");

        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogout.setText("Log out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        tab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabStateChanged(evt);
            }
        });

        cbxRoomInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxRoomInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRoomInfoActionPerformed(evt);
            }
        });

        lblChooseRoom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblChooseRoom.setText("Select a room: ");

        lblRoomType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRoomType.setText("Room Type:");

        lblSpaceAvailable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSpaceAvailable.setText("Space Available:");

        lblBookingDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBookingDate.setText("Booking Date:");

        lblDuration.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDuration.setText("Duration:");

        btnEditRoom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditRoom.setText("Edit Room");
        btnEditRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditRoomActionPerformed(evt);
            }
        });

        btnDeleteRoom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDeleteRoom.setText("Delete Room");
        btnDeleteRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRoomActionPerformed(evt);
            }
        });

        txtRoomType.setEditable(false);

        txtSpaceAvailable.setEditable(false);

        txtBookingDate.setEditable(false);

        txtDuration.setEditable(false);

        btnAddRoom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddRoom.setText("Add New Room");
        btnAddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRoomActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        lblBookingStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBookingStudent.setText("Booking Student:");

        cbxBookingStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxBookingStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBookingStudentActionPerformed(evt);
            }
        });

        btnManageStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnManageStudent.setText("Edit Student Info");
        btnManageStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRoomInfoLayout = new javax.swing.GroupLayout(pnlRoomInfo);
        pnlRoomInfo.setLayout(pnlRoomInfoLayout);
        pnlRoomInfoLayout.setHorizontalGroup(
            pnlRoomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRoomInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditRoom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddRoom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeleteRoom)
                .addGap(96, 96, 96))
            .addGroup(pnlRoomInfoLayout.createSequentialGroup()
                .addGroup(pnlRoomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRoomInfoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(pnlRoomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRoomType)
                            .addComponent(lblSpaceAvailable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRoomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSpaceAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(pnlRoomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBookingDate)
                            .addComponent(lblBookingStudent)
                            .addComponent(lblDuration))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRoomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnManageStudent)
                            .addGroup(pnlRoomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtBookingDate)
                                .addComponent(txtDuration)
                                .addComponent(cbxBookingStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlRoomInfoLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lblChooseRoom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxRoomInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnlRoomInfoLayout.setVerticalGroup(
            pnlRoomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoomInfoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlRoomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChooseRoom)
                    .addComponent(cbxRoomInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh))
                .addGap(43, 43, 43)
                .addGroup(pnlRoomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBookingStudent)
                    .addComponent(cbxBookingStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRoomType)
                    .addComponent(txtRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManageStudent)
                .addGap(9, 9, 9)
                .addGroup(pnlRoomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBookingDate)
                    .addComponent(txtBookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSpaceAvailable)
                    .addComponent(txtSpaceAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlRoomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDuration)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(pnlRoomInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditRoom)
                    .addComponent(btnDeleteRoom)
                    .addComponent(btnAddRoom))
                .addGap(33, 33, 33))
        );

        tab.addTab("Hostel Room Info", pnlRoomInfo);

        cbxSAStudentName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxSAStudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSAStudentNameActionPerformed(evt);
            }
        });

        lblSASelectStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSASelectStudent.setText("Select a Student: ");

        lblSARoomBooked.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSARoomBooked.setText("Room Booked:");

        lblSADuration.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSADuration.setText("Duration:");

        txtSABookingDate.setEditable(false);
        txtSABookingDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtSADuration.setEditable(false);
        txtSADuration.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblSABookingDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSABookingDate.setText("Booking Date:");

        txtSARoomBooked.setEditable(false);
        txtSARoomBooked.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnSAAccept.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSAAccept.setText("Accept");
        btnSAAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAAcceptActionPerformed(evt);
            }
        });

        btnSADecline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSADecline.setText("Decline");
        btnSADecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSADeclineActionPerformed(evt);
            }
        });

        btnSAViewRoomInfo.setText("View Room Info");
        btnSAViewRoomInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAViewRoomInfoActionPerformed(evt);
            }
        });

        btnSARefresh.setText("Refresh");
        btnSARefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSARefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlStudentApplicationLayout = new javax.swing.GroupLayout(pnlStudentApplication);
        pnlStudentApplication.setLayout(pnlStudentApplicationLayout);
        pnlStudentApplicationLayout.setHorizontalGroup(
            pnlStudentApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStudentApplicationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlStudentApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlStudentApplicationLayout.createSequentialGroup()
                        .addComponent(lblSARoomBooked)
                        .addGap(21, 21, 21)
                        .addComponent(txtSARoomBooked, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlStudentApplicationLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnSAAccept)
                        .addGap(74, 74, 74)
                        .addComponent(btnSADecline))
                    .addGroup(pnlStudentApplicationLayout.createSequentialGroup()
                        .addGroup(pnlStudentApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSABookingDate)
                            .addComponent(lblSADuration))
                        .addGap(26, 26, 26)
                        .addGroup(pnlStudentApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSAViewRoomInfo)
                            .addGroup(pnlStudentApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtSABookingDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                .addComponent(txtSADuration, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlStudentApplicationLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(lblSASelectStudent)
                .addGap(18, 18, 18)
                .addComponent(cbxSAStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSARefresh)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        pnlStudentApplicationLayout.setVerticalGroup(
            pnlStudentApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStudentApplicationLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pnlStudentApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSASelectStudent)
                    .addComponent(cbxSAStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSARefresh))
                .addGap(28, 28, 28)
                .addGroup(pnlStudentApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSARoomBooked)
                    .addComponent(txtSARoomBooked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSAViewRoomInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlStudentApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSABookingDate)
                    .addComponent(txtSABookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlStudentApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSADuration)
                    .addComponent(txtSADuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnlStudentApplicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSADecline)
                    .addComponent(btnSAAccept))
                .addGap(37, 37, 37))
        );

        tab.addTab("Student's Application", pnlStudentApplication);

        txtReCurrentReport.setEditable(false);
        txtReCurrentReport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cbxReSelectReport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxReSelectReport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available Room Report", "Monthly Income Report", "User Login Record", "Student Application Record", "Admin List", "Student List" }));
        cbxReSelectReport.setSelectedIndex(-1);

        btnReGenerateReport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReGenerateReport.setText("Generate Report");
        btnReGenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReGenerateReportActionPerformed(evt);
            }
        });

        lblReSelectReport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblReSelectReport.setText("Select a Report: ");

        lblReCurrentReport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblReCurrentReport.setText("Current Report Generated:");

        txtReminder.setEditable(false);
        txtReminder.setColumns(20);
        txtReminder.setRows(3);
        txtReminder.setTabSize(9);
        txtReminder.setText("Reminder  \nTo view the report, please view the \n'Report' text file.");
        jScrollPane1.setViewportView(txtReminder);

        javax.swing.GroupLayout pnlReportLayout = new javax.swing.GroupLayout(pnlReport);
        pnlReport.setLayout(pnlReportLayout);
        pnlReportLayout.setHorizontalGroup(
            pnlReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReportLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReportLayout.createSequentialGroup()
                        .addComponent(btnReGenerateReport)
                        .addGap(217, 217, 217))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReportLayout.createSequentialGroup()
                        .addComponent(lblReSelectReport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxReSelectReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReportLayout.createSequentialGroup()
                .addGap(0, 130, Short.MAX_VALUE)
                .addGroup(pnlReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReportLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReportLayout.createSequentialGroup()
                        .addComponent(lblReCurrentReport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtReCurrentReport, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))))
        );
        pnlReportLayout.setVerticalGroup(
            pnlReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReportLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(pnlReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReCurrentReport)
                    .addComponent(txtReCurrentReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(pnlReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReSelectReport)
                    .addComponent(cbxReSelectReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnReGenerateReport)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        tab.addTab("Report", pnlReport);

        txtAANewAdminName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAANewAdminName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAANewAdminNameKeyReleased(evt);
            }
        });

        txtAANewEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAANewEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAANewEmailKeyReleased(evt);
            }
        });

        lblAANewAdminName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAANewAdminName.setText("Admin Name:");

        lblAANewEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAANewEmail.setText("Email Address:");

        btnAAAddNewAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAAAddNewAdmin.setText("Add New Admin");
        btnAAAddNewAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAAAddNewAdminActionPerformed(evt);
            }
        });

        lblAAAlert1.setForeground(new java.awt.Color(255, 0, 51));
        lblAAAlert1.setText("Name used. Please enter another one.");

        lblAAAlert2.setForeground(new java.awt.Color(255, 0, 51));
        lblAAAlert2.setText("Email used. Please enter another one.");

        lblAANewAdminID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAANewAdminID.setText("Admin ID:");

        txtAANewAdminID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAANewAdminID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAANewAdminIDKeyReleased(evt);
            }
        });

        btnAAAutoGenerateID.setText("Auto Generate ID");
        btnAAAutoGenerateID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAAAutoGenerateIDActionPerformed(evt);
            }
        });

        lblAAAlert3.setForeground(new java.awt.Color(255, 0, 51));
        lblAAAlert3.setText("Invalid ID. ID should be between 100 and 200.");

        lblAAAlert4.setForeground(new java.awt.Color(242, 242, 242));
        lblAAAlert4.setText("nuuuuuuuuuuuuuuuuuuuuuuuuul");

        javax.swing.GroupLayout pnlAddNewAdminLayout = new javax.swing.GroupLayout(pnlAddNewAdmin);
        pnlAddNewAdmin.setLayout(pnlAddNewAdminLayout);
        pnlAddNewAdminLayout.setHorizontalGroup(
            pnlAddNewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddNewAdminLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(btnAAAddNewAdmin)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddNewAdminLayout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addGroup(pnlAddNewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddNewAdminLayout.createSequentialGroup()
                        .addComponent(lblAANewAdminName)
                        .addGap(25, 25, 25)
                        .addGroup(pnlAddNewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAAAlert1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAANewAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlAddNewAdminLayout.createSequentialGroup()
                        .addComponent(lblAANewAdminID)
                        .addGap(48, 48, 48)
                        .addGroup(pnlAddNewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAAAutoGenerateID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAAAlert3)
                            .addGroup(pnlAddNewAdminLayout.createSequentialGroup()
                                .addComponent(txtAANewAdminID, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(lblAAAlert4))))
                    .addGroup(pnlAddNewAdminLayout.createSequentialGroup()
                        .addComponent(lblAANewEmail)
                        .addGap(19, 19, 19)
                        .addGroup(pnlAddNewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAAAlert2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAANewEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlAddNewAdminLayout.setVerticalGroup(
            pnlAddNewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddNewAdminLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(pnlAddNewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAANewAdminID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAANewAdminID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAAAlert4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAAAutoGenerateID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAAAlert3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddNewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAANewAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAANewAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAAAlert1)
                .addGap(23, 23, 23)
                .addGroup(pnlAddNewAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAANewEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAANewEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(lblAAAlert2)
                .addGap(18, 18, 18)
                .addComponent(btnAAAddNewAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        tab.addTab("Add New Admin", pnlAddNewAdmin);

        lblAPAlert1.setForeground(new java.awt.Color(255, 0, 51));
        lblAPAlert1.setText("Name used. Please enter another one.");

        txtAPName.setEditable(false);
        txtAPName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAPName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAPNameKeyReleased(evt);
            }
        });

        txtAPEmail.setEditable(false);
        txtAPEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAPEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAPEmailKeyReleased(evt);
            }
        });

        lblAPName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAPName.setText("Name:");

        lblAPEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAPEmail.setText("Email Address:");

        lblAPAdminID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAPAdminID.setText("Admin ID:");

        txtAPAdminID.setEditable(false);
        txtAPAdminID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblAAAlert6.setForeground(new java.awt.Color(242, 242, 242));
        lblAAAlert6.setText("Invalid ID. ID should be between 100 and 200.");

        lblAPAlert3.setForeground(new java.awt.Color(255, 0, 51));
        lblAPAlert3.setText("Email used. Please enter another one.");

        btnAPEditProfile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAPEditProfile.setText("Edit Profile");
        btnAPEditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAPEditProfileActionPerformed(evt);
            }
        });

        lblAPPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAPPassword.setText("Password:");

        lblAPAlert2.setForeground(new java.awt.Color(255, 0, 51));
        lblAPAlert2.setText("Enter a password.");

        txtAPPassword.setEditable(false);
        txtAPPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAPPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAPPasswordKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlAdminProfileLayout = new javax.swing.GroupLayout(pnlAdminProfile);
        pnlAdminProfile.setLayout(pnlAdminProfileLayout);
        pnlAdminProfileLayout.setHorizontalGroup(
            pnlAdminProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAAAlert6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdminProfileLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(pnlAdminProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdminProfileLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnAPEditProfile)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdminProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblAPName)
                        .addGroup(pnlAdminProfileLayout.createSequentialGroup()
                            .addGroup(pnlAdminProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAPEmail)
                                .addComponent(lblAPAdminID)
                                .addComponent(lblAPPassword))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pnlAdminProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAPAlert1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAPAdminID, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAPAlert3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAPAlert2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAPEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAPPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAPName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(92, 92, 92))
        );
        pnlAdminProfileLayout.setVerticalGroup(
            pnlAdminProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdminProfileLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblAAAlert6)
                .addGap(18, 18, 18)
                .addGroup(pnlAdminProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAPAdminID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAPAdminID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAdminProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAPName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(lblAPAlert1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAdminProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAPPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAPPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAPAlert2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAdminProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAPEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAPEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAPAlert3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAPEditProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        tab.addTab("Profile", pnlAdminProfile);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAdminPage)
                .addGap(92, 92, 92)
                .addComponent(btnLogout)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout)
                    .addComponent(lblAdminPage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int confirmation = JOptionPane.showConfirmDialog(this,"Are you sure you want to log out?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(confirmation == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void cbxSAStudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSAStudentNameActionPerformed
        if(cbxSAStudentName.getSelectedItem() == null){
            txtSARoomBooked.setText("");
            txtSABookingDate.setText("");
            txtSADuration.setText("");
            btnSAViewRoomInfo.setEnabled(false);
            btnSAAccept.setEnabled(false);
            btnSADecline.setEnabled(false);
        }else if(!(cbxSAStudentName.getSelectedItem().equals(""))){
            StudentApplication student = new StudentApplication(cbxSAStudentName.getSelectedItem().toString());
            txtSARoomBooked.setText(student.getRoomNumber());
            txtSABookingDate.setText(student.getBookingDate());
            txtSADuration.setText(student.getDuration());
            btnSAViewRoomInfo.setEnabled(true);
            btnSAAccept.setEnabled(true);
            btnSADecline.setEnabled(true);
        }else{
            txtSARoomBooked.setText("");
            txtSABookingDate.setText("");
            txtSADuration.setText("");
            btnSAViewRoomInfo.setEnabled(false);
            btnSAAccept.setEnabled(false);
            btnSADecline.setEnabled(false);
        }
    }//GEN-LAST:event_cbxSAStudentNameActionPerformed

    private void btnManageStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStudentActionPerformed
        EditBookingStudentInfoPage edit = new EditBookingStudentInfoPage(cbxRoomInfo.getSelectedItem().toString());
        edit.setVisible(true);
    }//GEN-LAST:event_btnManageStudentActionPerformed

    private void cbxBookingStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBookingStudentActionPerformed
        if(cbxBookingStudent.getSelectedItem() == null){
        }else if(!(cbxBookingStudent.getSelectedItem().equals("") || cbxBookingStudent.getSelectedItem().equals("-"))){
            setBookingStudentCBX(1);
        }
        else if(!cbxBookingStudent.getSelectedItem().equals("-")){
            txtBookingDate.setText("");
            txtDuration.setText("");
        }
    }//GEN-LAST:event_cbxBookingStudentActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        setRoomNumberCBX();
        resetRoomInfo();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRoomActionPerformed
        EditAddRoomPage addroompg = new EditAddRoomPage();
        addroompg.setVisible(true);
    }//GEN-LAST:event_btnAddRoomActionPerformed

    private void btnDeleteRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRoomActionPerformed
        int confirmation = JOptionPane.showConfirmDialog(this,"Are you sure you want to delete " + cbxRoomInfo.getSelectedItem() + " room's Information", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(confirmation == JOptionPane.YES_OPTION){
            RoomInfo delete = new RoomInfo();
            if(delete.deleteRoom(cbxRoomInfo.getSelectedItem().toString())){
                JOptionPane.showMessageDialog(this, "Room information deleted.");
                setRoomNumberCBX();
                resetRoomInfo();
            }else
            JOptionPane.showMessageDialog(this, "Update failed.\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteRoomActionPerformed

    private void btnEditRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditRoomActionPerformed
        EditAddRoomPage addroompg = new EditAddRoomPage(cbxRoomInfo.getSelectedItem().toString());
        addroompg.setVisible(true);
    }//GEN-LAST:event_btnEditRoomActionPerformed

    private void cbxRoomInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRoomInfoActionPerformed
        if(cbxRoomInfo.getSelectedItem() == null){
        }else if(cbxRoomInfo.getSelectedItem() != ""){
            RoomInfo room = new RoomInfo(cbxRoomInfo.getSelectedItem().toString());
            setBookingStudentCBX(0);
            txtRoomType.setText(room.getRoomType());
            txtSpaceAvailable.setText(Integer.toString(room.getSpaceAvailable()));
            cbxBookingStudent.setEnabled(true);
            btnEditRoom.setEnabled(true);
            btnDeleteRoom.setEnabled(true);
            btnManageStudent.setEnabled(true);
        }else
        resetRoomInfo();
    }//GEN-LAST:event_cbxRoomInfoActionPerformed

    private void btnSAAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAAcceptActionPerformed
        int confirmation = JOptionPane.showConfirmDialog(this,
                "You will be accepting the following student application.\nAre you sure you want to continue?",
                "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(confirmation == JOptionPane.YES_OPTION){
            StudentApplication application = new StudentApplication();
            RoomInfo room = new RoomInfo(txtSARoomBooked.getText());
            ArrayList<String> currentStudent = room.getBookingStudent();
            ArrayList<String> bookingDate = room.getBookingDate();
            ArrayList<String> duration = room.getDuration();
            ArrayList<String> allOngoingRoomNumber = application.accessAllOngoingRoomNumber();
            int exist = -1;
            boolean proceed;
            for(String RoomNumber : allOngoingRoomNumber){
                if(RoomNumber.equals(txtSARoomBooked.getText())){
                    exist++;
                }
            }
            if(room.getSpaceAvailable() == 1 && exist > 0){
                int confirmation2 = JOptionPane.showConfirmDialog(this,
                        "There are " + exist + " more student(s) is applying for this room.\nAccepting this application will result in declining others"
                        + "\nas there is only 1 space left for this room.\nAre you sure you want to continue?", "Confirmation", JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE);
                if(confirmation2 == JOptionPane.YES_OPTION){
                    proceed = true;
                }
                else
                    proceed = false;
            }else
                proceed = true;
            if(proceed){
                if(currentStudent.get(0).equals("-")){
                    currentStudent.set(0, cbxSAStudentName.getSelectedItem().toString());
                    bookingDate.set(0, txtSABookingDate.getText());
                    duration.set(0, txtSADuration.getText());
                }else{
                    currentStudent.add(cbxSAStudentName.getSelectedItem().toString());
                    bookingDate.add(txtSABookingDate.getText());
                    duration.add(txtSADuration.getText());
                }
                room.setBookingStudent(currentStudent);
                room.setBookingDate(bookingDate);
                room.setDuration(duration);
                room.setSpaceAvailable(room.getSpaceAvailable()-1);
                if(room.editRoom(txtSARoomBooked.getText()) && application.changeApplicationStatusWithSN("Accepted", 
                        cbxSAStudentName.getSelectedItem().toString(), "Accepted by admin")){
                    JOptionPane.showMessageDialog(this, "Student accepted.");
                    if(room.getSpaceAvailable()+1 == 1 && exist > 0)
                        application.changeApplicationStatusWithRN("Declined", txtSARoomBooked.getText(), "Declined by system(insufficeint space after accepting)");
                    setSAStudentNameCBX();
                }
                else
                    JOptionPane.showMessageDialog(this, "Update failed.\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSAAcceptActionPerformed

    private void btnSAViewRoomInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAViewRoomInfoActionPerformed
        tab.setSelectedIndex(0);
        cbxRoomInfo.setSelectedItem(txtSARoomBooked.getText());
    }//GEN-LAST:event_btnSAViewRoomInfoActionPerformed

    private void tabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabStateChanged
        if(!(cbxSAStudentName.getItemCount() > 0))
            setSAStudentNameCBX();
        User report = new User();
        String title = report.getReportTitle();
        if (title.equals(""))
            txtReCurrentReport.setText("-");
        else
            txtReCurrentReport.setText(title);
    }//GEN-LAST:event_tabStateChanged

    private void btnSARefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSARefreshActionPerformed
        setSAStudentNameCBX();
    }//GEN-LAST:event_btnSARefreshActionPerformed

    private void btnSADeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSADeclineActionPerformed
        int confirmation = JOptionPane.showConfirmDialog(this,
                "You will be declining the following student application.\nAre you sure you want to continue?", "Confirmation", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(confirmation == JOptionPane.YES_OPTION){
            StudentApplication application = new StudentApplication();
            if(application.changeApplicationStatusWithSN("Declined", cbxSAStudentName.getSelectedItem().toString(), "Declined by Admin")){
                JOptionPane.showMessageDialog(this, "Student declined.");
                setSAStudentNameCBX();
            }else
                JOptionPane.showMessageDialog(this, "Update failed.\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSADeclineActionPerformed

    private void btnReGenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReGenerateReportActionPerformed
        if(cbxReSelectReport.getSelectedIndex() != -1){
            boolean success = false;
            switch(cbxReSelectReport.getSelectedIndex()){
                case 0:
                    RoomInfo room = new RoomInfo();
                    success = room.generateReport();
                    break;
                case 1:
                    Payment payment = new Payment();
                    JComboBox<String> comboBox1 = new JComboBox<>();
                    comboBox1.addItem("All");
                    for (String Year : payment.accessAllMonthYear("Year", ""))
                        comboBox1.addItem(Year);
                    int result1 = JOptionPane.showConfirmDialog(this, comboBox1, "Select the year you would like to view.", 
                            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                    if (result1 == JOptionPane.OK_OPTION) {JComboBox<String> comboBox2 = new JComboBox<>();
                        comboBox2.addItem("All");
                        for (String Month : payment.accessAllMonthYear("Month", comboBox1.getSelectedItem().toString()))
                            comboBox2.addItem(Month);
                        int result2 = JOptionPane.showConfirmDialog(this, comboBox2, "Select the month you would like to view.", 
                                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                        if (result2 == JOptionPane.OK_OPTION) {
                            success = payment.generateReport(comboBox1.getSelectedItem().toString(), comboBox2.getSelectedItem().toString());
                        }
                    }
                    break;
                case 2:
                    User user = new User();
                    success = user.generateReport();
                    break;
                case 3:
                    StudentApplication application = new StudentApplication();
                    success = application.generateReport();
                    break;
                case 4:
                    Admin admin = new Admin();
                    success = admin.generateAdminList();
                    break;
                case 5:
                    Student student = new Student();
                    success = student.generateStudentList();
                    break;
            }
            if(success){
                JOptionPane.showMessageDialog(this, "Report generated.");
                User report = new User();
                String title = report.getReportTitle();
                if (title.equals(""))
                    txtReCurrentReport.setText("-");
                else
                    txtReCurrentReport.setText(report.getReportTitle());
                cbxReSelectReport.setSelectedIndex(-1);
            }
            else
                JOptionPane.showMessageDialog(this, "Report generate failed.\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
        }else
            JOptionPane.showMessageDialog(this, "Please select a report to generate.","Alert" ,JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnReGenerateReportActionPerformed

    private void btnAAAutoGenerateIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAAAutoGenerateIDActionPerformed
        Admin admin = new Admin();
        int newID = 100;
        while(true){
            newID++;
            if(!admin.accessAllAdminID().contains(Integer.toString(newID))){
                txtAANewAdminID.setText(Integer.toString(newID));
                lblAAAlert3.setForeground(pnlRoomInfo.getBackground());
                break;
            }
        }
    }//GEN-LAST:event_btnAAAutoGenerateIDActionPerformed

    private void txtAANewAdminNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAANewAdminNameKeyReleased
        Admin admin = new Admin();
        if(admin.accessAllAdminName().contains(txtAANewAdminName.getText())){
            lblAAAlert1.setForeground(Color.RED);
            lblAAAlert1.setText("Name used. Please enter again.");
        }else
            lblAAAlert1.setForeground(pnlRoomInfo.getBackground());
    }//GEN-LAST:event_txtAANewAdminNameKeyReleased

    private void txtAANewAdminIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAANewAdminIDKeyReleased
        Admin admin = new Admin();
        try{
            if(Integer.parseInt(txtAANewAdminID.getText()) < 200 && Integer.parseInt(txtAANewAdminID.getText()) > 100){
                if(admin.accessAllAdminID().contains(txtAANewAdminID.getText())){
                    lblAAAlert3.setForeground(Color.RED);
                    lblAAAlert3.setText("ID used. Please enter again.");
                }else
                    lblAAAlert3.setForeground(pnlRoomInfo.getBackground());
            }else{
                lblAAAlert3.setForeground(Color.RED);
                lblAAAlert3.setText("Invalid ID. ID should be between 100 and 200.");
            }
        }catch (NumberFormatException e){
            lblAAAlert3.setForeground(Color.RED);
            lblAAAlert3.setText("Invalid ID. ID should be between 100 and 200.");
        }
    }//GEN-LAST:event_txtAANewAdminIDKeyReleased

    private void txtAANewEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAANewEmailKeyReleased
        Admin admin = new Admin();
        if(admin.accessAllAdminEmail().contains(txtAANewEmail.getText())){
            lblAAAlert2.setForeground(Color.RED);
            lblAAAlert2.setText("Email address used. Please enter again.");
        }else
            lblAAAlert2.setForeground(pnlRoomInfo.getBackground());
    }//GEN-LAST:event_txtAANewEmailKeyReleased

    private void btnAAAddNewAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAAAddNewAdminActionPerformed
        if(txtAANewAdminName.getText().equals("") || txtAANewAdminID.getText().equals("") || txtAANewEmail.getText().equals("")){
            if(txtAANewAdminName.getText().equals("")){
                lblAAAlert1.setForeground(Color.RED);
                lblAAAlert1.setText("Enter a name.");            
            }
            if(txtAANewEmail.getText().equals("")){
                lblAAAlert2.setForeground(Color.RED);
                lblAAAlert2.setText("Enter an email address.");
            }
            if(txtAANewAdminID.getText().equals("")){
                lblAAAlert3.setForeground(Color.RED);
                lblAAAlert3.setText("Enter an ID.");            
            }
        }else if(lblAAAlert1.getForeground() == Color.RED || lblAAAlert2.getForeground() == Color.RED || lblAAAlert3.getForeground() == Color.RED){
            JOptionPane.showMessageDialog(this, "Please ensure the informations valid.","Alert" ,JOptionPane.WARNING_MESSAGE);
        }else{
            Admin admin = new Admin();
            admin.setUsername(txtAANewAdminName.getText());
            admin.setAdminID(Integer.parseInt(txtAANewAdminID.getText()));
            admin.setAdminEmail(txtAANewEmail.getText());
            admin.setPassword(txtAANewAdminName.getText() + "&" + txtAANewAdminID.getText());
            if(admin.addNewAdmin()){
                JOptionPane.showMessageDialog(this, "New admin added.\nThe format of the password is '[admin name]&[admin ID]'");
                txtAANewAdminName.setText("");
                txtAANewAdminID.setText("");
                txtAANewEmail.setText("");
            }else
                JOptionPane.showMessageDialog(this, "New admin added failed.\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAAAddNewAdminActionPerformed

    private void txtAPNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAPNameKeyReleased
        Admin admin = new Admin(adminName);
        if(admin.accessAllAdminName().contains(txtAPName.getText())){
            if(!txtAPName.getText().equals(admin.getUsername())){
                lblAPAlert1.setForeground(Color.RED);
                lblAPAlert1.setText("Name used. Please enter again.");
            }else
                lblAPAlert1.setForeground(pnlAdminProfile.getBackground());
        }else
            lblAPAlert1.setForeground(pnlAdminProfile.getBackground());
    }//GEN-LAST:event_txtAPNameKeyReleased

    private void txtAPEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAPEmailKeyReleased
        Admin admin = new Admin(adminName);
        if(admin.accessAllAdminEmail().contains(txtAPEmail.getText())){
            if(!txtAPEmail.getText().equals(admin.getAdminEmail())){
                lblAPAlert3.setForeground(Color.RED);
                lblAPAlert3.setText("Email address used. Please enter again.");
            }else
                lblAPAlert3.setForeground(pnlAdminProfile.getBackground());
        }else
            lblAPAlert3.setForeground(pnlAdminProfile.getBackground());
    }//GEN-LAST:event_txtAPEmailKeyReleased

    private void btnAPEditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAPEditProfileActionPerformed
        if(txtAPName.isEditable()){
            StringBuilder builder = new StringBuilder();
            for(char password : txtAPPassword.getPassword())
                builder.append(password);
            if(txtAPName.getText().equals("") || builder.toString().equals("") || txtAPEmail.getText().equals("")){
                if(txtAPName.getText().equals("")){
                    lblAPAlert1.setForeground(Color.RED);
                    lblAPAlert1.setText("Enter a name.");            
                }
                if(builder.toString().equals("")){
                    lblAPAlert2.setForeground(Color.RED);
                }
                if(txtAPEmail.getText().equals("")){
                    lblAPAlert3.setForeground(Color.RED);
                    lblAPAlert3.setText("Enter an Email Address.");            
                }
            }else if(lblAPAlert1.getForeground() == Color.RED || lblAPAlert2.getForeground() == Color.RED || lblAPAlert3.getForeground() == Color.RED){
                JOptionPane.showMessageDialog(this, "Please ensure the informations valid.","Alert" ,JOptionPane.WARNING_MESSAGE);
            }else{
                Admin admin = new Admin();
                admin.setUsername(txtAPName.getText());
                admin.setAdminEmail(txtAPEmail.getText());
                admin.setPassword(builder.toString());
                if(admin.editAdminProfile(adminName)){
                    JOptionPane.showMessageDialog(this, "Profile updated");
                    adminName = txtAPName.getText();
                    setProfile(false);
                }else
                    JOptionPane.showMessageDialog(this, "Profile update failed.\nPlease try again.","Alert" ,JOptionPane.WARNING_MESSAGE);
            }
        }else
            setProfile(true);
    }//GEN-LAST:event_btnAPEditProfileActionPerformed

    private void txtAPPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAPPasswordKeyReleased
        lblAPAlert2.setForeground(pnlAdminProfile.getBackground());
    }//GEN-LAST:event_txtAPPasswordKeyReleased
 
    public void setProfile(boolean enable){
        Admin admin = new Admin(adminName);
        txtAPAdminID.setText(Integer.toString(admin.getAdminID()));
        txtAPName.setText(adminName);
        txtAPPassword.setText(admin.getPassword());
        txtAPEmail.setText(admin.getAdminEmail());
        txtAPName.setEditable(enable);
        txtAPPassword.setEditable(enable);
        txtAPEmail.setEditable(enable);
    }
    
    public void setSAStudentNameCBX(){
        cbxSAStudentName.setSelectedIndex(-1);
        cbxSAStudentName.removeAllItems();
        btnSAViewRoomInfo.setEnabled(false);
        btnSAAccept.setEnabled(false);
        btnSADecline.setEnabled(false);
        StudentApplication name = new StudentApplication();
        ArrayList<String> allOngoingStudentname = name.accessAllOngoingStudent();
        for(String number : allOngoingStudentname){
            cbxSAStudentName.addItem(number);
        }
        cbxSAStudentName.setSelectedIndex(-1);
    }
    
    public void setBookingStudentCBX(int mode){
        RoomInfo room = new RoomInfo(cbxRoomInfo.getSelectedItem().toString());
        ArrayList<String> thisBookingStudent = room.getBookingStudent();
        ArrayList<String> thisBookingDate = room.getBookingDate();
        ArrayList<String> thisDuration = room.getDuration();
        if(mode == 0){
            cbxBookingStudent.removeAllItems();
            if(thisBookingStudent.get(0).equals("-")){
                cbxBookingStudent.addItem("-");
                txtBookingDate.setText("-");
                txtDuration.setText("-");
            }else{
                cbxBookingStudent.addItem("");
                for (int i = 0; i < thisBookingStudent.size(); i++) {
                    cbxBookingStudent.addItem(thisBookingStudent.get(i));
                }
            }
        }else{
            int index = thisBookingStudent.indexOf(cbxBookingStudent.getSelectedItem());
            txtBookingDate.setText(thisBookingDate.get(index));
            txtDuration.setText(thisDuration.get(index));
        }
    }
    
    public void setRoomNumberCBX(){
        cbxRoomInfo.removeAllItems();
        RoomInfo room = new RoomInfo();
        ArrayList<String> roomNumber = room.accessRoomNumber();
        for(String number : roomNumber){
            cbxRoomInfo.addItem(number);
        }
    }
    
    public void resetRoomInfo(){
        txtBookingDate.setText("");
        txtDuration.setText("");
        txtRoomType.setText("");
        txtSpaceAvailable.setText("");
        cbxBookingStudent.removeAllItems();
        cbxBookingStudent.setEnabled(false);
        btnEditRoom.setEnabled(false);
        btnDeleteRoom.setEnabled(false);
        btnManageStudent.setEnabled(false);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAAAddNewAdmin;
    private javax.swing.JButton btnAAAutoGenerateID;
    private javax.swing.JButton btnAPEditProfile;
    private javax.swing.JButton btnAddRoom;
    private javax.swing.JButton btnDeleteRoom;
    private javax.swing.JButton btnEditRoom;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageStudent;
    private javax.swing.JButton btnReGenerateReport;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSAAccept;
    private javax.swing.JButton btnSADecline;
    private javax.swing.JButton btnSARefresh;
    private javax.swing.JButton btnSAViewRoomInfo;
    private javax.swing.JComboBox<String> cbxBookingStudent;
    private javax.swing.JComboBox<String> cbxReSelectReport;
    private javax.swing.JComboBox<String> cbxRoomInfo;
    private javax.swing.JComboBox<String> cbxSAStudentName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAAAlert1;
    private javax.swing.JLabel lblAAAlert2;
    private javax.swing.JLabel lblAAAlert3;
    private javax.swing.JLabel lblAAAlert4;
    private javax.swing.JLabel lblAAAlert6;
    private javax.swing.JLabel lblAANewAdminID;
    private javax.swing.JLabel lblAANewAdminName;
    private javax.swing.JLabel lblAANewEmail;
    private javax.swing.JLabel lblAPAdminID;
    private javax.swing.JLabel lblAPAlert1;
    private javax.swing.JLabel lblAPAlert2;
    private javax.swing.JLabel lblAPAlert3;
    private javax.swing.JLabel lblAPEmail;
    private javax.swing.JLabel lblAPName;
    private javax.swing.JLabel lblAPPassword;
    private javax.swing.JLabel lblAdminPage;
    private javax.swing.JLabel lblBookingDate;
    private javax.swing.JLabel lblBookingStudent;
    private javax.swing.JLabel lblChooseRoom;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblReCurrentReport;
    private javax.swing.JLabel lblReSelectReport;
    private javax.swing.JLabel lblRoomType;
    private javax.swing.JLabel lblSABookingDate;
    private javax.swing.JLabel lblSADuration;
    private javax.swing.JLabel lblSARoomBooked;
    private javax.swing.JLabel lblSASelectStudent;
    private javax.swing.JLabel lblSpaceAvailable;
    private javax.swing.JPanel pnlAddNewAdmin;
    private javax.swing.JPanel pnlAdminProfile;
    private javax.swing.JPanel pnlReport;
    private javax.swing.JPanel pnlRoomInfo;
    private javax.swing.JPanel pnlStudentApplication;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTextField txtAANewAdminID;
    private javax.swing.JTextField txtAANewAdminName;
    private javax.swing.JTextField txtAANewEmail;
    private javax.swing.JTextField txtAPAdminID;
    private javax.swing.JTextField txtAPEmail;
    private javax.swing.JTextField txtAPName;
    private javax.swing.JPasswordField txtAPPassword;
    private javax.swing.JTextField txtBookingDate;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtReCurrentReport;
    private javax.swing.JTextArea txtReminder;
    private javax.swing.JTextField txtRoomType;
    private javax.swing.JTextField txtSABookingDate;
    private javax.swing.JTextField txtSADuration;
    private javax.swing.JTextField txtSARoomBooked;
    private javax.swing.JTextField txtSpaceAvailable;
    // End of variables declaration//GEN-END:variables
}
