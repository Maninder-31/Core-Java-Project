
package com.college.model;

public class Teacher {
//Teacher attributes
    private int id;

    private String name;

    private String subject;
    //constructor to initialize teacher object

    public Teacher(int id, String name, String subject) {

        this.id = id;

        this.name = name;

        this.subject = subject;

    }
//getter methods
    public int getId() { return id; }

    public String getName() { return name; }

    public String getSubject() { return subject; }
//setter methods 
    public void setName(String name) { this.name = name; }

    public void setSubject(String subject) { this.subject = subject; }
//returns teacher details in readable format
    @Override

    public String toString() {

        return "Teacher [ID=" + id + ", Name=" + name + ", Subject=" + subject + "]";

    }

}