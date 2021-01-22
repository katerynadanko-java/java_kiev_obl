public class Tip {
    public static void main(String[] args) {

        double a = Double.parseDouble(args[0]);
        String s = args[1];

        if (s.equals("terrible")){
            double res = 0;
            System.out.println("The amount of money you have to leave is 0%, it`s: " + res);
        }
        if (s.equals("poor")){
            double res = a*5/100;
            System.out.println("The amount of money you have to leave is 5%, it`s: " + res);
        }
        if (s.equals("good")){
            double res = a*10/100;
            System.out.println("The amount of money you have to leave is 10%, it`s:  " + res);
        }
        if (s.equals("great")){
            double res = a*15/100;
            System.out.println("The amount of money you have to leave is 15%, it`s:  " + res);
        }
        if (s.equals("excellent")){
            double res = a*20/100;
            System.out.println("The amount of money you have to leave is 20%, it`s:  " + res);
        }
    }
}
