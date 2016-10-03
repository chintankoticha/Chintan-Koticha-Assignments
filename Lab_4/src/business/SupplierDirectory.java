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
public class SupplierDirectory {
    
    private ArrayList<Supplier> supplierDirectory;
    
    public SupplierDirectory(){
        supplierDirectory = new ArrayList<Supplier>();
    }

    public ArrayList<Supplier> getSupplierDirectory() {
        return supplierDirectory;
    }
    
    public Supplier addSupplier(){
        Supplier supplier = new Supplier();
        supplierDirectory.add(supplier);
        return supplier;
    }
    
    public void removeSupplier(Supplier s){
       supplierDirectory.remove(s);
    }
    
    public Supplier searchSupplier(String keyword){
        for(Supplier s:supplierDirectory){
            if(s.getSupplierName().equals(keyword)){
                return s;
            }
        }
        return null;
    }
    
    
}
