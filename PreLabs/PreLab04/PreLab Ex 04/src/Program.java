/*
 * Student Name: Christopher Frosst
 * Lab Professor: David Houtman
 * Due Date: Mar 12 2024
 * Modified: Mar 10 2024
 * Description: PreLab 04

 * Description: */

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		GradingSystem gradingSystem = null;
		Scanner keyboard = new Scanner(System.in);
		String course = null;
		String grade = null;
		String report = null;

		System.out.print("Please enter course number: ");
		course = keyboard.nextLine();

		System.out.print("Please enter letter grade: ");
		grade = keyboard.nextLine();
		
		gradingSystem = new GradingSystem(course, grade);
		
		report = gradingSystem.createReport();
		
		System.out.println(report);
		// update the line below to include your name
		System.out.println("Program by Christopher Frosst");
		System.out.println();

	}
}



