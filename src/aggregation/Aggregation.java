/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aggregation;

/**
 *
 * @author Zulaikha
 */

import java.util.Scanner;
public class Aggregation {

    public static void main(String[] args) {
        Product p1 = new Product("Cakes", 4, 2000);
        Product p2 = new Product("Chocolates", 5, 1000);
        Product p3 = new Product("Ice cream", 6, 500);
        
        Store s1 = new Store("Imtiaz", "Karachi");
        Store s2 = new Store("Hyperstar", "Karachi");
        s1.addProduct(p1);
        s1.addProduct(p2);
        s1.addProduct(p3);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product you want to search: ");
        String searchProduct = sc.nextLine();
        if(s1.searchProduct(searchProduct)){
            System.out.println(searchProduct +" is available in store \n----------------------------------------");
        }
        else System.out.println(searchProduct +" is not available in store \n----------------------------------------");
        
        System.out.println("Enter the product you want to delete: ");
        String deleteProduct = sc.nextLine();
        if (s1.searchProduct(deleteProduct)) {
            s1.deleteProduct(deleteProduct);
            System.out.println(deleteProduct + " deleted successfully.\n----------------------------------------");
        } else {
            System.out.println(deleteProduct + " is not available in store. Cannot be deleted.\n----------------------------------------");
        }
        s1.display();
        
        Company c = new Company("MyCompany");
        c.addStore(s1);
        c.addStore(s2);
        
        System.out.println("Enter the product you want to search in stores: ");
        String productInStore = sc.nextLine();
        int storeCount = c.searchNbofStore(productInStore);
        System.out.println("Number of stores containing " + productInStore + ": " + storeCount + "\n----------------------------------------");

        c.displayAll();
    }
    
}
