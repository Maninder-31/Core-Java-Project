package com.college.dao;

import java.util.ArrayList;

import com.college.model.Student;


/* DAO class

* Performs CRUD operations

* Uses ArrayList as in-memory storage

*/


public class StudentDAO {
	// Stores student objects
    private ArrayList<Student> students = new ArrayList<>();
    // CREATE: Add student to list
    public void addStudent(Student s) {

        students.add(s);

    }
    

    public ArrayList<Student> getAllStudents() {

        return students;

    }
  //update
    public boolean updateStudent(int id, String name, String course) {

        for (Student s : students) {

            if (s.getId() == id) {

                s.setName(name);

                s.setCourse(course);

                return true;

            }

        }

        return false;

    }
//delete
    public boolean deleteStudent(int id) {

        return students.removeIf(s -> s.getId() == id);

    }

}


