/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import manager.EmployeeHistory;
import manager.Employees;

/**
 *
 * @author kshitijkumartiwari
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    EmployeeHistory history;
    public ViewJPanel(EmployeeHistory history) {
        initComponents();
        
        this.history = history;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeTable = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblAge = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtLvl = new javax.swing.JTextField();
        lblStrtDate = new javax.swing.JLabel();
        txtPosTitle = new javax.swing.JTextField();
        lblLvl = new javax.swing.JLabel();
        txtStrtDate = new javax.swing.JTextField();
        lblTeamInf = new javax.swing.JLabel();
        txtTeamInfo = new javax.swing.JTextField();
        lblPosTitle = new javax.swing.JLabel();
        txtCntctNo = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCntctNo1 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblEID = new javax.swing.JLabel();
        txtEID = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();
        lblProfileImg = new javax.swing.JLabel();
        btnImgUpdate = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 30)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Employees");

        EmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "EID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position", "Contact No", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(EmployeeTable);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblAge.setText("Age:");

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        lblGender.setText("Gender:");

        txtLvl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLvlActionPerformed(evt);
            }
        });

        lblStrtDate.setText("Start Date:");

        txtPosTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosTitleActionPerformed(evt);
            }
        });

        lblLvl.setText("Level:");

        txtStrtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStrtDateActionPerformed(evt);
            }
        });

        lblTeamInf.setText("Team Info:");

        txtTeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeamInfoActionPerformed(evt);
            }
        });

        lblPosTitle.setText("Position Title:");

        txtCntctNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCntctNoActionPerformed(evt);
            }
        });

        lblEmail.setText("Email Address:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblCntctNo1.setText("Contact Numer:");

        lblName.setText("Name:");

        lblEID.setText("Employee ID:");

        txtEID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEIDActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblProfileImg.setText("Profile Image");
        lblProfileImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnImgUpdate.setText("Update Image");
        btnImgUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblStrtDate)
                            .addComponent(lblGender)
                            .addComponent(lblAge)
                            .addComponent(lblEID)
                            .addComponent(lblName))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtGender, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStrtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblPosTitle)
                                            .addComponent(lblTeamInf)
                                            .addComponent(lblLvl)))
                                    .addComponent(lblCntctNo1))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLvl, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(txtTeamInfo)
                                    .addComponent(txtPosTitle)
                                    .addComponent(txtCntctNo)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmail)
                                .addGap(39, 39, 39)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblProfileImg)
                                .addGap(79, 79, 79))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnImgUpdate)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnView)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnUpdate, btnView});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEID)
                            .addComponent(txtEID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblEmail)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblStrtDate)
                                .addComponent(txtStrtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLvl)
                            .addComponent(txtLvl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProfileImg))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTeamInf)
                                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPosTitle)
                                    .addComponent(txtPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCntctNo1)
                                    .addComponent(txtCntctNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnImgUpdate)))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnUpdate, btnView});

    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndedx = EmployeeTable.getSelectedRow();
        
        if(selectedRowIndedx<0){
            
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
        Employees selectedEmployee = (Employees)model.getValueAt(selectedRowIndedx , 0);
        
        history.deleteEmployees(selectedEmployee);
        
        JOptionPane.showMessageDialog(this, "Selected Employee was deleted.");
        populateTable();
        
        txtName.setText("");
        txtAge.setText("");
        txtEID.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtStrtDate.setText("");
        txtLvl.setText("");
        txtTeamInfo.setText("");
        txtPosTitle.setText("");
        txtCntctNo.setText("");
        txtEmail.setText("");
        lblImg.setIcon(null);
        
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtLvlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLvlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLvlActionPerformed

    private void txtPosTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosTitleActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtPosTitleActionPerformed

    private void txtStrtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStrtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStrtDateActionPerformed

    private void txtTeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeamInfoActionPerformed

    private void txtCntctNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCntctNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCntctNoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEIDActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndedx = EmployeeTable.getSelectedRow();
        
        if(selectedRowIndedx<0){
            
            JOptionPane.showMessageDialog(this, "Please select a row to view details.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
        Employees selectedEmployee = (Employees)model.getValueAt(selectedRowIndedx , 0);
        
        
        txtName.setText(selectedEmployee.getName());
        txtEID.setText(selectedEmployee.getEid());
        txtAge.setText(String.valueOf(selectedEmployee.getAge()));
        txtGender.setText(selectedEmployee.getGender());
        txtStrtDate.setText(selectedEmployee.getStrtdate());
        txtLvl.setText(selectedEmployee.getLvl());
        txtTeamInfo.setText(selectedEmployee.getTeaminf());
        txtPosTitle.setText(selectedEmployee.getPostitle());
        txtCntctNo.setText(selectedEmployee.getCntctno());
        txtEmail.setText(selectedEmployee.getEmail());
        lblImg.setIcon(selectedEmployee.getEmpimg(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_SMOOTH));
        
        
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
        if(EmployeeTable.getSelectedRowCount() == 1){
        
        String name = txtName.getText();
        String eid = txtEID.getText();
        String age = txtAge.getText();
        String gender = txtGender.getText();
        String strtdate = txtStrtDate.getText();
        String lvl = txtLvl.getText();
        String teaminf = txtTeamInfo.getText();
        String postitle = txtPosTitle.getText();
        String cntctno = txtCntctNo.getText();
        String email = txtEmail.getText();
        Icon empimg = lblImg.getIcon();
        
        if( name.isEmpty() || gender.isEmpty() || 
                strtdate.isEmpty() || lvl.isEmpty() 
                || teaminf.isEmpty() || postitle.isEmpty()
                || cntctno.isEmpty() || email.isEmpty() || age.isEmpty() || eid.isEmpty() )
        {
        txtName.setText("");
        txtAge.setText("");
        txtEID.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtStrtDate.setText("");
        txtLvl.setText("");
        txtTeamInfo.setText("");
        txtPosTitle.setText("");
        txtCntctNo.setText("");
        txtEmail.setText("");
        lblImg.setIcon(null);
        
        JOptionPane.showMessageDialog(this,"No field can be empty!");
        
        }
        
        
        
        
        else if(name.length()<2){
            
          JOptionPane.showMessageDialog(this, "Name cannot be a single character. Please enter again.", "Error", JOptionPane.ERROR_MESSAGE);  
          txtName.setText("");
          
        }
        
        else if (Integer.parseInt(age)<18){
            
           JOptionPane.showMessageDialog(this, "Employee should 18 years old or more. Please enter again.", "Error", JOptionPane.ERROR_MESSAGE);
            txtAge.setText("");
            
        }
        
        else if(!gender.contentEquals("Male") && !gender.contentEquals("Female") && !gender.contentEquals("Other")){
            JOptionPane.showMessageDialog(this, "Gender can only be 'Male', 'Female' or 'Other'. Please enter gender again.", "Error", JOptionPane.ERROR_MESSAGE);
            txtGender.setText("");
        }
        
        else if (cntctno.length()>10){
            JOptionPane.showMessageDialog(this, "Contact number should be 10 digits. Please enter again.", "Error", JOptionPane.ERROR_MESSAGE);
             txtCntctNo.setText("");
        }
        
        else if(!cntctno.matches("[0-9]+")){
            JOptionPane.showMessageDialog(this, "Contact number should have numerics only. Please enter again.", "Error", JOptionPane.ERROR_MESSAGE);
             txtCntctNo.setText("");
        }
              
        else if (cntctno.length()<10) {
            JOptionPane.showMessageDialog(this, "Contact number should 10 digits. Please enter again.", "Error", JOptionPane.ERROR_MESSAGE);
            txtCntctNo.setText("");
        }
        
        else if (cntctno.length()>10) {
            JOptionPane.showMessageDialog(this, "Contact number should 10 digits. Please enter again.", "Error", JOptionPane.ERROR_MESSAGE);
            txtCntctNo.setText("");
        }
   
        
        else if ( !email.contains("@") && !email.contains(".")) {
        
        JOptionPane.showMessageDialog(this,"Invalid Email Address. Please enter again", "Error", JOptionPane.ERROR_MESSAGE);
        txtEmail.setText("");
    }
        else{
        model.setValueAt(name, EmployeeTable.getSelectedRow(), 0);
        model.setValueAt(eid, EmployeeTable.getSelectedRow(), 1);
        model.setValueAt(age, EmployeeTable.getSelectedRow(), 2);
        model.setValueAt(gender, EmployeeTable.getSelectedRow(), 3);
        model.setValueAt(strtdate, EmployeeTable.getSelectedRow(), 4);
        model.setValueAt(lvl, EmployeeTable.getSelectedRow(), 5);
        model.setValueAt(teaminf, EmployeeTable.getSelectedRow(), 6);
        model.setValueAt(postitle, EmployeeTable.getSelectedRow(), 7);
        model.setValueAt(cntctno, EmployeeTable.getSelectedRow(), 8);
        model.setValueAt(email, EmployeeTable.getSelectedRow(), 9);
        
        JOptionPane.showMessageDialog(this, "Selected row was updated successfully.");
        }
        } else{
           if(EmployeeTable.getSelectedRowCount() == 0){
               JOptionPane.showMessageDialog(this, "Table ss empty.");
           }else{
               JOptionPane.showMessageDialog(this, "Please select a row to update.");
           }
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnImgUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgUpdateActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialog = browseImageFile.showOpenDialog(null);
        if(showOpenDialog == JFileChooser.APPROVE_OPTION){
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null , selectedImagePath);
            
            ImageIcon ii = new ImageIcon(selectedImagePath);
            Image ei = (ii).getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight() ,Image.SCALE_SMOOTH);
            ii = new ImageIcon(ei);
            lblImg.setIcon(ii);
    }//GEN-LAST:event_btnImgUpdateActionPerformed
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmployeeTable;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnImgUpdate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCntctNo1;
    private javax.swing.JLabel lblEID;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblLvl;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPosTitle;
    private javax.swing.JLabel lblProfileImg;
    private javax.swing.JLabel lblStrtDate;
    private javax.swing.JLabel lblTeamInf;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCntctNo;
    private javax.swing.JTextField txtEID;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLvl;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPosTitle;
    private javax.swing.JTextField txtStrtDate;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
        model.setRowCount(0);
        
        for (Employees es : history.getHistory()){
        
        Object[] row = new Object[10];
        row[0] = es ;
        row[1] = es.getEid();
        row[2] = es.getAge();
        row[3] = es.getGender();
        row[4] = es.getStrtdate();
        row[5] = es.getLvl();
        row[6] = es.getTeaminf();
        row[7] = es.getPostitle();
        row[8] = es.getCntctno();
        row[9] = es.getEmail();
        
        model.addRow(row);
   
        
       
        }

    }   

    
    
    
}
