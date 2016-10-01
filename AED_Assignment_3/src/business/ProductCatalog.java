package business;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chintan
 */
public class ProductCatalog {

    private String productName;
    private String modelNumber;
    private String vendorName;
    private String productDescriptionStatement;
    float basePrice;
    float ceilPrice;
    float floorPrice;
    private String features;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getProductDescriptionStatement() {
        return productDescriptionStatement;
    }

    public void setProductDescriptionStatement(String productDescriptionStatement) {
        this.productDescriptionStatement = productDescriptionStatement;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public float getCeilPrice() {
        return ceilPrice;
    }

    public void setCeilPrice(float ceilPrice) {
        this.ceilPrice = ceilPrice;
    }

    public float getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(float floorPrice) {
        this.floorPrice = floorPrice;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    @Override
    public String toString() {
        this.productName = productName;
        return productName;
    }

}
