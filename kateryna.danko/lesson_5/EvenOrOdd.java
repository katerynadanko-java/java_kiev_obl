public class EvenOrOdd {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        System.out.println((a%2 == 0)?"Number you entered " + a +
                " is even!":"Number you entered " + a + " is odd!");


//        if (a%2 == 0){
//            System.out.println("Number you entered " + a + " is even!");
//        } else {
//            System.out.println("Number you entered " + a + " is odd!");
//        }
    }
}
