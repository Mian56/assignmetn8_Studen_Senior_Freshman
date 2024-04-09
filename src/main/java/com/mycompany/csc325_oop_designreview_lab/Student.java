/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */

// ToDo 1: Make this class a child of Human

public class Student extends Human{

    //store GPA of Student
    private double gpa;


    // ToDo 6: Fix the constructor of the Student class

    //constructor
    public Student(String name, short age) {
        super(name, age);
    }

    //getter
    @Override
    public String getAddress() {
        return null;
    }

    //setter
    @Override
    public void setAddress(String address) {

    }

	// ToDo 2: Fix the resulting errors


	// ToDo 3: Add a field for GPA and create a setter and a getter
    //setter for gpa
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    //getter for gpa
    public double getGpa(){
        return gpa;
    }

    // ToDo 9: Add a toString method for the Student class
    @Override
    public String toString() {
        return "Student " +
                "name=" + getName() + '\'' +
                ", age=" + getAge() +
                ", gpa=" + gpa;
    }

    //Student class is the child class of human. It has getter and setters for address which do not do anything.
    //it also has setters and getters for gpa as well which can be changed when creating objects

}
