//Christian Blair
// Within this class I find the smallest value in an Array and get the sum of
// its values. And also find index of an element.

public class ArrayExample {

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50, 25 };
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }

        System.out.println("This is the smallest value " + smallest);
    }

    // This code will find the sum of the array
    int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i <= array.length; i++) {
            sum = sum + array[i];
        }

        return sum;

    }

    // Finally, this code would return the index of a specific value.
    public static int find(int[] array, int target) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == target)
                return i;

        return -1;
    }
}
