package com.company;

public class Chapter3_Strings_PracticeSet {
    public static void main(String[] args) {

        //Problem 1 W.A.P to convert String to lowercase
        String name = "My name is Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        //Problem 2 W.A.P to replace spaces with underscores
        String name1 = "I am twenty five years old";
        name1 = name1.replace(" ", "_");
        System.out.println(name1);

        //Problem 3 W.A.P to fill in a letter template which looks like below
        //letter = "Dear<!name!>, Thanks a lot"
        //replace = <!name!> with a string (some name)
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Harry");
        System.out.println(letter);

        // Problem 4 W.A.P to detect double and triple space in a String
        String text = "This  String contains    double and   triple spaces";
        System.out.println(text.indexOf("  "));
        System.out.println(text.indexOf("   "));

        //Problem 5 W.A.P to format the following letter with escape sequence character
        //letter = "Dear Harry, This Java course is nice. Thanks"
        String  namee = "Dear Harry,\n\tThis Java course is nice.\n\tThanks";
        System.out.println(namee);

    }
}
