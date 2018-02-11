import java.util.Scanner;

/* Christian Blair
My project displays the skills I have learned
and how they work 
*/

public class Main {

	private static Scanner input;

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
		 * Variables in Java store information that contain values and are assigned with
		 * their own data types
		 */

		/*
		 * Java's built in data types, or primitive types include: Int : 32 bit integer
		 * values, Short: 16 bit integer value, Char: any unicode character, '',
		 * Boolean: True or false value, Float: single precision numbers, Double: Double
		 * precision numbers, Byte: 8 bit integer, can limit, Long: 64 bit integer,wider
		 * than int
		 */
		System.out.println("Simple Arithmetic Quiz");
		// Quiz Questions and Response titles
		String Q1 = "1. What is the Y value?";
		String R1 = Q1.substring(15, 22);
		String Q2 = "2. True or False, X is greater than or equal to Y";
		String R2 = Q2.substring(18, 49);
		String Q3 = "3. If Z is the (int) of Y, what is Z divided by X?";
		String R3 = Q3.substring(35, 49);
		int x = 7 - 2;
		double y = 7.83 * 2;
		// Casting Example
		double z = (int) y;
		System.out.println("The value of X is " + x);
		System.out.println("X + Y will result in the following number");
		System.out.println(x + y);
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
		Answers answer1 = new Answers();
		answer1.answer = 15.66;
		Answers answer2 = new Answers();
		answer2.truefalse = (x >= y);
		Answers answer3 = new Answers();
		answer3.answer = z / x;
		System.out.println("   ");
		
		System.out.println("Thanks for playing " + name +"! Now check your answers below!");
		System.out.println("Question 1");
		answer1.speak();
		System.out.println("Question 2");
		answer2.speak2();
		System.out.println("Question 3");
		answer3.speak();
		// In future plan to add user answer next to real answer
		
		
	}
}
