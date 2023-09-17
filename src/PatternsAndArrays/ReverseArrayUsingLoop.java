package PatternsAndArrays;
/**
 * Write a program to reverse an array of elements using loop .
 *
 * Example 1:
 *
 * Input: arr = [1,2,3]
 * Output: [3,2,1]*/
public class ReverseArrayUsingLoop {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        reverseArray(arr);
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArray[arr.length - 1 - i] = arr[i];
        }

        return reversedArray;
    }
}
