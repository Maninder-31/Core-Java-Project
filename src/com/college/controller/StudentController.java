
package com.college.controller;

import java.util.ArrayList;

import com.college.dao.StudentDAO;

import com.college.model.Student;


/*
* Controller class
* Acts as bridge between MainApp and DAO

*/

public class StudentController {
//DAO object
    private StudentDAO dao = new StudentDAO();
 // Calls DAO to add student
    public void addStudent(int id, String name, String course) {

        dao.addStudent(new Student(id, name, course));

    }
    
    // Calls DAO to fetch students
    public ArrayList<Student> viewStudents() {

        return dao.getAllStudents();

    }
    // Calls DAO to update student
    public boolean updateStudent(int id, String name, String course) {

        return dao.updateStudent(id, name, course);

    }
    // Calls DAO to delete student
    public boolean deleteStudent(int id) {

        return dao.deleteStudent(id);

    }

}
