import java.util.Scanner;

public class Drink {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the quantity of people:");
        int quantityOfPeople = Integer.parseInt(scanner.nextLine());

        double quantityOfBottle = (100*(double)quantityOfPeople)/750;
        double restOfChampagne = (Math.ceil(quantityOfBottle)*750)%(100*(double)quantityOfPeople);

        System.out.println("You need " + Math.ceil(quantityOfBottle) + " bottle of Champagne!");
        System.out.println("You will have " + restOfChampagne + " ml rest of champagne!");
        System.out.println(restOfChampagne > 400 ? "It`s to much rest!" : "The rest of the champagne is ok!");

    }
}
