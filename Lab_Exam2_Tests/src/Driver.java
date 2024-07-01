import java.util.Objects;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        int largeFish = 0;
        int mediumFish = 0;
        String fishCaught = "Enter the size of the fish caught (1 = Large, 2 = Medium";
        Scanner input = new Scanner(System.in);
        Fishnet fish = new Fishnet(largeFish, mediumFish);

        do{
           ;
            if (input.nextInt() == 1){
                fish.setLargeFishCount(input.nextInt());
            } else {
                fish.setMediumFishCount(input.nextInt());
            }

            System.out.println("Do you wish to exit? (Enter Y to exit, anything else to continue): ");


        } while(Objects.equals(input.next(), "Y"));

    }
}
