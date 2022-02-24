/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import UI.Admin.Food.OrganizationAdminJpanel;
import UI.Employee.OrganizationEmployeePanel;

/**
 *
 * @author devika
 */
public class FoodManagerRole extends Role {
    String type;
    public FoodManagerRole() {
    }
    
    public FoodManagerRole(String type) {
        this.type = type;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        if (type.equalsIgnoreCase("admin")) {
            return new OrganizationAdminJpanel(userProcessContainer, account, organization, business);
        }
        return new OrganizationEmployeePanel(userProcessContainer, account, organization, business);
    }
}
