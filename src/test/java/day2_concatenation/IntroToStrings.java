package day2_concatenation;

public class IntroToStrings {

    public static void main (String [] args){

        String str = new String("sf");

        /*
            HOW TO DECLARE A STRING?
         */

        String first_name;
        String last_name;

        /*
            HOW TO ASSIGN A VALUE?
         */

        first_name = "Bena";
        last_name = "Codewise";

        System.out.println(first_name);
        System.out.println(last_name);

        String full_name = first_name + " " + last_name;
        System.out.println(full_name);

        System.out.println(first_name + " " + last_name);

        // Hi! My name is YOURNAME! I'm

        System.out.println("Hi! My name is " + first_name + ". I am 28");

        String fruit1 = "pineapple";
        String fruit2 = "banana";
        String fruit3 = fruit1;

        System.out.println(fruit3); //apple

        // I love to eat apple
        System.out.println("I love to eat " + fruit3);

        // I love to eat apple and banana
        fruit3 = "apple";
        System.out.println("I love to eat " + fruit3 + " and " + fruit2);

        // I hate banana, but I love banana bread
        fruit2 = "orange";
        System.out.println("I hate " + fruit2 + ", but I love " + fruit2 + " bread");



    }

}
