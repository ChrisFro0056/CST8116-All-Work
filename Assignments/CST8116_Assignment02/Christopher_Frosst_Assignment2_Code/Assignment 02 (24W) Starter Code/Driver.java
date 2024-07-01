/*
 * Student Name: Christopher Frosst
 * Lab Professor: Professor David Houtman
 * Due Date: Mar 29 2024
 * Modified: Mar 27
 * Description: Assignment 2

 * Description: A code that will gather all user input and,
 repeat the code if the user wants to
 */

import java.util.Objects;

public class Driver {

	public static void main(String[] args) {
		BrickChecker brickChecker = new BrickChecker();
		Brick brick = new Brick();
		double length;
		double width;
		double height;

		// (other variables as needed)
		String answer;
		do {
			System.out.println("Enter Brick Dimensions noting that declared Sizes are: \n" + Brick.EXPECTED_LENGTH + " for length, " +
					Brick.EXPECTED_WIDTH + " for width, " + Brick.EXPECTED_HEIGHT + " for height.");


				length = User.inputDouble("\nEnter measured length (millimeters): ");
				brick.setLength(length);
				width = User.inputDouble("Enter measured width (millimeters): ");
				brick.setWidth(width);
				height = User.inputDouble("Enter measured height (millimeters): ");
				brick.setHeight(height);


			System.out.println(Objects.toString(brick));

			System.out.println(brickChecker.validate(brick));
			System.out.println("Program by Christopher Frosst");
			answer = User.inputString("\nContinue Program? (Yes / No)");
			System.out.println(answer);

		} while (answer.equalsIgnoreCase("yes"));

		if (answer.equalsIgnoreCase("no")) {
			System.out.println("Exiting Program");
		}


	}
}




