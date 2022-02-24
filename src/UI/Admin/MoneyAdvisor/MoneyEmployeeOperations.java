/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin.MoneyAdvisor;


import UI.Admin.*;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Organizations.MoneyManagementOrganization;
import Business.Organizations.Organization;
import Business.Role.MoneyAdvisorRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author devikamujgule
 */
public class MoneyEmployeeOperations extends javax.swing.JPanel {

    /**
     * Creates new form MoneyEmployeeOperations
     */
    EcoSystem system;
    private MoneyManagementOrganization moneyOrganization;
    DefaultTableModel model;
//    public MoneyEmployeeOperations(EcoSystem system, Organization organization) {
//        initComponents();
//        this.system = system;
//    }

    public MoneyEmployeeOperations(EcoSystem system, MoneyManagementOrganization moneyOrganization) {
        initComponents();
        System.out.println("money operations."+moneyOrganization.getMoneyAdvisorsList());
//                showEmployeeList();
        this.system = system;
        this.moneyOrganization = moneyOrganization;
        model = new DefaultTableModel();
        jTable_EmployeeData.setModel(model);
        model.addColumn("Employee ID");
        model.addColumn("Employee Name");
        for(int i=0;i<moneyOrganization.getMoneyAdvisorsList().size();i++){
            System.out.println("size....."+moneyOrganization.getMoneyAdvisorsList().size());
            model.addRow(new Object[]{
                moneyOrganization.getMoneyAdvisorsList().get(i).getEmployee().getId(),
                moneyOrganization.getMoneyAdvisorsList().get(i).getEmployee().getName()
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
        jTable_EmployeeData = new javax.swing.JTable();
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

        jTable_EmployeeData.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_EmployeeData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_EmployeeDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_EmployeeData);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 397, 332));

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel8.setText("Create Employee");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 155, 164, 23));
        add(Namecreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 196, 165, -1));

        Create.setBackground(new java.awt.Color(0, 0, 0));
        Create.setForeground(new java.awt.Color(255, 255, 255));
        Create.setText("Create");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });
        add(Create, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 240, 150, 33));

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel9.setText("Name:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 199, 112, 23));

        jLabel10.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel10.setText("Update Employee");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 296, 191, 23));

        idUpdate.setEditable(false);
        add(idUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 337, 165, -1));

        Update.setBackground(new java.awt.Color(0, 0, 0));
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 427, 150, 33));

        jLabel11.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel11.setText("Id:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 340, 112, 23));
        add(nameUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 381, 165, -1));

        jLabel12.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel12.setText("Name:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 384, 112, 23));

        Delete.setBackground(new java.awt.Color(0, 0, 0));
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 502, 150, 33));
    }// </editor-fold>//GEN-END:initComponents

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        // TODO add your handling code here:
        String empName = Namecreate.getText();
        Employee newEmployee = system.getEmployeeDirectory().createEmployee(Namecreate.getText());
        UserAccount newUser = system.getUserAccountDirectory().createUserAccount(empName,empName, newEmployee, new MoneyAdvisorRole());
        moneyOrganization.getUserAccountDirectory().getUserAccountList().add(newUser);
        moneyOrganization.getMoneyAdvisorsList().add(newUser);
        JOptionPane.showMessageDialog(null, "EMPLOYEE CREATED SUCCESSFULLY");
        
            model.addRow(new Object[]{
                newEmployee.getId(),
                newEmployee.getName()
            });
        
//        jTable_EmployeeData.removeAll();
//        showEmployeeList();
    }//GEN-LAST:event_CreateActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        if(jTable_EmployeeData.getSelectedRow() >=0){
            
            ArrayList<UserAccount> employeeList = moneyOrganization.getUserAccountDirectory().getUserAccountList();
            ArrayList<UserAccount> userAccountList = system.getUserAccountDirectory().getUserAccountList();
            for(int i=0;i<employeeList.size();i++){
                if(employeeList.get(i).getEmployee().getId() ==Integer.parseInt(idUpdate.getText())){
//                    System.out.println("in update...."+employeeList.get(i).);
                    employeeList.get(i).getEmployee().setName(nameUpdate.getText());
                    
//                    moneyOrganization.getMoneyAdvisorsList().get(i).getEmployee().setName(nameUpdate.getText());
                    JOptionPane.showMessageDialog(null, "DETAILS UPDATED SUCCESSFULLY");
                    
                    model.getDataVector().removeAllElements();
                    showEmployeeList();
                }
            }
            for(int i=0;i<moneyOrganization.getMoneyAdvisorsList().size();i++){
                if(moneyOrganization.getMoneyAdvisorsList().get(i).getEmployee().getId() == Integer.parseInt(idUpdate.getText())){
                    moneyOrganization.getMoneyAdvisorsList().get(i).getEmployee().setName(nameUpdate.getText());
                    System.out.println("in money org update...."+moneyOrganization.getMoneyAdvisorsList().get(i).getEmployee().getName());
                }
            }
            for(int i=0;i<userAccountList.size();i++){
                if(userAccountList.get(i).getEmployee().getId() == Integer.parseInt(idUpdate.getText())){
                    system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().setName(nameUpdate.getText());
                    System.out.println("in system org update...."+userAccountList.get(i).getEmployee().getName());
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "PLEASE SELECT AND EMPLOYEE FROM TABLE");
        }
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        ArrayList<UserAccount> userAccountList = system.getUserAccountDirectory().getUserAccountList();
        if(jTable_EmployeeData.getSelectedRow() >=0){
//            int text = Integer.parseInt(idUpdate.getText());
            ArrayList<UserAccount> employeeList = moneyOrganization.getMoneyAdvisorsList();
            for(int i=0;i<employeeList.size();i++){
                if(employeeList.get(i).getEmployee().getId() == Integer.parseInt(idUpdate.getText())){
                    employeeList.remove(i);
                    moneyOrganization.getUserAccountDirectory().getUserAccountList().remove(i);
                    model.getDataVector().removeAllElements();
                    JOptionPane.showMessageDialog(null, "EMPLOYEE DELETED");
                    
                    showEmployeeList();
                }
            }
            
            for(int i=0;i<userAccountList.size();i++){
                if(userAccountList.get(i).getEmployee().getId() == Integer.parseInt(idUpdate.getText())){
                    userAccountList.remove(i);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "PLEASE SELECT AND EMPLOYEE FROM TABLE");
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void jTable_EmployeeDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_EmployeeDataMouseClicked
        // TODO add your handling code here:
        String id = String.valueOf(model.getValueAt(jTable_EmployeeData.getSelectedRow(), 0));
        String name = String.valueOf(model.getValueAt(jTable_EmployeeData.getSelectedRow(), 1));
        idUpdate.setText(id);
        nameUpdate.setText(name);
    }//GEN-LAST:event_jTable_EmployeeDataMouseClicked


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
    private javax.swing.JTable jTable_EmployeeData;
    private javax.swing.JTextField nameUpdate;
    // End of variables declaration//GEN-END:variables

    private void showEmployeeList() {
        for(int i=0;i<moneyOrganization.getMoneyAdvisorsList().size();i++){
            System.out.println("size....."+moneyOrganization.getMoneyAdvisorsList().size());
            model.addRow(new Object[]{
                moneyOrganization.getMoneyAdvisorsList().get(i).getEmployee().getId(),
                moneyOrganization.getMoneyAdvisorsList().get(i).getEmployee().getName()
            });
        }
    }
}
