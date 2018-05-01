import java.util.Scanner;

/* Christian Blair
My project displays the skills I have learned
and how they work, There are several files that depict different skills
Some relate and others are standalone. I suggest using ctrl + f to find 
specific things!
*/

public class Main {

    private static Scanner input;

    // Static belongs to a class and not an object
    public static void main(String[] args) {
        input = new Scanner(System.in);
        // Name input and Hello using parameters
        Player player1 = new Player();
        System.out.println("Enter your name here: ");
        String name = input.nextLine();

        player1.simpleMessage(name);

        // sysout ctrl + space
        // ctrl + Shift + F to auto format everything
        String greeting = "welcome to my project!";
        String greeting2 = greeting.toUpperCase();
        System.out.println(greeting2);

        /*
         * Variables in Java store information that contain values and are
         * assigned with their own data types
         */

        /*
         * Java's built in data types, or primitive types include: Int : 32 bit
         * integer values, Short: 16 bit integer value, Char: any unicode
         * character, '', Boolean: True or false value, Float: single precision
         * numbers, Double: Double precision numbers, Byte: 8 bit integer, can
         * limit, Long: 64 bit integer,wider than int
         */
        System.out.println("Arithmetic Quiz");

        // Quiz Questions and Response titles
        String Q1 = "1. What is the weight of the added bananas?";
        String R1 = Q1.substring(15, 22);
        String Q2 = "2. True or False, The apples weight is greater than or equal to bananas";
        String R2 = Q2.substring(18, 70);
        String Q3 = "3. If a number is the (int) of the bananas weight, what is that number divided by the apples weight?";
        String R3 = Q3.substring(64, 99);
        int apples = 7 - 2;
        double bananas = 7.83 * 2;
        // Casting Example
        double bananas2 = (int) bananas;
        System.out.println(
                "There are " + apples + " pounds of apples on a scale");
        System.out
                .println("Then someone adds a few bananas, making the weight ");
        System.out.println(apples + bananas);
        System.out.println(Q1);
        // User Response
        String line = input.nextLine();
        System.out.println(R1 + ": " + line);
        System.out.println("  ");

        // Boolean response for Is X greater than Y?
        System.out.println(Q2);
        String line2 = input.nextLine();
        System.out.println(R2 + ": " + line2);
        System.out.println("  ");

        System.out.println(Q3);
        String line3 = input.nextLine();
        System.out.println(R3 + ": " + line3);

        // Answer Key/ Code to Display Answers
        // Also Use of get/set/constructors from Answers class
        Answers answer1 = new Answers();
        answer1.setAnswer(15.66);
        Answers answer2 = new Answers();
        answer2.setTruefalse(apples >= bananas);
        Answers answer3 = new Answers();
        answer3.setAnswer(bananas2 / apples);
        System.out.println("   ");

        System.out.println("Thanks for playing " + name
                + "! Now check your answers below!");
        System.out.println("Question 1");
        answer1.speak();
        System.out.println("Question 2");
        answer2.speak2();
        System.out.println("Question 3");
        answer3.speak();
        // In future plan to add user answer next to real answer
        System.out.println(" ");
        System.out.println(
                "Would you like to view the string builder example, creating a number of ip addresses?");
        String response = input.next();

        if (response.equals("yes"))
            new StrBuilder().doSB();

        else if (response.equals("no")) {
            System.out.println("Okay, Goodbye");
        } else {
            System.out.println("Your input is incorrect, retry with yes or no");
        }
    }
}
