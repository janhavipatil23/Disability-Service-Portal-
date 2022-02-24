/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin.Therapy;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Organizations.NursingOrganization;
import Business.Organizations.Organization;
import Business.Organizations.TherapyOrganization;
import Business.Role.NurseRole;
import Business.Role.TherapistRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author janhavi
 */
public class TherapyEmployeeOperations extends javax.swing.JPanel {

    /**
     * Creates new form TherapyEmployeeOperations
     */
    EcoSystem system;
    TherapyOrganization org;
    DefaultTableModel model;
    public TherapyEmployeeOperations(EcoSystem system, TherapyOrganization organization) {
        initComponents();
        org = organization;
        this.system = system;
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Employee ID");
        model.addColumn("Employee Name");
        for(int i=0;i<organization.getTherapistList().size();i++){
            model.addRow(new Object[]{
                organization.getTherapistList().get(i).getEmployee().getId(),
                organization.getTherapistList().get(i).getEmployee().getName()
            });
        }
    }

    private void showEmployeeList() {
        for(int i=0;i<org.getTherapistList().size();i++){
            System.out.println("size....."+org.getTherapistList().size());
            model.addRow(new Object[]{
                org.getTherapistList().get(i).getEmployee().getId(),
                org.getTherapistList().get(i).getEmployee().getName()
            });
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        ImageHeader = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        Namecreate = new javax.swing.JTextField();
        Create = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idUpdate = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        nameUpdate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1480, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(110, 89, 222));
        jPanel2.setPreferredSize(new java.awt.Dimension(1254, 116));

        Title.setFont(new java.awt.Font("STSong", 1, 62)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("ForYou");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(ImageHeader)
                .addGap(20, 20, 20)
                .addComponent(Title)
                .addGap(0, 1265, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Title)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 110));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Emp Id", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 397, 332));

        jLabel8.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel8.setText("Create Employee");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 164, -1, 23));
        add(Namecreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 193, 165, -1));

        Create.setBackground(new java.awt.Color(0, 0, 0));
        Create.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        Create.setForeground(new java.awt.Color(255, 255, 255));
        Create.setText("Create");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });
        add(Create, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 237, 150, 40));

        jLabel9.setFont(new java.awt.Font("STSong", 0, 18)); // NOI18N
        jLabel9.setText("Name:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 196, 112, 23));

        jLabel10.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel10.setText("Update Employee");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 305, -1, 23));
        add(idUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 334, 165, -1));

        Update.setBackground(new java.awt.Color(0, 0, 0));
        Update.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 431, 150, 40));

        jLabel11.setFont(new java.awt.Font("STSong", 0, 18)); // NOI18N
        jLabel11.setText("Id:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 337, 112, 23));
        add(nameUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 378, 165, -1));

        jLabel12.setFont(new java.awt.Font("STSong", 0, 18)); // NOI18N
        jLabel12.setText("Name:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 381, 112, 23));

        Delete.setBackground(new java.awt.Color(0, 0, 0));
        Delete.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 502, 150, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        // TODO add your handling code here:
        String empName = Namecreate.getText();
        Employee newEmployee = system.getEmployeeDirectory().createEmployee(Namecreate.getText());
        UserAccount newUser = system.getUserAccountDirectory().createUserAccount(empName,empName, newEmployee, new TherapistRole("employee"));
        org.getUserAccountDirectory().getUserAccountList().add(newUser);
        org.getTherapistList().add(newUser);
        JOptionPane.showMessageDialog(null, "CREATED EMPLOYEE SUCCESSFULLY");
            model.addRow(new Object[]{
                newEmployee.getId(),
                newEmployee.getName()
            });
    }//GEN-LAST:event_CreateActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow() >=0){
            
            ArrayList<UserAccount> employeeList = org.getUserAccountDirectory().getUserAccountList();
            ArrayList<UserAccount> userAccountList = system.getUserAccountDirectory().getUserAccountList();
            for(int i=0;i<employeeList.size();i++){
                if(employeeList.get(i).getEmployee().getId() ==Integer.parseInt(idUpdate.getText())){
                    employeeList.get(i).getEmployee().setName(nameUpdate.getText());
                    JOptionPane.showMessageDialog(null, "UPDATED DETAILS SUCCESSFULLY");
                    model.getDataVector().removeAllElements();
                    showEmployeeList();
                }
            }
            for(int i=0;i<org.getTherapistList().size();i++){
                if(org.getTherapistList().get(i).getEmployee().getId() == Integer.parseInt(idUpdate.getText())){
                    org.getTherapistList().get(i).getEmployee().setName(nameUpdate.getText());
                }
            }
            for(int i=0;i<userAccountList.size();i++){
                if(userAccountList.get(i).getEmployee().getId() == Integer.parseInt(idUpdate.getText())){
                    system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().setName(nameUpdate.getText());
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "SELECT AN EMPLOYEE FROM TABLE");
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        String id = String.valueOf(model.getValueAt(jTable1.getSelectedRow(), 0));
        String name = String.valueOf(model.getValueAt(jTable1.getSelectedRow(), 1));
        idUpdate.setText(id);
        nameUpdate.setText(name);
    }//GEN-LAST:event_jTable1MouseClicked

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        ArrayList<UserAccount> userAccountList = system.getUserAccountDirectory().getUserAccountList();
        if(jTable1.getSelectedRow() >=0){
            //            int text = Integer.parseInt(idUpdate.getText());
            ArrayList<UserAccount> employeeList = org.getTherapistList();
            for(int i=0;i<employeeList.size();i++){
                if(employeeList.get(i).getEmployee().getId() == Integer.parseInt(idUpdate.getText())){
                    employeeList.remove(i);
                    org.getUserAccountDirectory().getUserAccountList().remove(i);
                    model.getDataVector().removeAllElements();
                    JOptionPane.showMessageDialog(null, "DELETED EMPLOYEE SUCCESSFULLY");

                    showEmployeeList();
                }
            }

            for(int i=0;i<userAccountList.size();i++){
                if(userAccountList.get(i).getEmployee().getId() == Integer.parseInt(idUpdate.getText())){
                    userAccountList.remove(i);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "SELECT AN EMPLOYEE FROM TABLE");
        }
    }//GEN-LAST:event_DeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Create;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel ImageHeader;
    private javax.swing.JTextField Namecreate;
    private javax.swing.JLabel Title;
    private javax.swing.JButton Update;
    private javax.swing.JTextField idUpdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameUpdate;
    // End of variables declaration//GEN-END:variables
}
