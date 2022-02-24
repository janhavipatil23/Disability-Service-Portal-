/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin;

import Business.EcoSystem;
import Business.Organizations.Organization;

/**
 *
 * @author devikamujgule
 * 
 */
public class EmployeeOperations extends javax.swing.JPanel {

    /**
     * Creates new form EmployeeOperations
     */
    EcoSystem system;
//    public EmployeeOperations(EcoSystem system, Organization organization) {
//        initComponents();
//        this.system = system;
//    }

    public EmployeeOperations(EcoSystem system, Organization organization) {
        initComponents();
        this.system = system;
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
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 164, 397, 332));

        jLabel8.setFont(new java.awt.Font("STSong", 0, 24)); // NOI18N
        jLabel8.setText("Create Employee");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 164, 220, 23));

        Namecreate.setFont(new java.awt.Font("STSong", 0, 24)); // NOI18N
        add(Namecreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 193, 250, -1));

        Create.setBackground(new java.awt.Color(0, 0, 0));
        Create.setForeground(new java.awt.Color(255, 255, 255));
        Create.setText("Create");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });
        add(Create, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 170, 33));

        jLabel9.setFont(new java.awt.Font("STSong", 0, 24)); // NOI18N
        jLabel9.setText("Name:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 196, 112, 23));

        jLabel10.setFont(new java.awt.Font("STSong", 0, 24)); // NOI18N
        jLabel10.setText("Update Employee");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 305, 178, 23));

        idUpdate.setFont(new java.awt.Font("STSong", 0, 24)); // NOI18N
        add(idUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 334, 240, -1));

        Update.setBackground(new java.awt.Color(0, 0, 0));
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 170, 33));

        jLabel11.setFont(new java.awt.Font("STSong", 0, 24)); // NOI18N
        jLabel11.setText("ID");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 337, 112, 23));

        nameUpdate.setFont(new java.awt.Font("STSong", 0, 24)); // NOI18N
        add(nameUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 378, 240, -1));

        jLabel12.setFont(new java.awt.Font("STSong", 0, 24)); // NOI18N
        jLabel12.setText("Name:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 381, 112, 23));

        Delete.setBackground(new java.awt.Color(0, 0, 0));
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 170, 33));
    }// </editor-fold>//GEN-END:initComponents

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_CreateActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
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
