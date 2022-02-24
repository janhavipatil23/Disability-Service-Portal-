/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.EcoSystem;
import Business.Organizations.NursingOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.NursingWorkRequest;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author devikamujgule
 */
public class NursingServices extends javax.swing.JPanel {

    /**
     * Creates new form NursingServices
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    DefaultTableModel model;
    NursingOrganization org;
    UserAccount userAccount;
    Date date;
    Date date1;

    NursingServices(JPanel userProcessContainer, 
            EcoSystem business, 
            UserAccount userAccount) {
        initComponents();
        this.userAccount = userAccount;
        model = new DefaultTableModel();
        servicesTable.setModel(model);
        model.addColumn("Category");
        model.addColumn("Price");
        this.userProcessContainer = userProcessContainer;
        this.system = business;
        System.out.println("constructor " + system.getNetwork().getEnterpriseDirectory().getEnterprise("Medical"));
        for (Organization organization : system.getNetwork().getEnterpriseDirectory().getEnterprise("Medical").getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof NursingOrganization) {
                org = ((NursingOrganization) organization);
                System.out.println("or list " + org.getWorkQueue().getWorkRequestList().size());
                break;
            }
        }
        Color ivory = new Color(255, 255, 208);
        servicesTable.setOpaque(false);
        servicesTable.setBackground(ivory);
        viewServices();
    }

    public void viewServices() {
        if (org.getServicesList().size() > 0) {
            for (String i : org.getServicesList().keySet()) {
                model.addRow(new Object[]{
                    i, org.getServicesList().get(i)
                });
            }
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

        serviceCatLabel = new javax.swing.JLabel();
        fromLabel = new javax.swing.JLabel();
        durationLabel = new javax.swing.JLabel();
        durationText = new javax.swing.JTextField();
        headerPanel = new javax.swing.JPanel();
        ImageHeader1 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        fromDateText = new com.toedter.calendar.JDateChooser();
        toLabel = new javax.swing.JLabel();
        toDateText = new com.toedter.calendar.JDateChooser();
        submitBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        servicesTable = new javax.swing.JTable();
        serviceTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_totalPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        serviceCatLabel.setFont(new java.awt.Font("STSong", 0, 18)); // NOI18N
        serviceCatLabel.setText("Choose a Category of Service");

        fromLabel.setFont(new java.awt.Font("STSong", 0, 18)); // NOI18N
        fromLabel.setText("From");

        durationLabel.setFont(new java.awt.Font("STSong", 0, 18)); // NOI18N
        durationLabel.setText("Time Duration in days");

        durationText.setEditable(false);
        durationText.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N

        headerPanel.setBackground(new java.awt.Color(110, 89, 222));

        Title1.setFont(new java.awt.Font("STSong", 1, 62)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setText("ForYou");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addComponent(ImageHeader1)
                .addGap(20, 20, 20)
                .addComponent(Title1)
                .addGap(0, 782, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImageHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Title1))
        );

        toLabel.setFont(new java.awt.Font("STSong", 0, 18)); // NOI18N
        toLabel.setText("To");

        toDateText.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                toDateTextPropertyChange(evt);
            }
        });

        submitBtn.setBackground(new java.awt.Color(0, 0, 0));
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("Add Service");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        servicesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(servicesTable);

        serviceTitle.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        serviceTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serviceTitle.setText("Nursing Services");

        jLabel1.setFont(new java.awt.Font("STSong", 0, 18)); // NOI18N
        jLabel1.setText("Total Cost :");

        jTextField_totalPrice.setEditable(false);
        jTextField_totalPrice.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/nurse.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serviceTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(191, 191, 191))
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(serviceCatLabel)
                    .addComponent(fromLabel)
                    .addComponent(toLabel)
                    .addComponent(durationLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField_totalPrice, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(durationText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addComponent(fromDateText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addComponent(toDateText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addComponent(submitBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(serviceTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(serviceCatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(durationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(durationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fromDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(toDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(153, 153, 153)
                .addComponent(submitBtn)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        date = fromDateText.getDate();
         date1 = toDateText.getDate();
         long difference = Math.abs(date.getTime() - date1.getTime());
        long noOfDays = difference / (24 * 60 * 60 * 1000);
        if (servicesTable.getSelectedRow() >= 0 && fromDateText.getDate() != null && toDateText.getDate() != null && !fromDateText.getDate().toString().isEmpty() && !toDateText.getDate().toString().isEmpty() && !durationText.getText().isEmpty()) {
            if (fromDateText.getDate().before(new Date()) || toDateText.getDate().before(new Date())) {
                JOptionPane.showMessageDialog(this, "Start date and End date should be after today");
                return;
            }
            if (!fromDateText.getDate().before(toDateText.getDate())) {
                JOptionPane.showMessageDialog(this, "End date should be after start date");
                return;
            }
            try {
                int val = Integer.parseInt(durationText.getText());
                String selectedCategory = String.valueOf(servicesTable.getValueAt(servicesTable.getSelectedRow(), 0));
                Double selectedPrice = Double.parseDouble(String.valueOf(servicesTable.getValueAt(servicesTable.getSelectedRow(), 1)));
                NursingWorkRequest request = new NursingWorkRequest();
                request.setMessage("Book a nurse");
                request.setSender(userAccount);
                request.setStatus("Sent");
                request.setFromDate(fromDateText.getDate());
                request.setToDate(toDateText.getDate());
                request.setNoOfDays(Integer.parseInt(durationText.getText()));
                request.setServiceCategory(selectedCategory);
                request.setPrice(selectedPrice * noOfDays);  
                request.setReqType(org.getName());
                if (org != null) {
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                    org.getWorkQueue().getWorkRequestList().add(request);
//                    request.setId(org.getWorkQueue().getWorkRequestList().size());
                }
                JOptionPane.showMessageDialog(this, "Service added to cart successfully");
                fromDateText.setDate(null);
                toDateText.setDate(null);
                durationText.setText("");
                jTextField_totalPrice.setText("");
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Input String cannot be parsed to Integer.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter all the details correctly");
        }

    }//GEN-LAST:event_submitBtnActionPerformed

    private void toDateTextPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_toDateTextPropertyChange
        // TODO add your handling code here:
        if(toDateText.getDate() != null && fromDateText.getDate()!=null){
         date = fromDateText.getDate();
         date1 = toDateText.getDate();
        long difference = Math.abs(date.getTime() - date1.getTime());
        long noOfDays = difference / (24 * 60 * 60 * 1000);
        Double selectedPrice = Double.parseDouble(String.valueOf(servicesTable.getValueAt(servicesTable.getSelectedRow(), 1)));
        durationText.setText(String.valueOf(noOfDays));
        jTextField_totalPrice.setText(String.valueOf(noOfDays * selectedPrice));
        }
    }//GEN-LAST:event_toDateTextPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageHeader1;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JTextField durationText;
    private com.toedter.calendar.JDateChooser fromDateText;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_totalPrice;
    private javax.swing.JLabel serviceCatLabel;
    private javax.swing.JLabel serviceTitle;
    private javax.swing.JTable servicesTable;
    private javax.swing.JButton submitBtn;
    private com.toedter.calendar.JDateChooser toDateText;
    private javax.swing.JLabel toLabel;
    // End of variables declaration//GEN-END:variables
}