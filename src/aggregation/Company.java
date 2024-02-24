/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aggregation;

/**
 *
 * @author Zulaikha
 */

public class Company {
    private String companyName;
    private Store arrayStore[] = new Store[10];
    private int nbStore;

    public Company(String companyName) {
        this.companyName = companyName;
    }
    public void addStore(Store store){
        arrayStore[nbStore] = store;
        nbStore++;
    }
    public int searchNbofStore(String productInStore) {
        int count = 0;
        for (int i = 0; i < nbStore; i++) {
            if (arrayStore[i].searchProduct(productInStore)) {
                count++;
            }
        }
        return count;
    }
    public void displayAll() {
        System.out.println("Company: " + companyName);
        System.out.println("List of Stores:");
        for (int i = 0; i < nbStore; i++) {
            System.out.println("Store Name: " + arrayStore[i].getStoreName());
            System.out.println("Location: " + arrayStore[i].getLocation());
            System.out.println("----------------------------------------");
        }
    }
}
