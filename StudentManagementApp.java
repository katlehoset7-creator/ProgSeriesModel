/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rc.studentmanagementapp;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class StudentManagementApp {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Student[] students = new Student[n]; // array of Student objects

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Number of subjects: ");
            int subjects = scanner.nextInt();

            int[] marks = new int[subjects];
            for (int j = 0; j < subjects; j++) {
                System.out.print("Mark for subject " + (j + 1) + ": ");
                marks[j] = scanner.nextInt();
                
            }
            scanner.nextLine(); // consume newline

            // Store the Student object in the array
            students[i] = new Student(name, age, marks);
        }

        // Print all student reports
        System.out.println("\n--- STUDENT REPORT ---");
        for (Student student : students) {
            student.printReport();
        }

        scanner.close();
    }
}
    
