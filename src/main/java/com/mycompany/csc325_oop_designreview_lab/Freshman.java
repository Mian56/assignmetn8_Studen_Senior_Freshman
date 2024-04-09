package com.mycompany.csc325_oop_designreview_lab;

// Todo 7: Create two classes for com.mycompany.csc325_oop_designreview_lab.Freshman and Senior

public class Freshman extends Student{

    //new filed for credits
    private int credits;

    //freshman constructor
    public Freshman(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    //Stringto method for format
    @Override
    public String toString() {
        return "Freshman: " +
                "Name = " + getName() +
                ", Age = " + getAge() +
                ", GPA = " + getGpa() +
                ", Credits = " + credits;

    }


}
