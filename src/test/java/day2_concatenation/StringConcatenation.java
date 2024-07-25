package day2_concatenation;

public class StringConcatenation {
    public static void main (String [] args){

        int a = 20;
        int b = 5;

        String word = "";

        System.out.println(a + b);
        System.out.println("The sum is: " + a + b); // The sum is 205
        System.out.println("The sum is: " + (a + b)); // The sum is 25

        System.out.println(a + b + " is the sum"); // 25 is the sum

        System.out.println("10" + (20 + 5)); // 1025
        System.out.println(10 + 5 + "100"); // 15100
        System.out.println(10 + 5 + "100" + 80); // 1510080
        System.out.println("100" + (20 + 40)); // 10060
        System.out.println("500" + (30 + 25) + 20); //5005520

        a = 100;
        b = a - 10;
        System.out.println(b + 10); // 100
        System.out.println(b + 10 + "%"); // 100%
        System.out.println("%" + b + 10); // %9010


        String product = "cheese";
        double price = 6.99;

        // cheese is 6.99 per pound
        System.out.println(product + " is " + price + " per lb");

        // cheese is 4.99 per pound
        System.out.println(product + " is " + (price - 2) + " per lb");

        // calculate the price for 100 lb
        // 100 lb of cheese is 499.00 lb
        System.out.println("100 lb of " + product + " is " + ((price - 2) * 100) );

















    }
}
