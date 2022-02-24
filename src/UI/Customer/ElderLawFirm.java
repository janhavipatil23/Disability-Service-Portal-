/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author devikamujgule
 */
public class ElderLawFirm extends javax.swing.JPanel {

    /**
     * Creates new form ElderLawFirm
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount userAccount;
    JSplitPane servicesSplitPane;
    
    public ElderLawFirm(JPanel userProcessContainer,EcoSystem system, UserAccount userAccount,JSplitPane servicesSplitPane) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.servicesSplitPane = servicesSplitPane;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader = new javax.swing.JPanel();
        ImageHeader = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1_content1 = new javax.swing.JLabel();
        jButton_bookLawAppointment1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel_lawImage1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelHeader.setBackground(new java.awt.Color(110, 89, 222));

        Title.setFont(new java.awt.Font("STSong", 1, 62)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("ForYou");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addComponent(ImageHeader)
                .addGap(20, 20, 20)
                .addComponent(Title)
                .addGap(0, 1486, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Title)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1701, 110));

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));

        jLabel1_content1.setBackground(new java.awt.Color(54, 33, 89));
        jLabel1_content1.setFont(new java.awt.Font("Palatino", 0, 16)); // NOI18N
        jLabel1_content1.setForeground(new java.awt.Color(255, 255, 255));

        jButton_bookLawAppointment1.setBackground(new java.awt.Color(255, 255, 255));
        jButton_bookLawAppointment1.setFont(new java.awt.Font("Palatino", 1, 18)); // NOI18N
        jButton_bookLawAppointment1.setForeground(new java.awt.Color(51, 51, 51));
        jButton_bookLawAppointment1.setText("BOOK OUR TEAM TO SPEAK AT YOUR LOCATION");
        jButton_bookLawAppointment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_bookLawAppointment1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Palatino", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_content1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton_bookLawAppointment1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_content1)
                .addGap(90, 90, 90)
                .addComponent(jButton_bookLawAppointment1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 338, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 740, 660));

        jLabel_lawImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/law.png"))); // NOI18N
        add(jLabel_lawImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 240, 351));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_bookLawAppointment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_bookLawAppointment1ActionPerformed
        // TODO add your handling code here:
        BookLawAppointment law = new BookLawAppointment(userProcessContainer, system, userAccount, servicesSplitPane);
        servicesSplitPane.setRightComponent(law);
    }//GEN-LAST:event_jButton_bookLawAppointment1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageHeader;
    private javax.swing.JLabel Title;
    private javax.swing.JButton jButton_bookLawAppointment1;
    private javax.swing.JLabel jLabel1_content1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_lawImage1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelHeader;
    // End of variables declaration//GEN-END:variables
}