/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testperson;

/**
 *
 * @author Zulaikha
 */
public class TestPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student("Zulaikha", "Zameer", 1, "OOP", "Sir Saleem");
        Student s2 = new Student("Alina", "Waseem", 2, "PF", "Miss Sofia");
        
        Teacher t1 = new Teacher("Sir", "Saleem", "OOP", 90000);
        Teacher t2 = new Teacher("Miss", "Sofia", "PF", 80000);
        
        s1.displayDetails();
        System.out.println("--------------------");
        s2.displayDetails();
        System.out.println("--------------------");
        t1.displayDetails();
        System.out.println("--------------------");
        t2.displayDetails();
    }
}
