/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc.studentmanagementapp;

/**
 *
 * @author Student
 */
class Student extends Person {
    private int[] marks;

    public Student(String name, int age, int[] marks) {
        super(name, age); // call Person constructor
        this.marks = marks;
    }

    // Calculate average marks
    public double getAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    // Print student report
    public void printReport() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage: " + getAverage());
        System.out.println("----------------------------");
    }
}
