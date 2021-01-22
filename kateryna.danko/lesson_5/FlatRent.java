public class FlatRent {
    public static void main(String[] args) {

        int a = 40;
        int b = Integer.parseInt(args[0]);

        if (b<=0){
            System.out.println("The number can`t be negative or 0! Please enter positive number and try again!");
        }
        if ((b>0)&&(b<5)) {
            int res = a*b;
            System.out.println("The FlatRent without discount is: " + res);
        }
        if ((b>=5)&&(b<7)) {
            int res = (a * b) - 20;
            System.out.println("The FlatRent with 20$ discount is: " + res);
        }
        if (b>=7) {
            int res = (a*b)-50;
            System.out.println("The FlatRent with 50$ discount is: " + res);
        }
    }
}
