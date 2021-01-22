public class Min {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a<=b&&a<=c){
            System.out.println("Min is: " + a);
        }
        if (b<=a&&b<=c){
            System.out.println("Min is: " + b);
        }
        if (c<=a&&c<=b) {
            System.out.println("Min is: " + c);
        }
    }
}
