
package com.college.main;

import java.util.Scanner;

import com.college.controller.StudentController;


/*

 * MainApp class


 */

public class MainApp {

    public static void main(String[] args) {
    	 // Controller object

        StudentController studentController = new StudentController();
        // Scanner for console input
        
        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n--- College Management System ---");

            System.out.println("1. Add Student");

            System.out.println("2. View Students");

            System.out.println("3. Update Student");

            System.out.println("4. Delete Student");

            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1: // CREATE

                    System.out.print("Enter Student ID: ");

                    int id = sc.nextInt();

                    sc.nextLine(); // consume newline

                    System.out.print("Enter Student Name: ");

                    String name = sc.nextLine();

                    System.out.print("Enter Course: ");

                    String course = sc.nextLine();

                    studentController.addStudent(id, name, course);

                    System.out.println("Student Added Successfully!");

                    break;

                case 2: // READ

                    System.out.println("\n--- Student List ---");

                    studentController.viewStudents()

                            .forEach(System.out::println);

                    break;

                case 3: // UPDATE

                    System.out.print("Enter Student ID to Update: ");

                    int updateId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Name: ");

                    String newName = sc.nextLine();

                    System.out.print("Enter New Course: ");

                    String newCourse = sc.nextLine();

                    if (studentController.updateStudent(updateId, newName, newCourse)) {

                        System.out.println("Student Updated Successfully!");

                    } else {

                        System.out.println("Student Not Found!");

                    }

                    break;

                case 4: // DELETE

                    System.out.print("Enter Student ID to Delete: ");

                    int deleteId = sc.nextInt();

                    if (studentController.deleteStudent(deleteId)) {

                        System.out.println("Student Deleted Successfully!");

                    } else {

                        System.out.println("Student Not Found!");

                    }

                    break;

                case 5:

                    System.out.println("Exiting Application...");

                    break;

                default:

                    System.out.println("Invalid Choice!");

            }

        } while (choice != 5);

        sc.close();

    }

}
