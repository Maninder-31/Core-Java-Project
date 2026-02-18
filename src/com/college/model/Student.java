package com.college.model;

/*

 * Model class

 * Stores student data only


 */



public class Student{
	
	 // Instance variables (student attributes)


private int id;

private String name;

private String course;
// Parameterized constructor to initialize student object

public Student(int id, String name, String course) {

this.id = id;

this.name = name;

this.course = course;

}
//Getter methods (used to read data)

public int getId() { return id; }

public String getName() { return name; }

public String getCourse() { return course; }
// Setter methods (used to update data)

public void setName(String name) { this.name = name; }

public void setCourse(String course) { this.course = course; }
// Converts object data into readable string
@Override

public String toString() {

return "Student [ID=" + id + ", Name=" + name + ", Course=" + course + "]";

}

}

