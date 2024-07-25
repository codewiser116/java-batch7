package day4_comparisonOperators;

public class IntroToComparisonOperators {
    public static void main (String [] args){

        System.out.println("10 < 5 ? " + (10 < 5)); // false
        System.out.println("10 <= 10 ? " + (10 <= 10)); // true
        System.out.println(20 > 10 + 5); // true

        int a = 100;
        int b = -100;

        boolean c = a >= b;
        System.out.println("c: " + c);

        boolean d = a == b + 100; // false
        System.out.println(d);

        /*
        create 5 booleans and print them
         */

        boolean b1 = 10 < 90-89;
        System.out.println("10 < 90-89 ==> " + b1);

        boolean b2 = true != false;
        System.out.println("true != false ===> " + b2);

        boolean b3 = (100 % 40) > (30 % 20);
        System.out.println("(100 % 40) > (30 % 20) ===> " + b3); // true

    }
}
