package day6_stringManipulationPractice;

import java.sql.SQLOutput;

public class PracticeSubstring {
    public static void main(String[] args) {

        String title = "Egg Benedict";

        // String name = Benedict; use substring

        String name = title.substring(4);
        System.out.println(name);

        name = title.substring(title.indexOf("Bened"));
        System.out.println(name);

        String newTitle = "Poached " + title.substring(0, 3);
        System.out.println(newTitle);

        //========================================

        String song = "roses are rose, violets are blue";



        /*
        1. print "violets"
        2. print "roses"
        3. print "roses are blue"
        4. print "violets are rose"
         */
        System.out.println(song.substring(16, 23));
        System.out.println(song.substring( song.indexOf('v') ,23));

        int name1 = song.indexOf("roses");
        System.out.println(song.substring(name1, name1 + "roses".length()));

        String part1 = song.substring(0, 10); // roses are
        String part2 = song.substring(28); // blue

        System.out.println(part1 + part2);

//=====================================================

        part1 = song.substring(0, song.indexOf("rose,"));
        part2 = song.substring(song.indexOf("blue"));

        System.out.println(part1 + part2);


        String coding = "java is easy and fun";
        System.out.println(coding.substring(0, 4));
        int ind = coding.indexOf(" ");

        System.out.println(coding.substring(0, ind));

        ind = 5;
        System.out.println(coding.substring(ind, ind + 2));

        ind = coding.indexOf("easy");
        System.out.println(coding.substring(ind, coding.indexOf(" and")));



        // print "java"
        // print "is"
        // print "easy"
        // print "and"
        // print "fun"







    }


}
