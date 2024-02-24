/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aggregation;

/**
 *
 * @author Zulaikha
 */

public class Store {
    private String storeName;
    private String location;
    private Product productList[] = new Product[100];
    private int nbProduct;

    public Store(String storeName, String location) {
        this.storeName = storeName;
        this.location = location;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getLocation() {
        return location;
    }
    public void addProduct(Product p){
        productList[nbProduct] = p;
        nbProduct++;
    }
    public void display(){
        for(int i=0; i<nbProduct; i++){
            if (productList[i] != null) {
                System.out.println("Name: "+ productList[i].getProductName());
                System.out.println("Quantity: "+ productList[i].getQuantity());
                System.out.println("Price: "+ productList[i].getPrice());
            }
        }
    }
    public boolean searchProduct(String searchProduct){
        boolean isFound = false;
        for(int i=0; i<nbProduct; i++){
            if(productList[i].getProductName().trim().equalsIgnoreCase(searchProduct.trim())){
                isFound = true;
                break;
            }
        }
        return isFound;
    }
    public void deleteProduct(String deleteProduct){
        int newIndex = 0;
        Product newList[] = new Product[99];
        for(int i=0; i<nbProduct; i++){
            if(!productList[i].getProductName().trim().equalsIgnoreCase(deleteProduct)){
                newList[newIndex] = productList[i];
                newIndex++;
            }
        }
        productList = newList;
    }
}

