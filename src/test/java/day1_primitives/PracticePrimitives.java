package day1_primitives;

public class PracticePrimitives {
    public static void main (String [] args){
        /*
        Create 3 variables for each data type
        and print the value each time
         */

        byte apple = 100;
        System.out.println(apple);

        apple = (byte)(apple - 10);
        System.out.println(apple);

        byte apple2 = apple;
        System.out.println(apple2); //90

        byte apple3 = -128;
        apple3 = 30;
        System.out.println(apple3);



        short orange1 = 200;
        System.out.println(orange1);
        orange1 = 500 - 250;
        System.out.println(orange1);


        short orange2 = 100;
        System.out.println(orange2);
        orange2 = 20 * 10;
        System.out.println(orange2);


        short orange3 = 1000;
        orange3 = (short)(orange2 + orange1);
        System.out.println(orange3);


        int number1 = 90 + 1100;
        number1 = 500;
        number1 = 90000;
        number1 = 10000 / 10;
        number1 = number1 * 5;
        System.out.println(number1);


        int number2 = number1 - 20;
        System.out.println(number2);












    }
}
