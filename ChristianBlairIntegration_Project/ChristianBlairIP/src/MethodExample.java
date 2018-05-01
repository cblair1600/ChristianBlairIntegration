// Christian Blair
// Here is an example of declaring and invoking a method. The method calculateArea was 
// created and then was invoked in the main MethodExample class. This method could now be used
// again in a different piece. 
public class MethodExample {
    public static void main(String[] args) {
        int length = 7;
        int width = 14;
        // Here the method is being used, called from its class.
        // Writing calculateArea invokes it and length/width the arguments
        System.out.println(calculateArea(length, width));
    }

    // double is the return type, calculateArea is the method name
    // and the parameters are within the parenthesis
    public static double calculateArea(int side1, int side2) {
        int area;
        area = side1 * side2;
        return area;
    }
}