/*
 * Student Name: Christopher Frosst
 * Lab Professor: Professor David Houtman
 * Due Date: Feb 11 2024
 * Modified: Feb 7 2024
 * Description: Assignment 1

 * Description: A code that will tell the user how many bacteria
 are present after a doubling time of 15 minutes */

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {

Scanner input = new Scanner(System.in);
Petridish calcs = new Petridish();

		System.out.println("Enter number of bacteria: ");
		calcs.setBact(input.nextInt());
		System.out.println("Enter number of minutes: ");
		calcs.setMin(input.nextInt());
		System.out.println("Enter number of seconds: ");
		calcs.setSecs(input.nextInt());

				calcs.calculations(calcs.bact);


    }
}

