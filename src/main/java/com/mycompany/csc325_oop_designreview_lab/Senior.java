package com.mycompany.csc325_oop_designreview_lab;

// Todo 7: Create two classes for com.mycompany.csc325_oop_designreview_lab.Freshman and Senior

public class Senior extends Student{

    // ToDo 8: The senior class should have a minimum of 85 credits

    private static final int minCredits = 85;

    private int credits;

    public Senior(String name, short age, int credits) throws IllegalAccessException {
        super(name, age);
        this.credits = credits;

        if(credits < minCredits){
            throw new IllegalAccessException("Seniors must have a minimum of " + minCredits +
                    "credits, " + "students has " + credits +  "credits.");
        }

    }

    // ToDo 11: Add a toString method for the Senior class

    @Override
    public String toString() {
        // informs about seniors credits
        if(credits >= 85) {
            System.out.println("Congratulations, senior " + getName() + " has "   + credits + " credits, these are " +
                    "more than the minimum required credits of " + minCredits + " to graduate!");
        }else{
            System.out.println("not enough credits");
        }
        return "Senior: " +
                "Name = " + getName() +
                ", Age = " + getAge() +
                ", GPA = " + getGpa() +
                ", Credits = " + credits;

    }
}
