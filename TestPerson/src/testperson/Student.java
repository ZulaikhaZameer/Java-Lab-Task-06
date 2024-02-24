/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testperson;

/**
 *
 * @author Zulaikha
 */
public class Student extends Person{
    private int id;
    private String course;
    private String teacherName;

    public Student(String firstName, String lastName, int id, String course, String teacherName) {
        super(firstName, lastName);
        this.id = id;
        this.course = course;
        this.teacherName = teacherName;
    }
    public int getId() {
        return id;
    }
    public String getCourse() {
        return course;
    }
    public String getTeacherName() {
        return teacherName;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Student details: ");
        System.out.println("Id: "+ id);
        System.out.println("Course: "+ course);
        System.out.println("Teacher's name: "+ teacherName);
    }
}