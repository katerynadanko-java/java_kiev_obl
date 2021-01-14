import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first leg:");
        double number1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the second lag:");
        double number2 = Double.parseDouble(scanner.nextLine());


        double hipo = Math.sqrt(Math.pow(number1, 2) +
                Math.pow(number2, 2));
        double hipo1 = Math.sqrt(number1 * number1 +
                number2 * number2);
        double hipo2 = Math.hypot(number1, number2);

        System.out.println("The hypotenuse is equals: " + hipo);
        System.out.println("Check 1. The hypotenuse is equals: " + hipo1);
        System.out.println("Check 2. The hypotenuse is equals: " + hipo2);
    }
}
