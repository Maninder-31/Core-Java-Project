
package com.college.controller;

import java.util.ArrayList;

import com.college.dao.CourseDAO;

import com.college.model.Course;

public class CourseController {

    private CourseDAO dao = new CourseDAO();

    public void addCourse(int id, String name, int duration) {

        dao.addCourse(new Course(id, name, duration));

    }

    public ArrayList<Course> viewCourses() {

        return dao.getAllCourses();

    }

}
