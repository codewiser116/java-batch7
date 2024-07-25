package day4_comparisonOperators;

public class PracticeComparison {
    public static void main (String [] args){
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        /*
        1 + 2 + 3 = 6
        1 * 2 * 3 = ?
        1 * 2 - 3 = ?
        1 % 2 + 3 = ?
        3 + 3 * 3 = ?
        2 - 1 * 2 * 2 % 2 = ?
         */
        int sum = num1 + num2 + num3;
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);

        sum = num1 * num2 * num3;
        System.out.println(num1 + " * " + num2 + " * " + num3 + " = " + sum);

        sum = num1 * num2 - num3;
        System.out.println(num1 + " * " + num2 + " - " + num3 + " = " + sum);

        sum = num1 % num2 + num3;
        System.out.println(num1 + " % " + num2 + " + " + num3 + " = " + sum);


        byte b1 = 125;
        byte b2 = 130 - 125;

        boolean isSame = b1 == b2;
        System.out.println(isSame); // false

        short sh1 = 55 / 2 * 3;
        short sh2 = (short)(sh1 * 1);
        System.out.println(sh1 != sh2); // false

        char ch1 = 'a'; // 97
        char ch2 = 'A'; // 65
        System.out.println(ch1 > ch2); // true
        System.out.println(ch1 == ch2); // false

        boolean apple = false;
        boolean banana = false;

        System.out.println(apple != banana); // false
        System.out.println(apple == banana); // true

        System.out.println(!true);

        boolean dana = !true;
        System.out.println(dana); // false









    }
}