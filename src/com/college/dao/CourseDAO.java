
package com.college.dao;

import java.util.ArrayList;

import com.college.model.Course;

public class CourseDAO {

    private ArrayList<Course> courses = new ArrayList<>();

    public void addCourse(Course c) {

        courses.add(c);

    }

    public ArrayList<Course> getAllCourses() {

        return courses;

    }

}
