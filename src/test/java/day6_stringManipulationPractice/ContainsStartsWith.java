package day6_stringManipulationPractice;

public class ContainsStartsWith {
    public static void main(String[] args) {
        String car = "Lexus";
        boolean b = car.contains("x");
        System.out.println(car.contains("x"));

        String country = "Australia";
        System.out.println(country.contains("Austria")); // false
        System.out.println(country.contains("australia")); // false
        System.out.println(country.contains("Australia ")); // false

        String password = "abc123!";
        boolean isCorrect = password.contains("4");
        System.out.println(isCorrect); // false
        System.out.println(password.contains("b")); // false


        String veggie = "potato";
        isCorrect = veggie.startsWith("v"); // false

        System.out.println("Codewise".endsWith("Code")); // false

        isCorrect = "Codewise".endsWith("se");


        String fruit = "banana";

        System.out.println(fruit + " 123".length()); // 10

        int a = fruit.length();

        short sh = (short)fruit.length();

        byte b1 = (byte)fruit.length();

        String banner = "    Welcome   to    USA!!!      ";
        System.out.println("banner before trim: " + banner.length());

        banner = banner.trim();
        System.out.println("banner after trim: " + banner.length());










    }
}
