public class Calc {
        public static void main(String[] args) {

            int a = Integer.parseInt(args[0]);
            String s = args[1];
            int b = Integer.parseInt(args[2]);

            if (s.equals("+")){
                int res = a+b;
                System.out.println("The result of additions is: " + res);
            }
            if (s.equals("-")){
                int res = a-b;
                System.out.println("The result of subtraction is: " + res);
            }
            if (s.equals("x")){
                int res = a*b;
                System.out.println("The result of multiplication is: " + res);
            }
            if (s.equals(":")){
                double res = (double) a/(double) b;
                System.out.println("The result of division is: " + res);
            }
            if (s.equals("%")){
                int res = a%b;
                System.out.println("The result of remainder of the division is: " + res);
            }
            if (s.equals("mod")){
                int res = (a < 0) ? -a : a;;
                System.out.println("The result of module of the first number is: " + res);
            }
        }
}
