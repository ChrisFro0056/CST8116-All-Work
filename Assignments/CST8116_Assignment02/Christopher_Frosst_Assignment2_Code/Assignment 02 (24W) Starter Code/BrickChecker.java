/*
 * Student Name: Christopher Frosst
 * Lab Professor: Professor David Houtman
 * Due Date: Mar 29 2024
 * Modified: Mar 27
 * Description: Assignment 2

 * Description: A code that will gather information from,
  user input and determine if the brick is within the standards. */


public class BrickChecker {

	public static final int EPSILON_LENGTH = 6;
	public static final int EPSILON_WIDTH = 4;
	public static final int EPSILON_HEIGHT = 3;


	public String validate(Brick brick) {


		String report;
		double lengthDiffer = Math.abs(brick.getLength() - Brick.EXPECTED_LENGTH);
		double widthDiffer = Math.abs(brick.getWidth() - Brick.EXPECTED_WIDTH);
		double heightDiffer = Math.abs(brick.getHeight() - Brick.EXPECTED_HEIGHT);

		if (lengthDiffer <= EPSILON_LENGTH && heightDiffer <= EPSILON_HEIGHT && widthDiffer <= EPSILON_WIDTH) {
			report = "Brick meets all standards!";
		}else if (brick.getHeight() <= 0){
			report = "Negative dimension detected, can not verify brick\n";
		}else if (brick.getWidth() <= 0){
			report = "Negative dimension detected, can not verify brick\n";
		}else if (brick.getLength() <= 0){
			report = "Negative dimension detected, can not verify brick\n";
		} else {
			report = "Brick does not meet all standards\n";
		}


			if (lengthDiffer > EPSILON_LENGTH) {
			report += ("Length exceeds tolerance of " + EPSILON_LENGTH + " millimeters\n");
			}
			if (widthDiffer > EPSILON_WIDTH) {
				report += ("Width exceeds tolerance of " + EPSILON_WIDTH + " millimeters\n");
			}
			if (heightDiffer > EPSILON_HEIGHT) {
				report += ("Height exceeds tolerance of " + EPSILON_HEIGHT + " millimeters\n");
			}

			return report;
		}
	}
