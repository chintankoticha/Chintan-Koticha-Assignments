/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author Chintan
 */
public class VendorCatalogDirectory {
    public ArrayList<VendorCatalog> vendorsList;

    public VendorCatalogDirectory() {
       this.vendorsList = new ArrayList<VendorCatalog>();
    }

    public ArrayList<VendorCatalog> getVendorsList() {
        return vendorsList;
    }

    public void setVendorsList(ArrayList<VendorCatalog> vendorsList) {
        this.vendorsList = vendorsList;
    } 
    
    public VendorCatalog addVendorCatalog(){
        VendorCatalog vendorCatalog = new VendorCatalog();
        vendorsList.add(vendorCatalog);
        return vendorCatalog;
    }
    
    public void delete(VendorCatalog vendorCatalog){
        vendorsList.remove(vendorCatalog);
    }    
}
