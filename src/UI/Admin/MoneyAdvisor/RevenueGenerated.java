/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Admin.MoneyAdvisor;

import UI.Admin.Law.*;
import UI.Admin.Food.*;
import UI.Admin.*;
import Business.EcoSystem;
import Business.Organizations.AllRevenueMap;
import Business.Organizations.FoodOrganization;
import Business.Organizations.LegalServicesOrganization;
import Business.Organizations.MoneyManagementOrganization;
import Business.Organizations.Organization;
import Business.Organizations.RevenueMap;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author devikamujgule
 */
public class RevenueGenerated extends javax.swing.JPanel {

    /**
     * Creates new form RevenueGenerated
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    EcoSystem system;
    JSplitPane adminSplitPane;
    Organization organization;
    MoneyManagementOrganization moneyOrg;
    int m1 = 0;
    int m2 = 0;
    int y1 = 0;
    int y2 = 0;
    
    //HashMap map = new HashMap();
    List<RevenueMap> map;
    public RevenueGenerated(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system, JSplitPane adminSplitPane, MoneyManagementOrganization moneyOrg) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.moneyOrg = moneyOrg;
        
//        if(organization.getName().equals("Food Organization")){
//                foodOrg = ((FoodOrganization) organization);
//                System.out.println("foodOrg name>>"+foodOrg.getName());
//        }else{
//            System.out.println("something is wrong");
//        }
        
        //foodOrg.generateRevMap();
        map = moneyOrg.getRevMap();
          
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        
        for(int i =0; i < map.size(); i++){
            if(map.get(i).getYear() == 2021){
                dcd.setValue(map.get(i).getRevenue(), "Sales", map.get(i).getMonth());
            }
        }
     
        //JFreeChart chart = ChartFactory.createBarChart("color report", "color", "val", dcd, PlotOrientation.VERTICAL, true, true, true);
        JFreeChart chart = ChartFactory.createLineChart("Sales Report", "Sales", "Revenue", dcd, PlotOrientation.VERTICAL, true, true, true);
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);
        
        ChartPanel chartPn = new ChartPanel(chart);
        jPanel2.removeAll();
        jPanel2.add(chartPn);
        jPanel2.updateUI();
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        revenueText = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addGap(0, 820, Short.MAX_VALUE))
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

        add(HeaderPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1035, -1));

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(jPanel2);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 198, 518, 223));

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel5.setText("Date:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 303, 112, 23));

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel6.setText("From:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 148, 112, 23));

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel7.setText("Revenue:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 348, 112, 23));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 391, 149, 30));
        add(revenueText, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 347, 151, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 303, 151, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Palatino", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Show");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 233, 150, 30));

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel8.setText("Add Revenue");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 275, -1, 23));
        add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 148, 145, -1));

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel9.setText("To:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 192, 112, 23));
        add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 192, 145, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String date = jDateChooser1.getDate().toString();
        String[] d = date.split(" ");
        System.out.println("date>>"+date);
        if(date.equals("") || revenueText.getText().equals("")){
            JOptionPane.showMessageDialog(null, "invalid input");
        }else{
            List<String> fullDate = Arrays.asList(d[d.length -1], d[1]);
            double val = Double.parseDouble(revenueText.getText());
            updateData(fullDate, val);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String fromDate = jDateChooser2.getDate().toString();
        String toDate = jDateChooser3.getDate().toString();
        String[] d1 = fromDate.split(" ");
        System.out.println("datefrom>>"+fromDate);
        y1 = Integer.parseInt(d1[d1.length -1]);
        m1 = giveMonth(d1[1]);
        System.out.println("mo1>>"+d1[1]);
        System.out.println("m1>>"+m1);
        String[] d2 = toDate.split(" ");
        System.out.println("dateto>>"+toDate);
        y2 = Integer.parseInt(d2[d2.length -1]);
        m2 = giveMonth(d2[1]);
        System.out.println("mo2>>"+ d2[1]);
        System.out.println("m2>>"+m2);
        
        DefaultCategoryDataset dcd2 = new DefaultCategoryDataset();
        
        for(int i =0; i < map.size(); i++){
            System.out.println("for>>");
            System.out.println("map y>>"+map.get(i).getYear() + ">>>"+y1);
            System.out.println("map m>>"+map.get(i).getMon() + ">>>"+m1);
            System.out.println("map y>>"+map.get(i).getYear() + ">>>"+y2);
            System.out.println("map m>>"+map.get(i).getMon() + ">>>"+m2);
            
            if((map.get(i).getYear() == y1 && map.get(i).getMon() >= m1) || (map.get(i).getYear() == y2 && map.get(i).getMon() <= m2)){
                    System.out.println("if>>");
                    dcd2.setValue(map.get(i).getRevenue(), "Sales", map.get(i).getMonth());
                //}
            }
//            if((map.get(i).getYear() >= Integer.parseInt(fullDate1.get(0)) && map.get(i).getMon() >= m1){
//                    if(map.get(i).getYear().equals(fullDate2.get(0)) && map.get(i).getMon() <= m2)){
//                System.out.println("if>>");
               // dcd2.setValue(map.get(i).getRevenue(), "Sales", map.get(i).getMonth());
        }
        
        
        //JFreeChart chart = ChartFactory.createBarChart("color report", "color", "val", dcd, PlotOrientation.VERTICAL, true, true, true);
        JFreeChart chart2 = ChartFactory.createLineChart("Sales Report", "Sales", "Revenue", dcd2, PlotOrientation.VERTICAL, true, true, true);
        CategoryPlot plot2 = chart2.getCategoryPlot();
        plot2.setRangeGridlinePaint(Color.BLACK);
        
        ChartPanel chartPn2 = new ChartPanel(chart2);
        jPanel2.removeAll();
        jPanel2.add(chartPn2);
        jPanel2.updateUI();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeaderPanel3;
    private javax.swing.JLabel ImageHeader4;
    private javax.swing.JLabel Title4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField revenueText;
    // End of variables declaration//GEN-END:variables

    private void updateData(List<String> fullDate, double val) {
        
        for(int i =0; i < map.size(); i++){
            if(map.get(i).getYear() == Integer.parseInt(fullDate.get(0)) && map.get(i).getMonth().equals(fullDate.get(1))){
                double r = map.get(i).getRevenue() + val;
                map.get(i).setRevenue(r);
            }
        }
        
        updateChart();
    }

    private void updateChart() {
        DefaultCategoryDataset dcd1 = new DefaultCategoryDataset();
        
        for(int i =0; i < map.size(); i++){
            if(map.get(i).getYear() == 2021){
                dcd1.setValue(map.get(i).getRevenue(), "Sales", map.get(i).getMonth());
            }
        }
        
        //JFreeChart chart = ChartFactory.createBarChart("color report", "color", "val", dcd, PlotOrientation.VERTICAL, true, true, true);
        JFreeChart chart1 = ChartFactory.createLineChart("Sales Report", "Sales", "Revenue", dcd1, PlotOrientation.VERTICAL, true, true, true);
        CategoryPlot plot1 = chart1.getCategoryPlot();
        plot1.setRangeGridlinePaint(Color.BLACK);
        
        ChartPanel chartPn1 = new ChartPanel(chart1);
        jPanel2.removeAll();
        jPanel2.add(chartPn1);
        jPanel2.updateUI();
    }

    private int giveMonth(String mon) {
         int m = 0;
        if(mon.equals("Jan")){
            m = 1;
        }else if(mon.equals("Feb")){
            m = 2;
        }else if(mon.equals("Mar")){
            m = 3;
        }else if(mon.equals("Apr")){
            m = 4;
        }else if(mon.equals("May")){
            m = 5;
        }else if(mon.equals("Jun")){
            m = 6;
        }else if(mon.equals("Jul")){
            m = 7;
        }else if(mon.equals("Aug")){
            m = 8;
        }else if(mon.equals("Sep")){
            m = 9;
        }else if(mon.equals("Oct")){
            m = 10;
        }else if(mon.equals("Nov")){
            m = 11;
        }else if(mon.equals("Dec")){
            m = 12;
        }
        return m;
    }
    
}
