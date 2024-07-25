package day6_stringManipulationPractice;

public class TrimEquals {
    public static void main(String[] args) {

        /*
        trim() is the method which removes whitespaces
        from the beginning and from the end of String
         */

        String city = "Chicago  ";

        String trimmedCity = city.trim();

        String flower = "  roses are   rose  ";
        System.out.println(flower);
        System.out.println(flower.trim());


        /*
        equals() is the method which checks if values or 2 strings are equal
        equalIgnoreCase() is the method which checks if the values of 2 string
        are equal by ignoring the lower or upper case
         */

        String fullName = "John Doe";
        System.out.println(fullName.equals("john Doe")); //false
        System.out.println(fullName.equalsIgnoreCase("john DOE")); //true


        String affirmation = "I have a full time forever high paying job";

        System.out.println(affirmation.charAt(3)); //a
        System.out.println(affirmation.indexOf("a ful"));

        /*
        get the index of f
         */
        System.out.println(affirmation.indexOf("f"));

        int result1 = affirmation.indexOf("f");
        System.out.println(result1);

        System.out.println(affirmation.charAt(result1));






    }
}
