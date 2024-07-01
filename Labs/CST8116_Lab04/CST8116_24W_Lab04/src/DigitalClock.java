/*
 * Student Name: Christopher Frosst
 * Lab Professor: Professor David Houtman
 * Due Date: Mar 12 2024
 * Modified: Mar 12
 * Description: Lab Exercise 04

 * Description: A code that will gather all information, get and setters
 * and format the output */

import java.time.Instant;
import java.time.ZoneOffset;

// NOTE: Add code to the TODO at bottom, but otherwise DO NOT alter this class.  

public class DigitalClock {
	private int GMThours;  // current GMT time hours; set in the constructor
	private int GMTminutes;
	private boolean isDSTSet;	// will be false by default
	private int zoneValue;  
	
	public DigitalClock() {
		// Note that when the clock is created, the time defaults to GMT.
		// Only by setting the zoneValue and DST will you generate the correct time
		// for that time zone.
		Instant instant = Instant.now();  // gets GMT
		this.GMThours = instant.atZone(ZoneOffset.UTC).getHour();  // GMT time hours
		this.GMTminutes = instant.atZone(ZoneOffset.UTC).getMinute(); // GMT time minutes
		this.zoneValue = TimeZoneUtility.EST;   // Pre-set to Eastern Standard Time
	}

	public int getHours() {
		int hours = (GMThours + TimeZoneUtility.getTimeZoneOffset(zoneValue, isDSTSet));
		return hours;
	}
		
	public int getMinutes() {return GMTminutes;}
	
	public boolean isDSTSet() {return isDSTSet;}
	public void setDSTSet(boolean isDSTSet) {this.isDSTSet = isDSTSet;}
	
	public int getZoneValue() {return zoneValue;}
	public void setZoneValue(int zoneValue) {this.zoneValue = zoneValue;}
	
	public String getAMPM() {
		String ampm = "";

		//returns A.M. if getHours < 12
		if(getHours() < 12){
			ampm = "A.M.";
			//returns P.M. if getHours >= 12
		} else if (getHours() >= 12){
			ampm = "P.M.";
		}

		
		return ampm;
	}
	
	public String toString() {
		String hours = String.format("%1d", getHours()%12);
		String minutes = String.format("%1d", getMinutes());
		return hours + ":" + minutes + " " + getAMPM();  // displays output as e.g. 12:57
	}
		
}
