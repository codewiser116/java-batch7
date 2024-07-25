package day2_concatenation;

public class PracticeConcatenation {
    public static void main (String [] args){

        String firstName = "Bena";
        String lastName = "Doe";
        byte age = 28;
        boolean isMarried = true;
        boolean hasKids = false;
        String city = "New York";

        // John Doe lives in New York.
        System.out.println(firstName + " " + lastName + " lives in " + city);

        // John Doe is 35 years old.
        System.out.println(firstName + " " + lastName + " is " + age + " years old.");

        // Does John have kids? false
        System.out.println("Does " + firstName + " have kids? " + hasKids);

        // Is John married? true
        System.out.println("Is " + firstName + " married? " + isMarried);


        int a = 5;
        int b = 10;
        System.out.println(a + b); //15
        System.out.println("5" + b); //510
        System.out.println(a + "" + b);//510












    }
}
