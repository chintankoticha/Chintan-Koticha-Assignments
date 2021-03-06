/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import business.ProductCatalog;
import business.ProductCatalogDirectory;
import business.VendorCatalogDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chintan
 */
public class VendorCatalogJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ProductCatalogDirectory productCatalogDirectory;
    private VendorCatalogDirectory vendorCatalogDirectory;
    String vendorCatalogSelected;

    /**
     * Creates new form ManageCatalogJPanel
     */
    public VendorCatalogJPanel(JPanel userProcessContainer, ProductCatalogDirectory productCatalogDirectory, VendorCatalogDirectory vendorCatalogDirectory, String vendorCatalogSelected) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.productCatalogDirectory = productCatalogDirectory;
        this.vendorCatalogDirectory = vendorCatalogDirectory;
        this.vendorCatalogSelected = vendorCatalogSelected;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblManageTable.getModel();
        dtm.setRowCount(0);

        for (ProductCatalog productCatalog : productCatalogDirectory.getProductCatalogList()) {
            if (productCatalog.getVendorName().equals(vendorCatalogSelected)) {
                Object[] row = new Object[6];
                row[0] = productCatalog;
                row[1] = productCatalog.getModelNumber();
                row[2] = productCatalog.getVendorName();
                row[3] = productCatalog.getBasePrice();
                row[4] = productCatalog.getCeilPrice();
                row[5] = productCatalog.getFloorPrice();

                dtm.addRow(row);
            }
        }

        if (tblManageTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No Products by this vendor as of now!!!");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageTable = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        tblManageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Model Number", "Vendor Name", "Base Price", "Ceil Price", "Floor Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManageTable);

        btnViewDetails.setText("VIEW DETAILS");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnBack.setText("< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE ENTRY");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCreate.setText("Create a Product");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel1.setText("MANAGE YOUR CATALOG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(337, 337, 337)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnViewDetails)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDetails)
                    .addComponent(btnDelete))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnCreate))
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateCatalogJPanel panel = new CreateCatalogJPanel(userProcessContainer, productCatalogDirectory, vendorCatalogSelected);
        userProcessContainer.add("CreateCatalogJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManageTable.getSelectedRow();
        if (selectedRow >= 0) {
            ProductCatalog productCatalog = (ProductCatalog) tblManageTable.getValueAt(selectedRow, 0);
            ViewVendorDetailsJPanel panel = new ViewVendorDetailsJPanel(userProcessContainer, productCatalog);
            userProcessContainer.add("ViewManagerDetailsJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManageTable.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete??", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                ProductCatalog productCatalog = (ProductCatalog) tblManageTable.getValueAt(selectedRow, 0);
                productCatalogDirectory.delete(productCatalog);
                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManageTable;
    // End of variables declaration//GEN-END:variables
}
