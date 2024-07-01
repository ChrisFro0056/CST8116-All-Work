import java.util.Scanner;

public class TestLightbulb {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Lightbulb bulb1 = new Lightbulb(15,"E26");
        Lightbulb bulb2 = new Lightbulb(18, "E27");

        System.out.print("Did the first bulb work?: ");
        bulb1.setTestPassed(input.nextBoolean());
        System.out.print("Did the second bulb work?: ");
        bulb2.setTestPassed(input.nextBoolean());
        System.out.println(bulb1.toString());
        System.out.println(bulb2.toString());
        System.out.println("Program by Christopher Frosst");
    }
}
