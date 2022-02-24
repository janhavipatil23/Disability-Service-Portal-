/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FoodOrganization.FoodItems;
import Business.Organizations.FoodOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodOrganizationWorkRequest;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author devikamujgule
 */
public class OrderMeal extends javax.swing.JPanel {

    /**
     * Creates new form OrderMeal
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    DefaultTableModel model;
    FoodOrganization foodOrg;
    String meal;
    String type;
    String food;
    Double price;
    FoodItems selectedFoodItem;
    FoodOrganizationWorkRequest request;
    JSplitPane servicesSplitPane;
    boolean flag = false;
    
    public OrderMeal(JPanel userProcessContainer, EcoSystem business, UserAccount userAccount,JSplitPane servicesSplitPane) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = business;
        this.userAccount = userAccount;
        this.servicesSplitPane = servicesSplitPane;
        model = new DefaultTableModel();
        MenujTable1.setModel(model);
        model.addColumn("Meal");
        model.addColumn("Type");
        model.addColumn("Food Items");
        model.addColumn("Price");
        
        //foodOrg = system.getNetwork().getEnterpriseDirectory().getEnterpriseByType("FoodAndEssentials", "Food Organization");
        //System.out.println("yo>>"+foodOrg.toString());
        for (Organization organization : system.getNetwork().getEnterpriseDirectory().getEnterprise("FoodAndEssentials").getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof FoodOrganization) {
                foodOrg = ((FoodOrganization) organization);
                System.out.println("or list " + foodOrg.getWorkQueue().getWorkRequestList().size());
                break;
            }
        }
        //foodOrg = new FoodOrganization();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        ImageHeader1 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        QuantityjTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MenujTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        PlaceOrder = new javax.swing.JButton();
        OKjButton = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setAutoscrolls(true);
        setPreferredSize(new java.awt.Dimension(1254, 1000));
        setSize(new java.awt.Dimension(1254, 1000));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(110, 89, 222));

        Title1.setBackground(new java.awt.Color(255, 255, 255));
        Title1.setFont(new java.awt.Font("STSong", 1, 62)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setText("ForYou");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ImageHeader1)
                .addGap(0, 0, 0)
                .addComponent(Title1)
                .addGap(0, 1059, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImageHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Title1))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1254, -1));

        jLabel2.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel2.setText("Order Meal");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 128, 155, 31));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Veg", "Non-Veg", "Vegan" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 220, 166, -1));

        jLabel3.setFont(new java.awt.Font("STSong", 0, 18)); // NOI18N
        jLabel3.setText("Type of Meal:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 216, 110, 31));

        jLabel4.setFont(new java.awt.Font("STSong", 0, 18)); // NOI18N
        jLabel4.setText("Quantity:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 507, 110, 31));
        add(QuantityjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 510, 166, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add To Cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 544, 179, 40));

        MenujTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Meal", "Type", "Food Items", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        MenujTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenujTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MenujTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 319, -1, 176));

        jLabel5.setFont(new java.awt.Font("STSong", 0, 18)); // NOI18N
        jLabel5.setText("Meal:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 173, 110, 31));

        PlaceOrder.setBackground(new java.awt.Color(0, 0, 0));
        PlaceOrder.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        PlaceOrder.setForeground(new java.awt.Color(255, 255, 255));
        PlaceOrder.setText("Place Order");
        PlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderActionPerformed(evt);
            }
        });
        add(PlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 173, 154, 40));

        OKjButton.setBackground(new java.awt.Color(0, 0, 0));
        OKjButton.setForeground(new java.awt.Color(255, 255, 255));
        OKjButton.setText("Search");
        OKjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKjButtonActionPerformed(evt);
            }
        });
        add(OKjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 261, 150, 40));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Breakfast", "Lunch", "Dinner" }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 177, 166, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/meal2.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 360, -1, 290));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/mealdelivery1.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void OKjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKjButtonActionPerformed
        // TODO add your handling code here:
        
        if(jComboBox1.getSelectedItem() != null && jComboBox1.getSelectedItem() != null){
        System.out.println("selected>>>"+jComboBox1.getSelectedItem().toString());
        if(jComboBox2.getSelectedItem().toString().equals("Breakfast") && jComboBox1.getSelectedItem().toString().equals("Veg")){
            List<FoodItems> foodList = foodOrg.getVegBreakfastList();
            for(int i = 0; i < foodList.size();i++){
                model.addRow(new Object[]{
                foodList.get(i).getMeal(),
                foodList.get(i).getType(),
                foodList.get(i).getFoodItemsName(),
                foodList.get(i).getPrice()
                });
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Breakfast") && jComboBox1.getSelectedItem().toString().equals("Non-Veg")){
            List<FoodItems> foodList = foodOrg.getNonvegBreakfastList();
            for(int i = 0; i < foodList.size();i++){
                model.addRow(new Object[]{
                foodList.get(i).getMeal(),
                foodList.get(i).getType(),
                foodList.get(i).getFoodItemsName(),
                foodList.get(i).getPrice()
                });
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Breakfast") && jComboBox1.getSelectedItem().toString().equals("Vegan")){
            List<FoodItems> foodList = foodOrg.getVeganBreakfastList();
            for(int i = 0; i < foodList.size();i++){
                model.addRow(new Object[]{
                foodList.get(i).getMeal(),
                foodList.get(i).getType(),
                foodList.get(i).getFoodItemsName(),
                foodList.get(i).getPrice()
                });
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Lunch") && jComboBox1.getSelectedItem().toString().equals("Veg")){
            List<FoodItems> foodList = foodOrg.getVegLunchList();
            for(int i = 0; i < foodList.size();i++){
                model.addRow(new Object[]{
                foodList.get(i).getMeal(),
                foodList.get(i).getType(),
                foodList.get(i).getFoodItemsName(),
                foodList.get(i).getPrice()
                });
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Lunch") && jComboBox1.getSelectedItem().toString().equals("Non-Veg")){
            List<FoodItems> foodList = foodOrg.getNonvegLunchList();
            for(int i = 0; i < foodList.size();i++){
                model.addRow(new Object[]{
                foodList.get(i).getMeal(),
                foodList.get(i).getType(),
                foodList.get(i).getFoodItemsName(),
                foodList.get(i).getPrice()
                });
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Lunch") && jComboBox1.getSelectedItem().toString().equals("Vegan")){
            List<FoodItems> foodList = foodOrg.getVeganLunchList();
            for(int i = 0; i < foodList.size();i++){
                model.addRow(new Object[]{
                foodList.get(i).getMeal(),
                foodList.get(i).getType(),
                foodList.get(i).getFoodItemsName(),
                foodList.get(i).getPrice()
                });
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Dinner") && jComboBox1.getSelectedItem().toString().equals("Veg")){
            List<FoodItems> foodList = foodOrg.getVegDinnerList();
            for(int i = 0; i < foodList.size();i++){
                model.addRow(new Object[]{
                foodList.get(i).getMeal(),
                foodList.get(i).getType(),
                foodList.get(i).getFoodItemsName(),
                foodList.get(i).getPrice()
                });
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Dinner") && jComboBox1.getSelectedItem().toString().equals("Non-Veg")){
            List<FoodItems> foodList = foodOrg.getNonvegDinnerList();
            for(int i = 0; i < foodList.size();i++){
                model.addRow(new Object[]{
                foodList.get(i).getMeal(),
                foodList.get(i).getType(),
                foodList.get(i).getFoodItemsName(),
                foodList.get(i).getPrice()
                });
            }
        }else if(jComboBox2.getSelectedItem().toString().equals("Dinner") && jComboBox1.getSelectedItem().toString().equals("Vegan")){
            List<FoodItems> foodList = foodOrg.getVeganDinnerList();
            for(int i = 0; i < foodList.size();i++){
                model.addRow(new Object[]{
                foodList.get(i).getMeal(),
                foodList.get(i).getType(),
                foodList.get(i).getFoodItemsName(),
                foodList.get(i).getPrice()
                });
            }
        }
        }else{
            JOptionPane.showMessageDialog(null, "Select Option");
        }
        
//        model.addRow(new Object[]{
//                StudentNameTextField.getText(),
//                AgeText.getText(),
//                phoneText.getText(),
//                emailText.getText(),
//                addressText.getText(),
//                d1.getName()
//        });
    }//GEN-LAST:event_OKjButtonActionPerformed

    private void MenujTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenujTable1MouseClicked
        // TODO add your handling code here:
        int index = MenujTable1.getSelectedRow();
        System.out.println("selectedrow>>>>"+index);
        DefaultTableModel model = (DefaultTableModel) MenujTable1.getModel();
       // updateName.setText(model.getValueAt(index, 0).toString());
        meal = model.getValueAt(index, 0).toString();
        type = model.getValueAt(index, 1).toString();
        food = model.getValueAt(index, 2).toString();
        price = Double.parseDouble(model.getValueAt(index, 3).toString());
        
        selectedFoodItem = foodOrg.getFoodItemByName(meal, type, food);
        
        System.out.println(">>>"+selectedFoodItem.getMeal()+" >>>"+selectedFoodItem.getType()+" >>>"+selectedFoodItem.getFoodItemsName()+ " >>>"+selectedFoodItem.getPrice());
    }//GEN-LAST:event_MenujTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(!QuantityjTextField.getText().equals("") && selectedFoodItem != null){
        System.out.println("work size>>>"+userAccount.getWorkQueue().getWorkRequestList().size());
        for(int i = userAccount.getWorkQueue().getWorkRequestList().size()-1; i >= 0 ; i-- ){
            if(userAccount.getWorkQueue().getWorkRequestList().get(i).getReqType().equals(foodOrg.getName())){
                if(userAccount.getWorkQueue().getWorkRequestList().get(i).getStatus().equals("Completed")){
                    request = new FoodOrganizationWorkRequest();
                    request.setReqType(foodOrg.getName());
                    request.setSender(userAccount);
                    request.getFoodList().add(selectedFoodItem);
                    request.setStatus("Incomplete");
                    request.getFoodList().get(request.getFoodList().size()-1).setQuantity(Integer.parseInt(QuantityjTextField.getText()));
                    request.setTotal(price * Integer.parseInt(QuantityjTextField.getText()));
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                    flag = true;
                }else if(userAccount.getWorkQueue().getWorkRequestList().get(i).getStatus().equals("Incomplete")){
                    request = (FoodOrganizationWorkRequest)userAccount.getWorkQueue().getWorkRequestList().get(i);
                    request.getFoodList().add(selectedFoodItem);
                    request.getFoodList().get(request.getFoodList().size()-1).setQuantity(Integer.parseInt(QuantityjTextField.getText()));
                    double total = request.getTotal() + (price * Integer.parseInt(QuantityjTextField.getText()));
                    request.setTotal(total);
                    flag = true;
                }
                break;
            }
        }
        
        if(flag == false){
            request = new FoodOrganizationWorkRequest();
            request.setReqType(foodOrg.getName());
            request.setSender(userAccount);
            request.getFoodList().add(selectedFoodItem);
            request.setStatus("Incomplete");
            request.getFoodList().get(request.getFoodList().size()-1).setQuantity(Integer.parseInt(QuantityjTextField.getText()));
            request.setTotal(price * Integer.parseInt(QuantityjTextField.getText()));
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        JOptionPane.showMessageDialog(null, "ADDED TO CART SUCCESSFULLY!");
            QuantityjTextField.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "SELECT AN ITEM AND THEN QUANTITY TO PROCEED");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderActionPerformed
        // TODO add your handling code here:
        PlaceMealOrder placeOrder = new PlaceMealOrder(userProcessContainer, system ,userAccount,foodOrg, request,servicesSplitPane);
        servicesSplitPane.setRightComponent(placeOrder);
    }//GEN-LAST:event_PlaceOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageHeader1;
    private javax.swing.JTable MenujTable1;
    private javax.swing.JButton OKjButton;
    private javax.swing.JButton PlaceOrder;
    private javax.swing.JTextField QuantityjTextField;
    private javax.swing.JLabel Title1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}