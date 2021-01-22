public class YesNoDivide {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println((a%b == 0)?"Yes! The first number is divisible by the second without a remainder!":
                "No! The first number is not divisible by the second without a remainder!");

//        if (a%b == 0) {
//            System.out.println("Yes! The first number is divisible by the second without a remainder!");
//        } else {
//            System.out.println("No! The first number is not divisible by the second without a remainder!");
//        }
    }
}
