// * Student Name: Christopher Frosst
// * Lab Professor: Professor David Houtman
// * Due Date: Feb 9 2024
// * Modified: Feb 7 2024
// * Description: Assignment 1

/* Description: A code that will tell the user how many bacteria
 * are present after a doubling time of 15 minutes*/

import java.util.Scanner;


public class assignment1 {
    public static int InputData(String userPrompt){
        Scanner input = new Scanner(System.in);
        System.out.print(userPrompt);
        int InputData = input.nextInt();
        input.nextLine(); // clean input buffer
        return InputData;
    }
    
    public static void main(String[] args){
petridish Info = new petridish();

Info.setBact(assignment1.InputData("Enter # of bacteria: "));

Info.setMin(assignment1.InputData("Enter # of minutes: "));

Info.setSec(assignment1.InputData("Enter # of seconds: "));

        double conversion = (double) (Info.getMin()*60+Info.getSec())/900;
        
Info.setTotal(conversion); //bact*(Math.pow(2, conversion))

System.out.printf("With a doubling time of 15 minutes, there is %.2f " +
        "bacteria with a time of %d minutes and %d seconds", Info.getTotal(), Info.getMin(), Info.getSec());

System.out.println("\nCode by Christopher Frosst");

    }
}
