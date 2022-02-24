/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.EcoSystem;
import Business.Organizations.GroceryAndEssentialsOrganization;
import Business.Organizations.RevenueMap;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GroceryWorkRequest;
import java.awt.CardLayout;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author devikamujgule
 */
public class GroceryPlaceOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GroceryPlaceOrderJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    DefaultTableModel model;
    GroceryAndEssentialsOrganization groceryOrg;
    GroceryWorkRequest request;
    JSplitPane servicesSplitPane;
    int index;
    String food;
    java.util.Date date=new java.util.Date(); 

    
    public GroceryPlaceOrderJPanel(JPanel userProcessContainer,
            EcoSystem business, 
            UserAccount userAccount, 
            GroceryAndEssentialsOrganization groceryOrg,
            GroceryWorkRequest request, 
            JSplitPane servicesSplitPane) {
        
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = business;
        this.servicesSplitPane = servicesSplitPane;
        this.groceryOrg = groceryOrg;
        this.request = request;
        
        model = new DefaultTableModel();
        jTable1.setModel(model);
        model.addColumn("Food Items");
        model.addColumn("Price");
        model.addColumn("Quantity");
        
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

        jPanel1 = new javax.swing.JPanel();
        ImageHeader1 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SubmitjButton = new javax.swing.JButton();
        RemovejButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TotalTextField = new javax.swing.JTextField();
        jButton_pay = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(110, 89, 222));

        Title1.setFont(new java.awt.Font("STSong", 1, 62)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setText("ForYou");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ImageHeader1)
                .addGap(20, 20, 20)
                .addComponent(Title1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImageHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Title1))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Items", "Price", "Quantity"
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

        SubmitjButton.setBackground(new java.awt.Color(0, 0, 0));
        SubmitjButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitjButton.setText("Submit");
        SubmitjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitjButtonActionPerformed(evt);
            }
        });

        RemovejButton.setBackground(new java.awt.Color(0, 0, 0));
        RemovejButton.setForeground(new java.awt.Color(255, 255, 255));
        RemovejButton.setText("Remove");
        RemovejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovejButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("STSong", 0, 24)); // NOI18N
        jLabel6.setText("Total:");

        jButton_pay.setBackground(new java.awt.Color(0, 0, 0));
        jButton_pay.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jButton_pay.setForeground(new java.awt.Color(255, 255, 255));
        jButton_pay.setText("Pay");
        jButton_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_payActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jButton_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SubmitjButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(TotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(RemovejButton)))
                .addContainerGap(411, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(431, 431, 431))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RemovejButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jButton_pay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SubmitjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(125, 125, 125))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        index = jTable1.getSelectedRow();
        System.out.println("selectedrow>>>>"+index);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        food = model.getValueAt(index, 0).toString();
    }//GEN-LAST:event_jTable1MouseClicked

    private void SubmitjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitjButtonActionPerformed
        // TODO add your handling code here:
        request.setStatus("Order Placed");
        request.setRequestDate(date);
        groceryOrg.getWorkQueue().getWorkRequestList().add(request);
        JOptionPane.showMessageDialog(null, "Order Placed!!");
        TotalTextField.setText("");
        System.out.println("sender>"+request.getSender().getUserDetails().getName());
        String d = request.getRequestDate().toString();
        String[] dArr = d.split(" ");
        System.out.println("date>>>>"+date);
        System.out.println("total>>"+request.getTotal());
        
        List<String> fullDate = Arrays.asList(dArr[dArr.length -1], dArr[1]);
        //foodOrg.getRevenueMap().put(fullDate, request.getTotal());
        RevenueMap rm = new RevenueMap(Integer.parseInt(fullDate.get(0)), fullDate.get(1), request.getTotal(), 4);
        groceryOrg.getRevMap().add(rm);
    }//GEN-LAST:event_SubmitjButtonActionPerformed

    private void RemovejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovejButtonActionPerformed
        // TODO add your handling code here:
        for(int i = 0; i < request.getShoppingList().size(); i++){
            if(request.getShoppingList().get(i).getItemName().equals(food)){
                double total = request.getTotal() - (request.getShoppingList().get(i).getPrice() * request.getShoppingList().get(i).getQuantity());
                request.setTotal(total);
                request.getShoppingList().remove(i);
            }
        }

        model.removeRow(index);
        TotalTextField.setText(String.valueOf(request.getTotal()));
        JOptionPane.showMessageDialog(null, "Order Removed!!");
    }//GEN-LAST:event_RemovejButtonActionPerformed

    private void jButton_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_payActionPerformed
        // TODO add your handling code here:
        PaymentJpanel pay = new PaymentJpanel(userAccount, request.getTotal());
        servicesSplitPane.setRightComponent(pay);
    }//GEN-LAST:event_jButton_payActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageHeader1;
    private javax.swing.JButton RemovejButton;
    private javax.swing.JButton SubmitjButton;
    private javax.swing.JLabel Title1;
    private javax.swing.JTextField TotalTextField;
    private javax.swing.JButton jButton_pay;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void generateTable() {
        for(int j = 0; j < request.getShoppingList().size(); j++){
        System.out.println("request place order>>>"+request.getShoppingList().size());
        System.out.println("request place order meal>>>"+request.getShoppingList().get(j).getItemName());
            model.addRow(new Object[]{
                request.getShoppingList().get(j).getItemName(),
                request.getShoppingList().get(j).getPrice(),
                request.getShoppingList().get(j).getQuantity()
            });
        }
        
        TotalTextField.setText(String.valueOf(request.getTotal()));
    }
}
