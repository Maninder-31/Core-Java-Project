
package com.college.controller;

import java.util.ArrayList;

import com.college.dao.TeacherDAO;

import com.college.model.Teacher;

public class TeacherController {
//DAO
    private TeacherDAO dao = new TeacherDAO();
//add
    public void addTeacher(int id, String name, String subject) {

        dao.addTeacher(new Teacher(id, name, subject));

    }

    public ArrayList<Teacher> viewTeachers() {

        return dao.getAllTeachers();

    }

    public boolean deleteTeacher(int id) {

        return dao.deleteTeacher(id);

    }

}
