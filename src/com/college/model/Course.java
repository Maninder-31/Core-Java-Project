
package com.college.model;

public class Course {

    private int id;

    private String name;

    private int duration;

    public Course(int id, String name, int duration) {

        this.id = id;

        this.name = name;

        this.duration = duration;

    }

    public int getId() { return id; }

    public String getName() { return name; }

    public int getDuration() { return duration; }

    @Override

    public String toString() {

        return "Course [ID=" + id + ", Name=" + name + ", Duration=" + duration + " months]";

    }

}
