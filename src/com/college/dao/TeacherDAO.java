
package com.college.dao;

import java.util.ArrayList;

import com.college.model.Teacher;

public class TeacherDAO {
	//list to store teachers 

    private ArrayList<Teacher> teachers = new ArrayList<>();
//add teacher 
    public void addTeacher(Teacher t) {

        teachers.add(t);

    }
//read
    public ArrayList<Teacher> getAllTeachers() {

        return teachers;

    }
//delete
    public boolean deleteTeacher(int id) {

        return teachers.removeIf(t -> t.getId() == id);

    }

}