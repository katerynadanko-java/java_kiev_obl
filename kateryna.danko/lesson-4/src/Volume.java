import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height of cylinder in mm:");
        int height = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the radius of cylinder in mm:");
        int radius = Integer.parseInt(scanner.nextLine());
         double volume = Math.PI * radius * radius * height;

        System.out.println("Precise  value of cylinder volume in mm3 is: " + volume + " mm3");
        System.out.println("Rounded volume of cylinder in m3 is: " + Math.round(volume/1_000_000_000) + " m3");
        System.out.println("Rounded volume of cylinder in l is: " + Math.round(volume/1_000_000) + " l");

    }
}
