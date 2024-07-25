package day4_comparisonOperators;

public class ExplicitCasting {
    public static void main(String[] args) {

    /*
    1. byte  -------------> 1 byte
    2. short -------------> 2 bytes
    3. int, float --------> 4 bytes
    4. long, double ------> 8 bytes
     */

        byte byteNum = 20;
        short shortNum = 20;
        int intNum = 20;
        long longNum = 20;
        float floatNum = 20;
        double doubleNum = 20;


        intNum = (int)longNum; // explicit casting
        shortNum = byteNum;    // implicit casting
        floatNum = shortNum;   // implicit casting
        intNum = (int)doubleNum; // explicit casting
        floatNum = longNum; // we don't know why
        doubleNum = longNum;
        longNum = (long)floatNum;


        doubleNum = 20;
        intNum = (int)(doubleNum / 3); // 6.6

        System.out.println(intNum);

        shortNum = 12 / 5;
        System.out.println(shortNum); // 2

        floatNum = (float) 12 / 5;
        System.out.println(floatNum); // 2.4

        doubleNum = (double) 12 / 5;
        System.out.println(doubleNum); // 2.4

        System.out.println((double) 14 / 5);

        System.out.println(8 / 3);          // 2
        System.out.println((double) 8 / 3); // 2.6666666666666665
        System.out.println((float) 8 / 3); //  2.6666667

        System.out.println(15 / 2); // 7
        System.out.println((double) 15 / 2); // 7.5
        System.out.println((float) 15 / 2); // 7.5

        System.out.println(5 / 3); // 1
        System.out.println((double) 5 / 3); // 1.6666666666666667
        System.out.println((float) 5 / 3); //  1.6666666

        /*
        6. Write a program that calculates the result of raising an integer,
        number12 to a power of number13, where number12 is 2 and number13is 5.
         */

        int number12 = 2;
        int number13 = 5;

        System.out.println(2 * 2 * 2 * 2 * 2);
        System.out.println(Math.pow(2, 5));
        System.out.println(Math.round(34.24234234));

        System.out.println(2 ^ 5);

        /*
        7. Write a program that calculates the average of
        three integers, number15, number16, and number17,
        where number15 is 10, number16 is 15, and number17 is 20.
         */

        int number15 = 10;
        int number16 = 15;
        int number17 = 20;

        int average = (number15 + number16 + number17) / 3;
        System.out.println(average); // 15

        String city1 = "milan";
        String city2 = "milan";

        System.out.println(city1.equals(city2));

        boolean b = city1.equals(city2);

        boolean c = city1 == city2;

        System.out.println(b);
        System.out.println(c);


    }
}
