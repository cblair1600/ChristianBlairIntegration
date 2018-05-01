
// Christian Blair Checked exception handled
// This file contains class example of using try and catch blocks to handle 
// an input caused exception. Go ahead and try to divide two integers x and y
// as separate user inputs. Then try dividing by 0 or even a word
// The catch will tell you if it is an invalid value. 

import java.util.*;

public class ExceptionExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                int result = x / y;
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("java.lang.ArithmeticException: / by zero");
            }
        } catch (Exception e) {
            System.out.println("java.util.InputMismatchException");
        }
    }

}
