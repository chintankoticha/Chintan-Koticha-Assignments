package UserInterface.SupplierRole;

import Business.Product;
import UserInterface.AdminstrativeRole.ManageSuppliers;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class ViewProductDetailJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Product product;
    public ViewProductDetailJPanel(JPanel upc, Product p) {
        initComponents();
        userProcessContainer = upc;
        product = p;
        txtName.setText(p.getProdName());
        txtId.setText(String.valueOf(p.getModelNumber()));
        txtPrice1.setText(String.valueOf(p.getPrice()));
        availability.setText(String.valueOf(p.getAvail()));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        availability = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPrice1 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Product Detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Product Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 159, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Availability");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 30));

        availability.setEditable(false);
        availability.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        availability.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(availability, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 159, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("Update Product");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 176, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 159, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Product ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 30));

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 70, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Product Price:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 30));

        txtPrice1.setEditable(false);
        txtPrice1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPrice1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 159, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        //txtId.setEditable(true);
        txtName.setEditable(true);
        txtPrice1.setEditable(true);
        availability.setEditable(true);
        btnSave.setEnabled(true);
}//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

      private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try
        {
        product.setPrice(Integer.parseInt(txtPrice1.getText()));
        product.setProdName(txtName.getText());
        product.setAvail(Integer.parseInt(availability.getText()));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please don't leave any fields blank!");}
    }//GEN-LAST:event_btnSaveActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availability;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice1;
    // End of variables declaration//GEN-END:variables
}
