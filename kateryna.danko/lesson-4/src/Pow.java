import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer number (try 5):");
        int integerNumber1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the second integer number (try 2):");
        int integerNumber2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the third integer number (try 8):");
        int integerNumber3 = Integer.parseInt(scanner.nextLine());

//        int pow = (int)Math.pow(integerNumber1,integerNumber2);
//        String stringPow = Integer.toString(pow);
//
//        System.out.println(pow);
//        System.out.println(stringPow);

//        int number = Integer.parseInt(stringPow, integerNumber3);

        System.out.println("Raised the first number to the power of the second number and deduced in the " +
                "number system entered by the third number " +
                Integer.parseInt(Integer.toString((int)Math.pow(integerNumber1,
                integerNumber2)), integerNumber3));
    }
}
