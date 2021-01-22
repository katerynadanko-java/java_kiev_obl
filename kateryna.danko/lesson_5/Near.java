public class Near {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int res1 = Math.abs(10-a);
        int res2 = Math.abs(10-b);

        if (res1<res2){
            System.out.println("The nearest number to 10 is: " + a);
        }
        if (res1>res2){
            System.out.println("The nearest number to 10 is: " + b);
        }
        if (res1==res2){
            System.out.println("The nearest number to 10 are both: " + a + " and " + b);
        }
    }
}
