/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import business.ProductCatalog;
import business.ProductCatalogDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Chintan
 */
public class CreateCatalogJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ProductCatalogDirectory productCatalogDirectory;
    String vendorCatalogSelected;

    /**
     * Creates new form CreateCatalogJPanel
     */
    public CreateCatalogJPanel(JPanel userProcessContainer, ProductCatalogDirectory productCatalogDirectory, String vendorCatalogSelected) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.productCatalogDirectory = productCatalogDirectory;
        this.vendorCatalogSelected = vendorCatalogSelected;
        txtVendorName.setText(vendorCatalogSelected);
        txtVendorName.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        lblModelNumber = new javax.swing.JLabel();
        lblVendorName = new javax.swing.JLabel();
        lblProductDescription = new javax.swing.JLabel();
        lblBasePrice = new javax.swing.JLabel();
        lblCeilingPrice = new javax.swing.JLabel();
        lblProdFeature = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        txtModelNumber = new javax.swing.JTextField();
        txtVendorName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFeatures = new javax.swing.JTextArea();
        txtBasePrice = new javax.swing.JTextField();
        txtCeilingPrice = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        lblFloorPrice = new javax.swing.JLabel();
        txtFloorPrice = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setText("Create Product");

        lblProductName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProductName.setText("Product Name:");
        lblProductName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblModelNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblModelNumber.setText("Model Number:");
        lblModelNumber.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblVendorName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVendorName.setText("Vendor Name:");
        lblVendorName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblProductDescription.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProductDescription.setText("Description:");
        lblProductDescription.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblBasePrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBasePrice.setText("Base Price:");
        lblBasePrice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblCeilingPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCeilingPrice.setText("Ceiling Price:");
        lblCeilingPrice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblProdFeature.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProdFeature.setText("Features:");
        lblProdFeature.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtProductName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtModelNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtVendorName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtFeatures.setColumns(20);
        txtFeatures.setLineWrap(true);
        txtFeatures.setRows(5);
        txtFeatures.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtFeatures);

        txtBasePrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtCeilingPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtDescription.setColumns(20);
        txtDescription.setLineWrap(true);
        txtDescription.setRows(5);
        txtDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(txtDescription);

        lblFloorPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFloorPrice.setText("Floor Price:");

        txtFloorPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnBack.setText("< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProductDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblVendorName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCeilingPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFloorPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVendorName, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCeilingPrice)
                            .addComponent(txtFloorPrice)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBasePrice))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProdFeature, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnReset)
                                .addGap(18, 18, 18)
                                .addComponent(btnSubmit))))
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblModelNumber))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHeader)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtModelNumber)
                                .addComponent(txtProductName)))))
                .addContainerGap(306, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBasePrice, txtCeilingPrice, txtFloorPrice, txtModelNumber, txtVendorName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblBasePrice, lblCeilingPrice, lblFloorPrice, lblModelNumber, lblProdFeature, lblProductDescription, lblProductName, lblVendorName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblHeader)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelNumber)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendorName)
                    .addComponent(txtVendorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProductDescription)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBasePrice)
                    .addComponent(txtBasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCeilingPrice)
                    .addComponent(txtCeilingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFloorPrice)
                    .addComponent(txtFloorPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProdFeature, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnSubmit))
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtBasePrice, txtCeilingPrice, txtFloorPrice, txtModelNumber, txtProductName, txtVendorName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblBasePrice, lblCeilingPrice, lblFloorPrice, lblModelNumber, lblProdFeature, lblProductDescription, lblProductName, lblVendorName});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VendorCatalogJPanel manageCatalogJPanel = (VendorCatalogJPanel) component;
        manageCatalogJPanel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String productName = txtProductName.getText();
        String modelNumber = txtModelNumber.getText();
        String features = txtFeatures.getText();
        String desc = txtDescription.getText();
        String basePriceTemp;
        String ceilPriceTemp;
        String floorPriceTemp;
        basePriceTemp = String.valueOf(txtBasePrice.getText());
        ceilPriceTemp = String.valueOf(txtCeilingPrice.getText());
        floorPriceTemp = String.valueOf(txtFloorPrice.getText());

        if (productName.isEmpty() || productName.startsWith(" ")
                || modelNumber.isEmpty() || modelNumber.startsWith(" ")
                || desc.isEmpty() || desc.startsWith(" ")
                || features.isEmpty() || features.startsWith(" ")) {
            JOptionPane.showMessageDialog(this, "All fields are mandatory!!! (make sure you dont start with spaces!)");
            return;
        }

        //Validating modelNumber
        String modelNumberPattern = "[a-zA-Z]{2}\\-\\d\\d\\d\\d";
        Pattern patternFName = Pattern.compile(modelNumberPattern);
        Matcher matchFName = patternFName.matcher(txtModelNumber.getText());
        if (!matchFName.matches()) {
            JOptionPane.showMessageDialog(this, "Please enter in appropriate format!!");
            return;
        } else {
        }

        Float basePrice;
        Float ceilPrice;
        Float floorPrice;
        if (basePriceTemp.trim().length() != 0) {
            try {
                basePrice = Float.parseFloat(txtBasePrice.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Base price can contain only numbers!!");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Base Price cannot be empty!!");
            return;
        }

        if (basePrice < 0) {
            JOptionPane.showMessageDialog(this, "BasePrice cannot be negetive!!");
            return;
        }

        if (ceilPriceTemp.trim().length() != 0) {
            try {
                ceilPrice = Float.parseFloat(txtCeilingPrice.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ceil price can contain only numbers!!");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ceil Price cannot be empty!!");
            return;
        }

        if (ceilPrice < 0) {
            JOptionPane.showMessageDialog(this, "CeilPrice cannot be negetive!!");
            return;
        } else if (ceilPrice < basePrice) {
            JOptionPane.showMessageDialog(this, "CeilPrice cannot be less then Base Price!!");
            return;
        }

        if (floorPriceTemp.trim().length() != 0) {
            try {
                floorPrice = Float.parseFloat(txtFloorPrice.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Floor price can contain only numbers!!");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Floor Price cannot be empty!!");
            return;
        }

        if (floorPrice < 0) {
            JOptionPane.showMessageDialog(this, "Floor Price cannot be negetive!!");
            return;
        } else if (floorPrice > basePrice) {
            JOptionPane.showMessageDialog(this, "Floor Price cannot be greater then Base Price!!");
            return;
        }

        //Adding to product catalog directory
        ProductCatalog productCatalog = productCatalogDirectory.addProductCatalog();

        productCatalog.setProductName(productName);
        productCatalog.setModelNumber(modelNumber);
        productCatalog.setVendorName(vendorCatalogSelected);
        productCatalog.setBasePrice(basePrice);
        productCatalog.setProductDescriptionStatement(desc);
        productCatalog.setCeilPrice(ceilPrice);
        productCatalog.setFloorPrice(floorPrice);
        productCatalog.setFeatures(features);
        JOptionPane.showMessageDialog(this, "Product Added Successully!!!");
        resetFields();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtBasePrice.setText("");
        txtCeilingPrice.setText("");
        txtDescription.setText("");
        txtFeatures.setText("");
        txtFloorPrice.setText("");
        txtModelNumber.setText("");
        txtProductName.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void resetFields() {
        txtBasePrice.setText("");
        txtCeilingPrice.setText("");
        txtDescription.setText("");
        txtFeatures.setText("");
        txtFloorPrice.setText("");
        txtModelNumber.setText("");
        txtProductName.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBasePrice;
    private javax.swing.JLabel lblCeilingPrice;
    private javax.swing.JLabel lblFloorPrice;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblModelNumber;
    private javax.swing.JLabel lblProdFeature;
    private javax.swing.JLabel lblProductDescription;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblVendorName;
    private javax.swing.JTextField txtBasePrice;
    private javax.swing.JTextField txtCeilingPrice;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextArea txtFeatures;
    private javax.swing.JTextField txtFloorPrice;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtVendorName;
    // End of variables declaration//GEN-END:variables
}
