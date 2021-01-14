import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double number1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the second number:");
        double number2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Sum of two numbers is: " + (number1+number2));

    }
}
