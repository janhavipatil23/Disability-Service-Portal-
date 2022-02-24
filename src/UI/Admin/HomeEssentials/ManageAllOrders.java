/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin.HomeEssentials;

import UI.Admin.Food.*;
import Business.EcoSystem;
import Business.Organizations.FoodOrganization;
import Business.Organizations.GroceryAndEssentialsOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodOrganizationWorkQueue;
import Business.WorkQueue.FoodOrganizationWorkRequest;
import Business.WorkQueue.GroceryWorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author devikamujgule
 */

public class ManageAllOrders extends javax.swing.JPanel {

    /**
     * Creates new form ManageAllOrders
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount userAccount;
    JSplitPane adminSplitPane;
    Organization organization;
    DefaultTableModel model;
    DefaultTableModel model2;
    //FoodOrganization foodOrg;
    //FoodOrganizationWorkRequest foodreq;
    GroceryWorkRequest groReq;
    GroceryAndEssentialsOrganization groceryOrg;
    int index;
    int id;
    
    
    public ManageAllOrders(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system, Organization organization, JSplitPane adminSplitPane,  GroceryAndEssentialsOrganization groceryOrg) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.organization = organization;
        this.adminSplitPane = adminSplitPane;
        this.groceryOrg = groceryOrg;
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Id");
        model.addColumn("Sender Name");
        model.addColumn("Status");
        
        model2 = new DefaultTableModel();
        jTable2.setModel(model2);
        model2.addColumn("Food Item");
        model2.addColumn("Price");
        model2.addColumn("Quantity");
        
        for(int i = 0; i < groceryOrg.getDeliveryManList().size(); i++){
            jComboBox1.addItem(groceryOrg.getDeliveryManList().get(i).getUsername());
        }
        
          generateTable();
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel3 = new javax.swing.JPanel();
        ImageHeader4 = new javax.swing.JLabel();
        Title4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Accept = new javax.swing.JButton();
        Reject = new javax.swing.JButton();
        View = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        HeaderPanel3.setBackground(new java.awt.Color(110, 89, 222));
        HeaderPanel3.setPreferredSize(new java.awt.Dimension(1254, 116));

        Title4.setFont(new java.awt.Font("STSong", 1, 62)); // NOI18N
        Title4.setForeground(new java.awt.Color(255, 255, 255));
        Title4.setText("ForYou");

        javax.swing.GroupLayout HeaderPanel3Layout = new javax.swing.GroupLayout(HeaderPanel3);
        HeaderPanel3.setLayout(HeaderPanel3Layout);
        HeaderPanel3Layout.setHorizontalGroup(
            HeaderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanel3Layout.createSequentialGroup()
                .addComponent(ImageHeader4)
                .addGap(20, 20, 20)
                .addComponent(Title4)
                .addGap(0, 851, Short.MAX_VALUE))
        );
        HeaderPanel3Layout.setVerticalGroup(
            HeaderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanel3Layout.createSequentialGroup()
                .addGroup(HeaderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageHeader4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HeaderPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Title4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sender Name", "Message", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        Accept.setBackground(new java.awt.Color(0, 0, 0));
        Accept.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        Accept.setForeground(new java.awt.Color(255, 255, 255));
        Accept.setText("Accept");
        Accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptActionPerformed(evt);
            }
        });

        Reject.setBackground(new java.awt.Color(0, 0, 0));
        Reject.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        Reject.setForeground(new java.awt.Color(255, 255, 255));
        Reject.setText("Reject");
        Reject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejectActionPerformed(evt);
            }
        });

        View.setBackground(new java.awt.Color(0, 0, 0));
        View.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        View.setForeground(new java.awt.Color(255, 255, 255));
        View.setText("View Order");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Food Name", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setFont(new java.awt.Font("STSong", 0, 24)); // NOI18N
        jLabel1.setText("Delivery Man:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1066, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel1)
                        .addGap(115, 115, 115)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(Accept, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(Reject, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Accept, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reject, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        // TODO add your handling code here:
         System.out.println(">>>"+groReq.getShoppingList().size());
        for(int j = 0; j < groReq.getShoppingList().size(); j++){
            model2.addRow(new Object[]{
                groceryOrg.getWorkQueue().getWorkRequestList().get(j).getId(),
                groReq.getShoppingList().get(j).getItemName(),
                groReq.getShoppingList().get(j).getPrice(),
                groReq.getShoppingList().get(j).getQuantity()
            });
        }
   
    }//GEN-LAST:event_ViewActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
          index = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        id = Integer.parseInt(model.getValueAt(index, 0).toString());
        
        for(int j = 0; j < groceryOrg.getWorkQueue().getWorkRequestList().size(); j++){
            if(groceryOrg.getWorkQueue().getWorkRequestList().get(j).getId() == id){
                groReq = (GroceryWorkRequest)groceryOrg.getWorkQueue().getWorkRequestList().get(j);
            }
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptActionPerformed
        // TODO add your handling code here:
         if(jComboBox1.getSelectedItem() != null){
//            foodreq.setStatus("Accepted");
//            jComboBox1.getSelectedItem().toString();
//             viewOrderDirList();
           String selectedItem = (String) jComboBox1.getSelectedItem();
            for (int j = 0; j < groceryOrg.getDeliveryManList().size(); j++) {
                if (groceryOrg.getDeliveryManList().get(j).getUsername().equals(selectedItem)) {
                    groReq.setReceiver(groceryOrg.getDeliveryManList().get(j));
                    System.out.println("selectedDir .." + groReq.getReceiver().getUsername());
                    groReq.setAssignedEmployee(groceryOrg.getDeliveryManList().get(j));
                    groReq.setStatus("Accepted");
                    groReq.getReceiver().getWorkQueue().getWorkRequestList().add(groReq);
                    //System.out.println("reciever " + foodreq.getReceiver().getUsername() + " username " + selectedDir.getReceiver().getWorkQueue().getWorkRequestList().size());
                    viewOrderDirList();
                    JOptionPane.showMessageDialog(this, "YOUR SERVICE IS ACCEPTED AND HELPER IS ASSIGNED");
                    return;
                }
            }
        }else {
            JOptionPane.showMessageDialog(this, "ADVISOR CANNOT BE ASSIGNED AT THE MOMENT");
        }

    }//GEN-LAST:event_AcceptActionPerformed

    private void RejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejectActionPerformed
        // TODO add your handling code here:
         model.removeRow(jTable1.getSelectedRow());
            groReq.setStatus("Rejected");
            for (int i = 0; i < groceryOrg.getWorkQueue().getWorkRequestList().size(); i++) {
                if (groceryOrg.getWorkQueue().getWorkRequestList().get(i).getId() == id) {
                    groceryOrg.getWorkQueue().getWorkRequestList().remove(i);
                    JOptionPane.showMessageDialog(this, "SORRY !! SERVICE WAS REJECTED");
                    break;
                }
            }

    }//GEN-LAST:event_RejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accept;
    private javax.swing.JPanel HeaderPanel3;
    private javax.swing.JLabel ImageHeader4;
    private javax.swing.JButton Reject;
    private javax.swing.JLabel Title4;
    private javax.swing.JButton View;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private void generateTable() {
        System.out.println("order>>>"+groceryOrg.getWorkQueue().getWorkRequestList().size());
        for(int j = 0; j < groceryOrg.getWorkQueue().getWorkRequestList().size(); j++){
            groReq = (GroceryWorkRequest)groceryOrg.getWorkQueue().getWorkRequestList().get(j);
            model.addRow(new Object[]{
                groceryOrg.getWorkQueue().getWorkRequestList().get(j).getId(),
                groReq.getSender().getUserDetails().getName(),
                groReq.getStatus()
            });
        }
    }
     private void viewOrderDirList() {
        model.getDataVector().removeAllElements();
        for (int i = 0; i < groceryOrg.getWorkQueue().getWorkRequestList().size(); i++) {
            groReq = (GroceryWorkRequest)groceryOrg.getWorkQueue().getWorkRequestList().get(i);
            model.addRow(new Object[]{
                groceryOrg.getWorkQueue().getWorkRequestList().get(i).getId(),
                groReq.getSender().getUserDetails().getName(),
                groReq.getStatus()
            });
        }
    }
    
}