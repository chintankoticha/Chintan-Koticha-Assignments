package business;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Chintan
 */
public class ProductCatalogDirectory {
    public ArrayList<ProductCatalog> productsList;

    public ProductCatalogDirectory() {
       this.productsList = new ArrayList<ProductCatalog>();
    }

    public ArrayList<ProductCatalog> getProductCatalogList() {
        return productsList;
    }

    public void setProductCatalogList(ArrayList<ProductCatalog> productsList) {
        this.productsList = productsList;
    } 
    
    public ProductCatalog addProductCatalog(){
        ProductCatalog productcatalog = new ProductCatalog();
        productsList.add(productcatalog);
        return productcatalog;
    }
    
    public void delete(ProductCatalog productcatalog){
        productsList.remove(productcatalog);
    }
    
    /*public ProductCatalog searchProducts(String accountNumber){
        for (Account account : accountList) {
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }  */
}
