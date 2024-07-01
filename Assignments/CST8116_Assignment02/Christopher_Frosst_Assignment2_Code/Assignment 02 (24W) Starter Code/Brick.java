/*
 * Student Name: David Haley
 * Lab Professor: Professor David Haley
 * Due Date: The due date
 * Description: Assignment 02 (24W) Sample Solution
 */ 
 
/* This class models bricks with fields for length, width and height
 * measured in millimeter (mm). Note that a typical brick have Declared
 * Sizes (dimensions) of 215 mm x 102 mm x 65 mm, but bricks will deviate
 * from these values because of the baking and cooling processes. 
 * Constants are provided for these Declared Sizes of bricks
 */
public class Brick {
	// Declared Sizes for the length, width and height of bricks,
	// all measured in millimetres (mm).
	public static final double EXPECTED_LENGTH = 215.0; 
	public static final double EXPECTED_WIDTH = 102.0;
	public static final double EXPECTED_HEIGHT = 65.0;

	private double length; 	// Measured length in millimetres
	private double width; 	// Measured width in millimetres
	private double height; 	// Measured height in millimetres
	
	/*
	 * No-argument constructor, sets dimensions to
	 * 215 mm x 102 mm x 65 mm
	 */
	public Brick() {
		this(EXPECTED_LENGTH,EXPECTED_WIDTH, EXPECTED_HEIGHT); 
	}
	
	/*
	 * Overloaded constructor, sets dimensions as specified. The parameters
	 * are ordered from left to right as 
	 * (double height, double width, double length)
	 */
	public Brick(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	/*
	 * Accessor for length, uses millimetres as unit of measure
	 */
	public double getLength() {
		return length;
	}

	/*
	 * Mutator for length, uses millimetres as unit of measure
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/*
	 * Accessor for width, uses millimetres as unit of measure
	 */
	public double getWidth() {
		return width;
	}

	/*
	 * Mutator for width, uses millimetres as unit of measure
	 */
	public void setWidth(double width) {
		this.width = width;
	}	
		
	/*
	 * Accessor for height, uses millimetres as unit of measure
	 */
	public double getHeight() {
		return height;
	}

	/*
	 * Mutator for height, uses millimetres as unit of measure
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/*
	 * Returns a String that represents the data held within this object.
	 */
	public String toString() {
		String formatString;
		String result;
		
		formatString = "%s: length %.4f, width %.4f, height %.4f";
	    result = String.format(formatString, 
				"\nBrick", length, width, height);
	    
		return result;
	}
}
