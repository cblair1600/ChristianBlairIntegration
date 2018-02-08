import java.util.Scanner;

/* Christian Blair
*My project displays the skills I have learned
* and how they work 
*/
public class Main {

  public static void main(String[] args) {
    // sysout ctrl + space
    // ctrl + Shift + F to auto format everything
    System.out.println("Welcome to my Project!");
   
    /* Variables in Java store information that contain 
     * values and are assigned with their own data types
     */
    
    /* Java's built in data types, or primitive types include:
     * Int : 32 bit integer value      | Short: 16 bit integer value   
     * Char: any unicode character, '' | Boolean: True or false value
     * Float: single precision numbers | Double: Double precision numbers
     * Byte: 8 bit integer, can limit  | Long: 64 bit integer, wider than int  
     */
    System.out.println("Simple Arithmetic Examples");
    int x = 5;
    double y = 7.83;
        System.out.println("The value of X is " + x);
        System.out.println("X + Y will result in a double and is");
        System.out.println(x+y);
        System.out.println("What is the Y value?");
        //Add User Response
        
        // Boolean response for Is X greater than Y?
        System.out.println("    ");
        System.out.println("Is X greater than or equal to Y?");
        System.out.println(x >= y);
  }
  }
