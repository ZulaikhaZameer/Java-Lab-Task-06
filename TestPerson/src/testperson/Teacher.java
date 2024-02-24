/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testperson;

/**
 *
 * @author Zulaikha
 */
public class Teacher extends Person{
    private String subjectName;
    private int salary;

    public Teacher(String firstName, String lastName, String subjectName, int salary) {
        super(firstName, lastName);
        this.subjectName = subjectName;
        this.salary = salary;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Teacher details: ");
        System.out.println("Subject name: "+ subjectName);
        System.out.println("Salary: "+ salary);
    }
}
