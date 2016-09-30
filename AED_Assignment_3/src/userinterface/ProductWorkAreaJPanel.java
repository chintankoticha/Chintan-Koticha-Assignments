/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import business.ProductCatalogDirectory;
import business.VendorCatalogDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Chintan
 */
public class ProductWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private ProductCatalogDirectory productCatalogDirectory;
    private VendorCatalogDirectory vendorCatalogDirectory;
    /**
     * Creates new form ProductWorkAreaJPanel
     */
    public ProductWorkAreaJPanel(JPanel userProcessContainer, ProductCatalogDirectory productCatalogDirectory, VendorCatalogDirectory vendorCatalogDirectory) {
       initComponents();
       this.userProcessContainer=userProcessContainer;
       this.productCatalogDirectory=productCatalogDirectory;
       this.vendorCatalogDirectory=vendorCatalogDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCustomerLogin = new javax.swing.JButton();
        btnVendorLogin = new javax.swing.JButton();
        lblCustomerDesc = new javax.swing.JLabel();
        lblManagerDesc = new javax.swing.JLabel();
        btnManagerLogin = new javax.swing.JButton();
        lblManagerDesc1 = new javax.swing.JLabel();

        btnCustomerLogin.setText("Customer");
        btnCustomerLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerLoginActionPerformed(evt);
            }
        });

        btnVendorLogin.setText("Vendor");
        btnVendorLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendorLoginActionPerformed(evt);
            }
        });

        lblCustomerDesc.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        lblCustomerDesc.setText("Continue as Free Guest");

        lblManagerDesc.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        lblManagerDesc.setText("Log-in as a Vendor");

        btnManagerLogin.setText("Manager");
        btnManagerLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerLoginActionPerformed(evt);
            }
        });

        lblManagerDesc1.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        lblManagerDesc1.setText("Log-in as a Manager");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnManagerLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCustomerLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(btnVendorLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCustomerDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(lblManagerDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblManagerDesc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCustomerLogin, btnVendorLogin});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCustomerDesc, lblManagerDesc});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCustomerLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(lblCustomerDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVendorLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblManagerDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManagerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblManagerDesc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCustomerLogin, btnManagerLogin, btnVendorLogin});

    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerLoginActionPerformed
        // TODO add your handling code here:
        CustomerAccountJPanel panel = new CustomerAccountJPanel(userProcessContainer, productCatalogDirectory);
        userProcessContainer.add("CustomerAccountJPanel", panel);
        CardLayout layout= (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCustomerLoginActionPerformed

    private void btnVendorLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendorLoginActionPerformed
        // TODO add your handling code here:
        VendorSelectAccountJPanel panel = new VendorSelectAccountJPanel(userProcessContainer, productCatalogDirectory);
        userProcessContainer.add("ManagerAccountJPanel", panel);
        CardLayout layout= (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnVendorLoginActionPerformed

    private void btnManagerLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerLoginActionPerformed
        // TODO add your handling code here:
        VendorSelectAccountJPanel panel = new VendorSelectAccountJPanel(userProcessContainer, productCatalogDirectory);
        userProcessContainer.add("ManagerAccountJPanel", panel);
        CardLayout layout= (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagerLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerLogin;
    private javax.swing.JButton btnManagerLogin;
    private javax.swing.JButton btnVendorLogin;
    private javax.swing.JLabel lblCustomerDesc;
    private javax.swing.JLabel lblManagerDesc;
    private javax.swing.JLabel lblManagerDesc1;
    // End of variables declaration//GEN-END:variables
}
