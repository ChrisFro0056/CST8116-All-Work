import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fishnet fishnet = new Fishnet();
        System.out.print("Enter number of fish: ");
        int fish = input.nextInt();
        fishnet.setFishnumber(fish);
        System.out.printf("getFishNumber returns: %d", fishnet.getFishnumber());
        System.out.print("\nEnter estimated weight: ");
        double weight = input.nextDouble();
        fishnet.setAverageweightPerFish(weight);
        System.out.printf("\ngetAverageWeightPerFish returns: %.2f", fishnet.getAverageweightPerFish());

        System.out.printf("\nThe total estimated weight caught (in kg) is " + fishnet.total);
    }
}
