/*
 * Student Name: Christopher Frosst
 * Lab Professor: Professor David Houtman
 * Due Date: Mar 12 2024
 * Modified: Mar 12
 * Description: Lab Exercise 04

 * Description: A code that will determine the Time Zone
 * based on user input */

public class TimeZoneUtility {
	
	// TODO: Add additional static final constants corresponding to PST, MST, CST, and AST
	public static final int PST = 1;
	public static final int MST = 2;
	public static final int CST = 3;
	public static final int EST = 4;
	public static final int AST = 5;
	
	// NOTE: you must write complete if...else if statements; you cannot 'shortcut' by using
	// an equation to bypass the required code
	public static int getTimeZoneOffset(int zoneValue, boolean dstSet) {
		int offset = 0;
		if (zoneValue == EST) {
			offset = -5;
		} else if (zoneValue == PST) {
			offset = -8;
		} else if (zoneValue == MST) {
			offset = -7;
		} else if(zoneValue == CST){
			offset = -6;
		}else if(zoneValue == AST){
			offset = -4;
		}
		
		else
			offset = 0;

		if (dstSet)
			offset += 1;
		
		
		return offset;
	}
		
}
