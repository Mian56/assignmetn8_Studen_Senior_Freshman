
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) throws IllegalAccessException {
		 // ToDo 5: Fix the error

		Freshman std1= new Freshman("James", (short) 20, 12); // name, age, credits

		Student std2 = new Student("Wick", (short) 21);

		Senior std3 = new Senior("John", (short) 30, 90);

	 Scanner scanner = new Scanner(System.in);

	 //Ask input for freshman's Gpa
	 System.out.println("Enter freshman's Gpa: " + std1.getName());
	 double gpas1 = scanner.nextDouble();
	 std1.setGpa(gpas1);
	 System.out.println(std1);
	 System.out.println("");

	 // Ask input for student's Gpa
	 System.out.print("Enter student's Gpa: " + std2.getName());
	 double gpas2 = scanner.nextDouble();
	 std2.setGpa(gpas2);
	 System.out.println(std2);
	 System.out.println("");

	 // Ask input for senior's Gpa
	 System.out.print("Enter senior's Gpa: " + std3.getName());
	 double gpas3 = scanner.nextDouble();
	 std3.setGpa(gpas3);
	 System.out.println(std3);




	}

}

