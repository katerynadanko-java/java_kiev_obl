import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer number:");
        int integerNumber1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the second integer number:");
        int integerNumber2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the third integer number:");
        int integerNumber3 = Integer.parseInt(scanner.nextLine());

        System.out.println("Max value is: " + ((integerNumber1 > integerNumber2) &&
                (integerNumber1 > integerNumber3) ? integerNumber1 : (integerNumber2 > integerNumber1) &&
                (integerNumber2>integerNumber3) ?
                integerNumber2 : integerNumber3));
    }
}
