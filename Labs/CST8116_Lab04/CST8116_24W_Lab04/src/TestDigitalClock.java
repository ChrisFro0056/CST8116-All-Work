/*
 * Student Name: Christopher Frosst
 * Lab Professor: Professor David Houtman
 * Due Date: Mar 12 2024
 * Modified: Mar 12
 * Description: Lab Exercise 04

 * Description: A code that will take user input and
 * output */

import java.util.Scanner;

public class TestDigitalClock {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Creating a new Digital Clock object");
		DigitalClock clock1 = new DigitalClock();
		
		System.out.print("Enter zone value (1 - 6) : ");
		int zoneValue = input.nextInt();
		clock1.setZoneValue(zoneValue);
		
		System.out.print("Set DST? (enter yes or no: )");
		String response = input.next();
		
		clock1.setDSTSet(response.equalsIgnoreCase("yes"));
		
		System.out.println("The current time set for this clock is: " + clock1.toString());
		System.out.println("Program by Christopher Frosst");
	}

}
