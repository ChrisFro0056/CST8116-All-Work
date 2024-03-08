/*
 * Student Name: Christopher Frosst
 * Lab Professor: Professor David Houtman
 * Due Date: Feb 11 2024
 * Modified: Feb 7 2024
 * Description: Assignment 1

 * Description: A code that initiates the calculation
* for the petridish */

public class Petridish {
        int bact;
        int min;
        int secs;

    public void setBact(int bact) {
        this.bact = bact;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSecs(int secs) {
        this.secs = secs;
    }

    public void calculations(int bact){
        double totalSeconds = (double) ((min * 60) + secs)/900;
        double bactCalc = bact * Math.pow(2, totalSeconds);
            System.out.printf("With a doubling time of 15 minutes, there is %.2f bacteria!", bactCalc);
            System.out.println("\nProgram by Chris Frosst");

    }
}
